package learn1.generatedclasses.testMethodInterceptor;

/**
 * Created by rxiao on 5/7/15.
 */
import java.lang.reflect.Method;

import learn1.SampleClass;
import net.sf.cglib.core.ReflectUtils;
import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.*;

public class SampleClass$$EnhancerByCGLIB$$b256b7f1
        extends SampleClass
        implements Factory
{
    private boolean CGLIB$BOUND;
    private static  ThreadLocal CGLIB$THREAD_CALLBACKS;
    private static  Callback[] CGLIB$STATIC_CALLBACKS;
    private MethodInterceptor CGLIB$CALLBACK_0;
    private static  Method CGLIB$test$0$Method;
    private static  MethodProxy CGLIB$test$0$Proxy;
    private static  Object[] CGLIB$emptyArgs;
    private static  Method CGLIB$finalize$1$Method;
    private static  MethodProxy CGLIB$finalize$1$Proxy;
    private static  Method CGLIB$equals$2$Method;
    private static  MethodProxy CGLIB$equals$2$Proxy;
    private static  Method CGLIB$toString$3$Method;
    private static  MethodProxy CGLIB$toString$3$Proxy;
    private static  Method CGLIB$hashCode$4$Method;
    private static  MethodProxy CGLIB$hashCode$4$Proxy;
    private static  Method CGLIB$clone$5$Method;
    private static  MethodProxy CGLIB$clone$5$Proxy;

    static void CGLIB$STATICHOOK1() throws ClassNotFoundException {
        CGLIB$THREAD_CALLBACKS = new ThreadLocal();
        CGLIB$emptyArgs = new Object[0];
        Class localClass1 = Class.forName("learn1.SampleClass$$EnhancerByCGLIB$$b256b7f1");
        Class localClass2;
        Method[] tmp95_92 = ReflectUtils.findMethods(
                new String[] { "finalize", "()V", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" },
                (localClass2 = Class.forName("java.lang.Object")).getDeclaredMethods());
        CGLIB$finalize$1$Method = tmp95_92[0];
        CGLIB$finalize$1$Proxy = MethodProxy.create(localClass2, localClass1, "()V", "finalize", "CGLIB$finalize$1");
        Method[] tmp115_95 = tmp95_92;
        CGLIB$equals$2$Method = tmp115_95[1];
        CGLIB$equals$2$Proxy = MethodProxy.create(localClass2, localClass1, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$2");
        Method[] tmp135_115 = tmp115_95;
        CGLIB$toString$3$Method = tmp135_115[2];
        CGLIB$toString$3$Proxy = MethodProxy.create(localClass2, localClass1, "()Ljava/lang/String;", "toString", "CGLIB$toString$3");
        Method[] tmp155_135 = tmp135_115;
        CGLIB$hashCode$4$Method = tmp155_135[3];
        CGLIB$hashCode$4$Proxy = MethodProxy.create(localClass2, localClass1, "()I", "hashCode", "CGLIB$hashCode$4");
        Method[] tmp175_155 = tmp155_135;
        CGLIB$clone$5$Method = tmp175_155[4];
        CGLIB$clone$5$Proxy = MethodProxy.create(localClass2, localClass1, "()Ljava/lang/Object;", "clone", "CGLIB$clone$5");
        //tmp175_155;//MANUAL REMOVE
        Method[] tmp223_220 = ReflectUtils.findMethods(new String[] { "test", "(Ljava/lang/String;)Ljava/lang/String;" }, (localClass2 = Class.forName("learn1.SampleClass")).getDeclaredMethods());
        CGLIB$test$0$Method = tmp223_220[0];
        CGLIB$test$0$Proxy = MethodProxy.create(localClass2, localClass1, "(Ljava/lang/String;)Ljava/lang/String;", "test", "CGLIB$test$0");
        //tmp223_220;//MANUAL REMOVE
    }

    final String CGLIB$test$0(String paramString)
    {
        return super.test(paramString);
    }

    public final String test(String paramString) {
        MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
        if (tmp4_1 == null)
        {
            //tmp4_1;//MANUAL REMOVE
            CGLIB$BIND_CALLBACKS(this);
        }
        MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
        if (tmp17_14 != null) {
            try {
                return (String)tmp17_14.intercept(this, CGLIB$test$0$Method, new Object[] { paramString }, CGLIB$test$0$Proxy);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        return super.test(paramString);
    }

    final void CGLIB$finalize$1()
            throws Throwable
    {
        super.finalize();
    }

    protected final void finalize()
            throws Throwable
    {
        MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
        if (tmp4_1 == null)
        {
            //tmp4_1;//MANUAL REMOVE
            CGLIB$BIND_CALLBACKS(this);
        }
        if (this.CGLIB$CALLBACK_0 != null) {
            CGLIB$CALLBACK_0.intercept(this, CGLIB$finalize$1$Method, CGLIB$emptyArgs, CGLIB$finalize$1$Proxy);
            return;
        }
        super.finalize();
    }

    final boolean CGLIB$equals$2(Object paramObject)
    {
        return super.equals(paramObject);
    }

    public final boolean equals(Object paramObject)
    {
        MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
        if (tmp4_1 == null)
        {
            //tmp4_1;//MANUAL REMOVE
            CGLIB$BIND_CALLBACKS(this);
        }
        MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
        if (tmp17_14 != null)
        {
            Object tmp41_36 = null;
            try {
                tmp41_36 = tmp17_14.intercept(this, CGLIB$equals$2$Method, new Object[] { paramObject }, CGLIB$equals$2$Proxy);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            //tmp41_36;//MANUAL REMOVE
            return tmp41_36 == null ? false : ((Boolean)tmp41_36).booleanValue();
        }
        return super.equals(paramObject);
    }

    final String CGLIB$toString$3()
    {
        return super.toString();
    }

    public final String toString()
    {
        MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
        if (tmp4_1 == null)
        {
            //tmp4_1;//MANUAL REMOVE
            CGLIB$BIND_CALLBACKS(this);
        }
        MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
        if (tmp17_14 != null) {
            try {
                return (String)tmp17_14.intercept(this, CGLIB$toString$3$Method, CGLIB$emptyArgs, CGLIB$toString$3$Proxy);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        return super.toString();
    }

    final int CGLIB$hashCode$4()
    {
        return super.hashCode();
    }

    public final int hashCode()
    {
        MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
        if (tmp4_1 == null)
        {
            //tmp4_1;//MANUAL REMOVE
            CGLIB$BIND_CALLBACKS(this);
        }
        MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
        if (tmp17_14 != null)
        {
            Object tmp36_31 = null;
            try {
                tmp36_31 = tmp17_14.intercept(this, CGLIB$hashCode$4$Method, CGLIB$emptyArgs, CGLIB$hashCode$4$Proxy);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            //tmp36_31;//MANUAL REMOVE
            return tmp36_31 == null ? 0 : ((Number)tmp36_31).intValue();
        }
        return super.hashCode();
    }

    final Object CGLIB$clone$5()
            throws CloneNotSupportedException
    {
        return super.clone();
    }

    protected final Object clone()
            throws CloneNotSupportedException
    {
        MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
        if (tmp4_1 == null)
        {
            //tmp4_1;//MANUAL REMOVE
            CGLIB$BIND_CALLBACKS(this);
        }
        MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
        if (tmp17_14 != null) {
            try {
                return tmp17_14.intercept(this, CGLIB$clone$5$Method, CGLIB$emptyArgs, CGLIB$clone$5$Proxy);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        return super.clone();
    }

    public static MethodProxy CGLIB$findMethodProxy(Signature paramSignature)
    {
        String tmp4_1 = paramSignature.toString();
        switch (tmp4_1.hashCode())
        {
            case -1574182249:
                if (tmp4_1.equals("finalize()V")) {
                    return CGLIB$finalize$1$Proxy;
                }
                break;
        }
        return CGLIB$finalize$1$Proxy;
    }

    public SampleClass$$EnhancerByCGLIB$$b256b7f1()
    {
        CGLIB$BIND_CALLBACKS(this);
    }

    public static void CGLIB$SET_THREAD_CALLBACKS(Callback[] paramArrayOfCallback)
    {
        CGLIB$THREAD_CALLBACKS.set(paramArrayOfCallback);
    }

    public static void CGLIB$SET_STATIC_CALLBACKS(Callback[] paramArrayOfCallback)
    {
        CGLIB$STATIC_CALLBACKS = paramArrayOfCallback;
    }

    private static final void CGLIB$BIND_CALLBACKS(Object paramObject)
    {
        SampleClass$$EnhancerByCGLIB$$b256b7f1 localb256b7f1 = (SampleClass$$EnhancerByCGLIB$$b256b7f1)paramObject;
        if (!localb256b7f1.CGLIB$BOUND)
        {
            localb256b7f1.CGLIB$BOUND = true;
            Object tmp23_20 = CGLIB$THREAD_CALLBACKS.get();
            if (tmp23_20 == null)
            {
                localb256b7f1.CGLIB$CALLBACK_0 = (MethodInterceptor) CGLIB$STATIC_CALLBACKS[0];
            } else {
                localb256b7f1.CGLIB$CALLBACK_0 = (MethodInterceptor) tmp23_20;
            }
        }
    }

    @Override
    public Object newInstance(Callback callback) {
        Callback[] callbacks = new Callback[]{};
        callbacks[0] = callback;
        CGLIB$SET_THREAD_CALLBACKS(callbacks);
        SampleClass$$EnhancerByCGLIB$$b256b7f1 proxy = new SampleClass$$EnhancerByCGLIB$$b256b7f1();
        CGLIB$SET_THREAD_CALLBACKS(null);
        return proxy;
    }

    @Override
    public Object newInstance(Callback[] callbacks) {
        CGLIB$SET_THREAD_CALLBACKS(callbacks);
        SampleClass$$EnhancerByCGLIB$$b256b7f1 proxy = new SampleClass$$EnhancerByCGLIB$$b256b7f1();
        CGLIB$SET_THREAD_CALLBACKS(null);
        return proxy;
    }

    @Override
    public Object newInstance(Class[] clazzes, Object[] args, Callback[] callbacks) {
        CGLIB$SET_THREAD_CALLBACKS(callbacks);
        SampleClass$$EnhancerByCGLIB$$b256b7f1 proxy;
        for (Class clazz : clazzes) {
            proxy = new SampleClass$$EnhancerByCGLIB$$b256b7f1();
            CGLIB$SET_THREAD_CALLBACKS(null);
            return proxy;
        }
        return null;
    }

    @Override
    public Callback getCallback(int index) {
        CGLIB$BIND_CALLBACKS(this);
        return CGLIB$CALLBACK_0;
    }

    @Override
    public void setCallback(int index, Callback callback) {
        CGLIB$CALLBACK_0 = (MethodInterceptor) callback;
    }

    @Override
    public void setCallbacks(Callback[] callbacks) {
        CGLIB$CALLBACK_0 = (MethodInterceptor) callbacks[0];
    }

    @Override
    public Callback[] getCallbacks() {
        CGLIB$BIND_CALLBACKS(this);
        Callback[] callbacks = new Callback[]{};
        callbacks[0] = CGLIB$CALLBACK_0;
        return callbacks;
    }
}