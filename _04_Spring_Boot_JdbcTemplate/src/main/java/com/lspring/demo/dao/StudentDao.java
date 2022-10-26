package com.lspring.demo.dao;

import com.lspring.demo.bean.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
	int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    List<Map<String,Object>> queryStudentsListMap();
    Student queryStudentBySno(String sno);
}
