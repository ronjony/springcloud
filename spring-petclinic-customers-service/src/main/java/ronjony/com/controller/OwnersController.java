package ronjony.com.controller;

import javax.annotation.Resource;

import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ronjony.com.domain.OwnersDo;
import ronjony.com.service.OwnersService;

import java.util.List;

/**
 * cloud split mysqlController
 *
 * @author ronjony
 * @version 1.0.0 初始化
 * @date 2018-04-17 17:18:43
 * Copyright 本内容仅限于开源项目公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@RestController
public class OwnersController{


	@Resource
	private OwnersService ownersService;

    @ApiOperation(value="得到所有数据", notes="测试得到所有数据")
    @ApiImplicitParams(value = {
    })
    @RequestMapping( value ="/getAllAgingList",method = RequestMethod.POST)
    @ResponseBody
    public List<OwnersDo> getAllOwnersDos(){
        return ownersService.getAllOwners();
    }

}
