/*
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 2002 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Apache" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */
package net.sf.cglib.reflect;

import java.lang.reflect.*;
import net.sf.cglib.*;
import net.sf.cglib.core.*;
import org.objectweb.asm.ClassVisitor;

// TODO: don't require exact match for return type

/**
 * <b>DOCUMENTATION FROM APACHE AVALON DELEGATE CLASS</b>
 *
 * <p>
 * Delegates are a typesafe pointer to another method.  Since Java does not
 * have language support for such a construct, this utility will construct
 * a proxy that forwards method calls to any method with the same signature.
 * This utility is inspired in part by the C# delegate mechanism.  We
 * implemented it in a Java-centric manner.
 * </p>
 *
 * <h2>Delegate</h2>
 * <p>
 *   Any interface with one method can become the interface for a delegate.
 *   Consider the example below:
 * </p>
 *
 * <pre>
 *   public interface MainDelegate {
 *       int main(String[] args);
 *   }
 * </pre>
 *
 * <p>
 *   The interface above is an example of an interface that can become a
 *   delegate.  It has only one method, and the interface is public.  In
 *   order to create a delegate for that method, all we have to do is
 *   call <code>MethodDelegate.create(this, "alternateMain", MainDelegate.class)</code>.
 *   The following program will show how to use it:
 * </p>
 *
 * <pre>
 *   public class Main {
 *       public static int main( String[] args ) {
 *           Main newMain = new Main();
 *           MainDelegate start = (MainDelegate)
 *               MethodDelegate.create(newMain, "alternateMain", MainDelegate.class);
 *           return start.main( args );
 *       }
 *
 *       public int alternateMain( String[] args ) {
 *           for (int i = 0; i < args.length; i++) {
 *               System.out.println( args[i] );
 *           }
 *           return args.length;
 *       }
 *   }
 * </pre>
 *
 * <p>
 *   By themselves, delegates don't do much.  Their true power lies in the fact that
 *   they can be treated like objects, and passed to other methods.  In fact that is
 *   one of the key building blocks of building Intelligent Agents which in tern are
 *   the foundation of artificial intelligence.  In the above program, we could have
 *   easily created the delegate to match the static <code>main</code> method by
 *   substituting the delegate creation call with this:
 *   <code>MethodDelegate.createStatic(getClass(), "main", MainDelegate.class)</code>.
 * </p>
 * <p>
 *   Another key use for Delegates is to register event listeners.  It is much easier
 *   to have all the code for your events separated out into methods instead of individual
 *   classes.  One of the ways Java gets around that is to create anonymous classes.
 *   They are particularly troublesome because many Debuggers do not know what to do
 *   with them.  Anonymous classes tend to duplicate alot of code as well.  We can
 *   use any interface with one declared method to forward events to any method that
 *   matches the signature (although the method name can be different).
 * </p>
 *
 * <h3>Equality</h3>
 *  The criteria that we use to test if two delegates are equal are:
 *   <ul>
 *     <li>
 *       They both refer to the same instance.  That is, the <code>instance</code>
 *       parameter passed to the newDelegate method was the same for both. The
 *       instances are compared with the identity equality operator, <code>==</code>.
 *     </li>
 *     <li>They refer to the same method as resolved by <code>Method.equals</code>.</li>
 *   </ul>
 *
 * @version $Id: MethodDelegate.java,v 1.3 2003/09/15 17:25:32 herbyderby Exp $
 */
abstract public class MethodDelegate {
    private static final MethodDelegateKey KEY_FACTORY =
      (MethodDelegateKey)KeyFactory.create(MethodDelegateKey.class);

    protected Object target;
    protected String eqMethod;

    interface MethodDelegateKey {
        Object newInstance(Class delegateClass, String methodName, Class iface);
    }

    public static MethodDelegate createStatic(Class targetClass, String methodName, Class iface) {
        Generator gen = new Generator();
        gen.setTargetClass(targetClass);
        gen.setMethodName(methodName);
        gen.setInterface(iface);
        return gen.create();
    }

    public static MethodDelegate create(Object target, String methodName, Class iface) {
        Generator gen = new Generator();
        gen.setTarget(target);
        gen.setMethodName(methodName);
        gen.setInterface(iface);
        return gen.create();
    }

    public boolean equals(Object obj) {
        MethodDelegate other = (MethodDelegate)obj;
        return target == other.target && eqMethod.equals(other.eqMethod);
    }

    public int hashCode() {
        return target.hashCode() ^ eqMethod.hashCode();
    }

    public Object getTarget() {
        return target;
    }

    abstract protected Object newInstance(Object target);

    public static class Generator extends AbstractClassGenerator {
        private static final Source SOURCE = new Source(MethodDelegate.class, true);
        private static final Method NEW_INSTANCE =
          ReflectUtils.findMethod("MethodDelegate.newInstance(Object)");
        
        private Object target;
        private Class targetClass;
        private String methodName;
        private Class iface;
        
        public Generator() {
            super(SOURCE);
        }

        public void setTarget(Object target) {
            this.target = target;
            this.targetClass = target.getClass();
        }

        public void setTargetClass(Class targetClass) {
            this.targetClass = targetClass;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public void setInterface(Class iface) {
            this.iface = iface;
        }

        public MethodDelegate create() {
            Object key = KEY_FACTORY.newInstance(targetClass, methodName, iface);
            return (MethodDelegate)super.create(key);
        }

        protected Object firstInstance(Class type) {
            return ((MethodDelegate)ReflectUtils.newInstance(type)).newInstance(target);
        }

        protected Object nextInstance(Object instance) {
            return ((MethodDelegate)instance).newInstance(target);
        }

        public void generateClass(ClassVisitor v) throws NoSuchFieldException {
            setNamePrefix(targetClass.getName());
            
            Method proxy, method;
            try {
                proxy = ReflectUtils.findInterfaceMethod(iface);
                method = targetClass.getMethod(methodName, proxy.getParameterTypes());
                if (!proxy.getReturnType().isAssignableFrom(method.getReturnType())) {
                    throw new IllegalArgumentException("incompatible return types");
                }
            } catch (NoSuchMethodException e) {
                throw new CodeGenerationException(e);
            }

            boolean isStatic = Modifier.isStatic(method.getModifiers());
            if ((target == null) ^ isStatic) {
                throw new IllegalArgumentException("Static method " + (isStatic ? "not " : "") + "expected");
            }

            Emitter e = new Emitter(v);
            e.begin_class(Modifier.PUBLIC, getClassName(), MethodDelegate.class, new Class[]{ iface });
            e.declare_field(Constants.PRIVATE_FINAL_STATIC, String.class, "eqMethod");
            Virt.null_constructor(e);

            // generate proxied method
            e.begin_method(iface.getDeclaredMethods()[0]);
            e.load_this();
            e.super_getfield("target");
            e.checkcast(method.getDeclaringClass());
            e.load_args();
            e.invoke(method);
            e.return_value();
            e.end_method();

            // newInstance
            e.begin_method(NEW_INSTANCE);
            e.new_instance_this();
            e.dup();
            e.dup2();
            e.invoke_constructor_this();
            e.getfield("eqMethod");
            e.super_putfield("eqMethod");
            e.load_arg(0);
            e.super_putfield("target");
            e.return_value();
            e.end_method();

            // static initializer
            e.begin_static();
            e.push(method.getName() + ReflectUtils.getMethodDescriptor(method));
            e.putfield("eqMethod");
            e.return_value();
            e.end_method();
            
            e.end_class();
        }
    }
}