package com.lspring.demo.controller;

import com.lspring.demo.bean.Student;
import com.lspring.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/querystudent", method = RequestMethod.GET)
	public Student queryStudentBySno(String sno) {
		return this.studentService.queryStudentBySno(sno);
	}

	@RequestMapping(value = "/queryallstudent")
	public List<Map<String, Object>> queryAllStudent() {
		return this.studentService.queryStudentListMap();
	}
	
	@RequestMapping(value = "/addstudent", method = RequestMethod.GET)
	public int saveStudent(String sno,String name,String sex) {
		Student student = new Student();
		student.setSno(sno);
		student.setName(name);
		student.setSex(sex);
		return this.studentService.add(student);
	}
	
	@RequestMapping(value = "deletestudent", method = RequestMethod.GET)
	public int deleteStudentBySno(String sno) {
		return this.studentService.deleteBysno(sno);
	}
}
