package learn1.generatedclasses.testMethodInterceptor;

import java.lang.reflect.InvocationTargetException;
import net.sf.cglib.core.Signature;
import net.sf.cglib.reflect.FastClass;

public class Object$$FastClassByCGLIB$$3f697993
        extends FastClass
{
    public Object$$FastClassByCGLIB$$3f697993(Class paramClass)
    {
        super(paramClass);
    }

    public int getIndex(Signature paramSignature)
    {
        String tmp4_1 = paramSignature.toString();
        switch (tmp4_1.hashCode())
        {
            case -1725733088:
                if (tmp4_1.equals("getClass()Ljava/lang/Class;")) {
                    return 6;
                }
                break;
        }
        return 0;//MANUAL ADDED
    }

    public int getIndex(String paramString, Class[] paramArrayOfClass)
    {
        String tmp3_0 = paramString;
        switch (tmp3_0.hashCode())
        {
            case -1776922004:
                if (tmp3_0.equals("toString"))
                {
                    Class[] tmp80_1 = paramArrayOfClass;
                    switch (tmp80_1.length)
                    {
                        case 0:
                            //tmp80_1;//MANUAL REMOVE
                            return 4;
                    }
                }
                break;
        }
        return 0;//MANUAL ADD
    }

    public int getIndex(Class[] paramArrayOfClass)
    {
        Class[] tmp1_0 = paramArrayOfClass;
        switch (tmp1_0.length)
        {
            case 0:
                //tmp1_0;//MANUAL REMOVE
                return 0;
        }
        //break label26;//MANUAL REMOVE
        return 0;//MANUAL ADD
    }

    /* Error */
    public Object invoke(int paramInt, Object paramObject, Object[] paramArrayOfObject)
            throws InvocationTargetException
    {
        // Byte code:
        //   0: aload_2
        //   1: iload_1
        //   2: tableswitch	default:+137 -> 139, 0:+50->52, 1:+55->57, 2:+78->80, 3:+92->94, 4:+107->109, 5:+111->113, 6:+123->125, 7:+127->129, 8:+132->134
        //   53: nop
        //   54: lastore
        //   55: aconst_null
        //   56: areturn
        //   57: aload_3
        //   58: iconst_0
        //   59: aaload
        //   60: checkcast 82	java/lang/Number
        //   63: invokevirtual 86	java/lang/Number:longValue	()J
        //   66: aload_3
        //   67: iconst_1
        //   68: aaload
        //   69: checkcast 82	java/lang/Number
        //   72: invokevirtual 89	java/lang/Number:intValue	()I
        //   75: invokevirtual 92	java/lang/Object:wait	(JI)V
        //   78: aconst_null
        //   79: areturn
        //   80: aload_3
        //   81: iconst_0
        //   82: aaload
        //   83: checkcast 82	java/lang/Number
        //   86: invokevirtual 86	java/lang/Number:longValue	()J
        //   89: invokevirtual 95	java/lang/Object:wait	(J)V
        //   92: aconst_null
        //   93: areturn
        //   94: aload_3
        //   95: iconst_0
        //   96: aaload
        //   97: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
        //   100: new 97	java/lang/Boolean
        //   103: dup_x1
        //   104: swap
        //   105: invokespecial 100	java/lang/Boolean:<init>	(Z)V
        //   108: areturn
        //   109: invokevirtual 17	java/lang/Object:toString	()Ljava/lang/String;
        //   112: areturn
        //   113: invokevirtual 21	java/lang/Object:hashCode	()I
        //   116: new 102	java/lang/Integer
        //   119: dup_x1
        //   120: swap
        //   121: invokespecial 105	java/lang/Integer:<init>	(I)V
        //   124: areturn
        //   125: invokevirtual 108	java/lang/Object:getClass	()Ljava/lang/Class;
        //   128: areturn
        //   129: invokevirtual 110	java/lang/Object:notify	()V
        //   132: aconst_null
        //   133: areturn
        //   134: invokevirtual 112	java/lang/Object:notifyAll	()V
        //   137: aconst_null
        //   138: areturn
        //   139: goto +12 -> 151
        //   142: new 77	java/lang/reflect/InvocationTargetException
        //   145: dup_x1
        //   146: swap
        //   147: invokespecial 117	java/lang/reflect/InvocationTargetException:<init>	(Ljava/lang/Throwable;)V
        //   150: athrow
        //   151: new 119	java/lang/IllegalArgumentException
        //   154: dup
        //   155: ldc 121
        //   157: invokespecial 124	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
        //   160: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	161	0	this	3f697993
        //   0	161	1	paramInt	int
        //   0	161	2	paramObject	Object
        //   0	161	3	paramArrayOfObject	Object[]
        // Exception table:
        //   from	to	target	type
        //   2	142	142	java/lang/Throwable
        return null;//MANUAL ADD
    }

    public Object newInstance(int paramInt, Object[] paramArrayOfObject)
            throws InvocationTargetException
    {
        try
        {
            switch (paramInt)
            {
                case 0:
                    return new Object();
            }
        }
        catch (Throwable localThrowable)
        {
            throw new InvocationTargetException(localThrowable);
        }
        throw new IllegalArgumentException("Cannot find matching method/constructor");
    }

    public int getMaxIndex()
    {
        return 8;
    }
}
