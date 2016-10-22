package com.example;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@Autowired
	addDao addDao;

	@Autowired
	StudentDao stdao;
	
	@RequestMapping("/ad")
	public void test()
	{
		Address add = addDao.findOne(Long.valueOf(1));
		Set<Student> st = add.getStudents();
		int i = 0;
	}
	
	@RequestMapping("/st")
	public void test1(@RequestParam("page") Integer page, @RequestParam("size") Integer size)
	{
		List<Student> st = stdao.findByMobileNo(Long.valueOf(123), new PageRequest(page, size, new Sort("rollNo")));
		st = stdao.findByMobileNo(Long.valueOf(123), new Range(0, 3, "rollNo"));
		int i = 1;
	}
}
