package ${packageName}.api.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ${packageName}.service.${ClassName}Service;

 /**
 * ${functionName}Controller
 * 
 * @author ${classAuthor}
 * @version 1.0.0 初始化
 * @date ${classDate}
 * Copyright 本内容仅限于开源项目公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@RestController
public class ${ClassName}Controller{

	@Resource
	private ${ClassName}Service ${className}Service;

}
