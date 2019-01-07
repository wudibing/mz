package zmz.mz.mz.entity;

import com.baomidou.ant.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wang
 * @since 2019-01-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TGoods extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private byte[] name;

    private Integer type;

    private byte[] goodsInfo;

    private byte[] goodsTitle;


}
