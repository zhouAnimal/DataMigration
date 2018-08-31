package org.big.controller;

import java.util.List;

import org.big.wy.entity.ATest;
import org.big.wy.repository.ATestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TableController {
	
	
	//外源数据库
//	@Autowired
//	@Qualifier("WyMysqlJdbcTemplate")
//	private JdbcTemplate postgresTemplate;
//	
	//名录数据库
	@Autowired
	@Qualifier("mlJdbcTemplate")
	private JdbcTemplate mlJdbcTemplate;
	
	@Autowired
	private ATestRepository aTestRepository;

	@RequestMapping("/hello")
	@ResponseBody
	String home() {
		List<ATest> findAll = aTestRepository.findAll();
		System.out.println("外源数据库："+findAll.size());
		String string = mlJdbcTemplate.queryForObject("select count(1) from common_names",String.class);
		System.out.println("名录数据库 string = "+string);
//		tableService.updateTTagEn();
//		访问路径：http://localhost:端口号/hello
		return "Hello ,spring boot!";
	}
	

	
}
