package nl.anlizi.mvcswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import nl.anlizi.mvcswagger.input.TestInput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 测试相关接口
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2023/06/24 21:19
 */
@Api(tags = "测试相关接口")
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * 算法列表查询
     *
     * @return
     */
    @ApiOperation(value = "算法列表查询", notes = "算法列表查询")
    @GetMapping("/queryList")
    public TestInput queryList(@Valid TestInput input) {
        return input;
    }

}
