package learn1.generatedclasses.testMethodInterceptor;

import net.sf.cglib.core.KeyFactory;
import net.sf.cglib.core.MethodWrapper;

/**
 * Created by rxiao on 5/7/15.
 */
public class MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7
        extends KeyFactory
        implements MethodWrapper.MethodWrapperKey
{
    private String FIELD_0;
    private String[] FIELD_1;
    private String FIELD_2;

    public MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7() {}

    public Object newInstance(String paramString1, String[] paramArrayOfString, String paramString2)
    {
        return new MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7(paramString1, paramArrayOfString, paramString2);
    }

    public MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7(String paramString1, String[] paramArrayOfString, String paramString2)
    {
        this.FIELD_0 = paramString1;
        this.FIELD_1 = paramArrayOfString;
        this.FIELD_2 = paramString2;
    }

    public int hashCode()
    {
        return (938313161 * 362693231);
    }

    public boolean equals(Object paramObject)
    {
        if ((paramObject instanceof MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7))
        {
            String tmp18_15 = ((MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7)paramObject).FIELD_0;
            //this.FIELD_0;//MANUAL REMOVE
            if (tmp18_15 == null)
            {
                /*
                //MANUAL REMOVE
                if (tmp18_8 != null) {
                    break label35;
                }
                //tmp18_15;;
                break label45;*/
            }
        }
        return false;//MANUAL ADD
    }

    public String toString()
    {
        String tmp11_8 = this.FIELD_0;
        if (tmp11_8 != null) {
            //tmpTernaryOp = new StringBuffer().append(tmp11_8.toString());//MANUAL REMOVE
        }
        return tmp11_8;//MANUAL ADD
    }
}

