package learn1.generatedclasses.testMethodInterceptor;

/**
 * Created by rxiao on 5/7/15.
 */
import net.sf.cglib.core.KeyFactory;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import org.objectweb.asm.Type;

public class Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72
        extends KeyFactory
        implements Enhancer.EnhancerKey
{
    private  String FIELD_0;
    private  String[] FIELD_1;
    private CallbackFilter FIELD_2;
    private  Type[] FIELD_3;
    private  boolean FIELD_4;
    private  boolean FIELD_5;
    private  Long FIELD_6;

    public Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72() {}

    public Object newInstance(String paramString, String[] paramArrayOfString, CallbackFilter paramCallbackFilter, Type[] paramArrayOfType, boolean paramBoolean1, boolean paramBoolean2, Long paramLong)
    {
        return new Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72(paramString, paramArrayOfString, paramCallbackFilter, paramArrayOfType, paramBoolean1, paramBoolean2, paramLong);
    }

    public Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72(String paramString, String[] paramArrayOfString, CallbackFilter paramCallbackFilter, Type[] paramArrayOfType, boolean paramBoolean1, boolean paramBoolean2, Long paramLong)
    {
        this.FIELD_0 = paramString;
        this.FIELD_1 = paramArrayOfString;
        this.FIELD_2 = paramCallbackFilter;
        this.FIELD_3 = paramArrayOfType;
        this.FIELD_4 = paramBoolean1;
        this.FIELD_5 = paramBoolean2;
        this.FIELD_6 = paramLong;
    }

    public int hashCode()
    {
        return (8095873 * 69403);//MANUAL ADD
    }

    public boolean equals(Object paramObject)
    {
        if ((paramObject instanceof Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72))
        {
            String tmp18_15 = ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72)paramObject).FIELD_0;
            /*
            //MANUAL REMOVE
            this.FIELD_0;
            if (tmp18_15 == null)
            {
                if (tmp18_8 != null) {
                    break label35;
                }
                tmp18_15;;
                break label45;
            }
            */
        }
        return false;//MANUAL ADD
    }

    public String toString()
    {
        /*
        //MANUAL REMOVE
        String tmp11_8 = this.FIELD_0;
        if (tmp11_8 != null) {
            tmpTernaryOp = new StringBuffer().append(tmp11_8.toString());
        }*/
        return this.FIELD_0.toString();//MANUAL ADD
    }
}
