package com.lspring.demo.service;

import java.util.List;
import java.util.Map;

public interface StudentService {
	List<Map<String, Object>> getAllStudentsFromOralce();
	List<Map<String, Object>> getAllStudentsFromMysql();
}
