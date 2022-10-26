package com.lspring.demo.service;

import com.lspring.demo.bean.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
	int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    List<Map<String, Object>> queryStudentListMap();
    Student queryStudentBySno(String sno);
}
