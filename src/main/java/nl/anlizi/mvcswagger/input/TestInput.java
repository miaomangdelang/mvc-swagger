package nl.anlizi.mvcswagger.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 测试入参
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date  2023/06/24 21:30
 */
@ApiModel(description = "测试入参")
@Data
public class TestInput implements Serializable {

    private static final long serialVersionUID = 1920007125925848809L;

    /**
     * 测试名称
     */
    @ApiModelProperty(value = "测试名称")
    private String testName;

}
