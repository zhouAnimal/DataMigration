package org.big.restController;
import java.util.List;

import org.big.wy.entity.ATest;
import org.big.wy.repository.ATestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
/**
 * @RestController 此Controller返回格式就都是text/json
 * @author BIGIOZ
 *
 */
@RestController
@RequestMapping("api")
public class APIController {

	@Autowired
	private ATestRepository aTestRepository;

	/**
	 * name代表提交参数名。 
	 * required意思是这个参数是否必需，默认true，没有该参数，无法调用此方法；这里设为false，有无该参数都可以调用。 
	 * defaultValue如果该参数值为空，那么就使用默认值。
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/get-info", method = RequestMethod.GET)
	public String getInfo(
			@RequestParam(name = "param", required = false, defaultValue = "param dafault value") String param) {
		return "";
	}

	@RequestMapping("/get-text")
	@ResponseBody // 该方法返回格式是text/json
	public String getText() {
		return "";
	}
	
	
	/**
	 * 
	 * @param name1
	 * @param name2
	 * @return
	 */
	@ApiOperation(value = "获取物种基础信息", notes = "根据拉丁名或中文名获取物种基础信息")
	@ApiImplicitParams({ 
		@ApiImplicitParam(paramType = "query",name = "name1", value = "用户1", required = true, dataType = "String"),
		@ApiImplicitParam(paramType = "query",name = "name2", value = "用户2", required = false, dataType = "String")})
	@RequestMapping(value = "/getInfoByName", method = RequestMethod.GET)
	public List<ATest> getUser(@RequestParam String name1,@RequestParam String name2) {
		return aTestRepository.findAll();
	}

}
