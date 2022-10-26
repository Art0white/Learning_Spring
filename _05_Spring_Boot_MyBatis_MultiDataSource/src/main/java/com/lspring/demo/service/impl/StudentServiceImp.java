package com.lspring.demo.service.impl;

import com.lspring.demo.mysqldao.MysqlStudentMapper;
import com.lspring.demo.oracledao.OracleStudentMapper;
import com.lspring.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImp implements StudentService {
	@Autowired
	private OracleStudentMapper oracleStudentMapper;
	@Autowired
	private MysqlStudentMapper mysqlStudentMapper;
	
	@Override
	public List<Map<String, Object>> getAllStudentsFromOralce() {
		return this.oracleStudentMapper.getAllStudents();
	}

	@Override
	public List<Map<String, Object>> getAllStudentsFromMysql() {
		return this.mysqlStudentMapper.getAllStudents();
	}

}
