package learn1.generatedclasses.testMethodInterceptor;

/**
 * Created by rxiao on 5/7/15.
 */
import java.lang.reflect.InvocationTargetException;
import net.sf.cglib.core.Signature;
import net.sf.cglib.reflect.FastClass;

public class SampleClass$$EnhancerByCGLIB$$b256b7f1$$FastClassByCGLIB$$8a3a776a
        extends FastClass
{
    public SampleClass$$EnhancerByCGLIB$$b256b7f1$$FastClassByCGLIB$$8a3a776a(Class paramClass)
    {
        super(paramClass);
    }

    public int getIndex(Signature paramSignature)
    {
        String tmp4_1 = paramSignature.toString();
        switch (tmp4_1.hashCode())
        {
            case -2055565910:
                if (tmp4_1.equals("CGLIB$SET_THREAD_CALLBACKS([Lnet/sf/cglib/proxy/Callback;)V")) {
                    return 20;
                }
            case -1725733088:
                if (tmp4_1.equals("getClass()Ljava/lang/Class;")) {
                    return 24;
                }
            case -1457535688:
                if (tmp4_1.equals("CGLIB$STATICHOOK1()V")) {
                    return 13;
                }
            //TODO: other cases
                break;
        }
        return 1;//MANUAL ADD
    }

    public int getIndex(String paramString, Class[] paramArrayOfClass)
    {
        String tmp3_0 = paramString;
        switch (tmp3_0.hashCode())
        {
            case -2083498450:
                if (tmp3_0.equals("CGLIB$finalize$1"))
                {
                    Class[] tmp208_1 = paramArrayOfClass;
                    switch (tmp208_1.length)
                    {
                        case 0:
                            //tmp208_1;//MANUAL REMOVE
                            return 14;
                    }
                }
                break;
            case -1776922004:
                if (tmp3_0.equals("toString"))
                {
                    Class[] tmp208_1 = paramArrayOfClass;
                    switch (tmp208_1.length)
                    {
                        case 0:
                            //tmp208_1;//MANUAL REMOVE
                            return 1;
                    }
                }
                break;
            //TODO: other cases
        }
        return 1;//MANUAL ADD
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
        //   1: checkcast 159	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1
        //   4: iload_1
        //   5: tableswitch	default:+397 -> 402, 0:+123->128, 1:+138->143, 2:+142->147, 3:+154->159, 4:+164->169, 5:+186->191, 6:+196->201, 7:+206->211, 8:+226->231, 9:+230->235, 10:+241->246, 11:+254->259, 12:+264->269, 13:+274->279, 14:+279->284, 15:+284->289, 16:+299->304, 17:+303->308, 18:+315->320, 19:+319->324, 20:+330->335, 21:+341->346, 22:+346->351, 23:+369->374, 24:+383->388, 25:+387->392, 26:+392->397
        //   129: iconst_0
        //   130: aaload
        //   131: invokevirtual 160	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:equals	(Ljava/lang/Object;)Z
        //   134: new 162	java/lang/Boolean
        //   137: dup_x1
        //   138: swap
        //   139: invokespecial 165	java/lang/Boolean:<init>	(Z)V
        //   142: areturn
        //   143: invokevirtual 166	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:toString	()Ljava/lang/String;
        //   146: areturn
        //   147: invokevirtual 167	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:hashCode	()I
        //   150: new 169	java/lang/Integer
        //   153: dup_x1
        //   154: swap
        //   155: invokespecial 172	java/lang/Integer:<init>	(I)V
        //   158: areturn
        //   159: aload_3
        //   160: iconst_0
        //   161: aaload
        //   162: checkcast 174	net/sf/cglib/proxy/Callback
        //   165: invokevirtual 177	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:newInstance	(Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;
        //   168: areturn
        //   169: aload_3
        //   170: iconst_0
        //   171: aaload
        //   172: checkcast 152	[Ljava/lang/Class;
        //   175: aload_3
        //   176: iconst_1
        //   177: aaload
        //   178: checkcast 179	[Ljava/lang/Object;
        //   181: aload_3
        //   182: iconst_2
        //   183: aaload
        //   184: checkcast 181	[Lnet/sf/cglib/proxy/Callback;
        //   187: invokevirtual 184	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:newInstance	([Ljava/lang/Class;[Ljava/lang/Object;[Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;
        //   190: areturn
        //   191: aload_3
        //   192: iconst_0
        //   193: aaload
        //   194: checkcast 181	[Lnet/sf/cglib/proxy/Callback;
        //   197: invokevirtual 187	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:newInstance	([Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;
        //   200: areturn
        //   201: aload_3
        //   202: iconst_0
        //   203: aaload
        //   204: checkcast 83	java/lang/String
        //   207: invokevirtual 190	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:test	(Ljava/lang/String;)Ljava/lang/String;
        //   210: areturn
        //   211: aload_3
        //   212: iconst_0
        //   213: aaload
        //   214: checkcast 192	java/lang/Number
        //   217: invokevirtual 195	java/lang/Number:intValue	()I
        //   220: aload_3
        //   221: iconst_1
        //   222: aaload
        //   223: checkcast 174	net/sf/cglib/proxy/Callback
        //   226: invokevirtual 198	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:setCallback	(ILnet/sf/cglib/proxy/Callback;)V
        //   229: aconst_null
        //   230: areturn
        //   231: invokevirtual 201	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:getCallbacks	()[Lnet/sf/cglib/proxy/Callback;
        //   234: areturn
        //   235: aload_3
        //   236: iconst_0
        //   237: aaload
        //   238: checkcast 181	[Lnet/sf/cglib/proxy/Callback;
        //   241: invokevirtual 204	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:setCallbacks	([Lnet/sf/cglib/proxy/Callback;)V
        //   244: aconst_null
        //   245: areturn
        //   246: aload_3
        //   247: iconst_0
        //   248: aaload
        //   249: checkcast 192	java/lang/Number
        //   252: invokevirtual 195	java/lang/Number:intValue	()I
        //   255: invokevirtual 207	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:getCallback	(I)Lnet/sf/cglib/proxy/Callback;
        //   258: areturn
        //   259: aload_3
        //   260: iconst_0
        //   261: aaload
        //   262: checkcast 83	java/lang/String
        //   265: invokevirtual 209	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:CGLIB$test$0	(Ljava/lang/String;)Ljava/lang/String;
        //   268: areturn
        //   269: aload_3
        //   270: iconst_0
        //   271: aaload
        //   272: checkcast 81	net/sf/cglib/core/Signature
        //   275: invokestatic 212	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:CGLIB$findMethodProxy	(Lnet/sf/cglib/core/Signature;)Lnet/sf/cglib/proxy/MethodProxy;
        //   278: areturn
        //   279: invokestatic 215	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:CGLIB$STATICHOOK1	()V
        //   282: aconst_null
        //   283: areturn
        //   284: invokevirtual 217	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:CGLIB$finalize$1	()V
        //   287: aconst_null
        //   288: areturn
        //   289: aload_3
        //   290: iconst_0
        //   291: aaload
        //   292: invokevirtual 219	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:CGLIB$equals$2	(Ljava/lang/Object;)Z
        //   295: new 162	java/lang/Boolean
        //   298: dup_x1
        //   299: swap
        //   300: invokespecial 165	java/lang/Boolean:<init>	(Z)V
        //   303: areturn
        //   304: invokevirtual 221	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:CGLIB$toString$3	()Ljava/lang/String;
        //   307: areturn
        //   308: invokevirtual 223	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:CGLIB$hashCode$4	()I
        //   311: new 169	java/lang/Integer
        //   314: dup_x1
        //   315: swap
        //   316: invokespecial 172	java/lang/Integer:<init>	(I)V
        //   319: areturn
        //   320: invokevirtual 226	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:CGLIB$clone$5	()Ljava/lang/Object;
        //   323: areturn
        //   324: aload_3
        //   325: iconst_0
        //   326: aaload
        //   327: checkcast 181	[Lnet/sf/cglib/proxy/Callback;
        //   330: invokestatic 228	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:CGLIB$SET_STATIC_CALLBACKS	([Lnet/sf/cglib/proxy/Callback;)V
        //   333: aconst_null
        //   334: areturn
        //   335: aload_3
        //   336: iconst_0
        //   337: aaload
        //   338: checkcast 181	[Lnet/sf/cglib/proxy/Callback;
        //   341: invokestatic 230	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:CGLIB$SET_THREAD_CALLBACKS	([Lnet/sf/cglib/proxy/Callback;)V
        //   344: aconst_null
        //   345: areturn
        //   346: invokevirtual 232	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:wait	()V
        //   349: aconst_null
        //   350: areturn
        //   351: aload_3
        //   352: iconst_0
        //   353: aaload
        //   354: checkcast 192	java/lang/Number
        //   357: invokevirtual 236	java/lang/Number:longValue	()J
        //   360: aload_3
        //   361: iconst_1
        //   362: aaload
        //   363: checkcast 192	java/lang/Number
        //   366: invokevirtual 195	java/lang/Number:intValue	()I
        //   369: invokevirtual 239	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:wait	(JI)V
        //   372: aconst_null
        //   373: areturn
        //   374: aload_3
        //   375: iconst_0
        //   376: aaload
        //   377: checkcast 192	java/lang/Number
        //   380: invokevirtual 236	java/lang/Number:longValue	()J
        //   383: invokevirtual 242	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:wait	(J)V
        //   386: aconst_null
        //   387: areturn
        //   388: invokevirtual 245	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:getClass	()Ljava/lang/Class;
        //   391: areturn
        //   392: invokevirtual 247	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:notify	()V
        //   395: aconst_null
        //   396: areturn
        //   397: invokevirtual 249	learn1/SampleClass$$EnhancerByCGLIB$$b256b7f1:notifyAll	()V
        //   400: aconst_null
        //   401: areturn
        //   402: goto +12 -> 414
        //   405: new 157	java/lang/reflect/InvocationTargetException
        //   408: dup_x1
        //   409: swap
        //   410: invokespecial 254	java/lang/reflect/InvocationTargetException:<init>	(Ljava/lang/Throwable;)V
        //   413: athrow
        //   414: new 256	java/lang/IllegalArgumentException
        //   417: dup
        //   418: ldc_w 258
        //   421: invokespecial 261	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
        //   424: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	425	0	this	8a3a776a
        //   0	425	1	paramInt	int
        //   0	425	2	paramObject	Object
        //   0	425	3	paramArrayOfObject	Object[]
        // Exception table:
        //   from	to	target	type
        //   5	405	405	java/lang/Throwable
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
                    return new SampleClass$$EnhancerByCGLIB$$b256b7f1();//MANUAL
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
        return 26;
    }
}
