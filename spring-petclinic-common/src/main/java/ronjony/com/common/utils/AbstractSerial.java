package ronjony.com.common.utils;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author liuxianfeng 2018/04/06 19:18
 * @类描述：基础序列化
 * @注意：本内容仅限于开源软件公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class AbstractSerial implements Serializable {

    private static final long serialVersionUID = -8364508949630534954L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
