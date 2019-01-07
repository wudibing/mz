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
public class TZone extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private byte[] imgPath;

    private Integer userId;

    private byte[] title;

    private byte[] info;

    private Integer likes;

    private Integer goodsId;


}
