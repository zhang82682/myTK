package com.myTk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class TestService {

	@Autowired
	private TestTableMapper  testTableMapper;
	
	public List<TestTable> test(){
		return testTableMapper.test();
	}
	
	public List<TestTable> selectList(){
		Page<TestTable> page = PageHelper.startPage(1, 2);
		return testTableMapper.selectAll();
	}
	
	public void insert(){
		TestTable a = new TestTable();
		a.setName("zhangsan");
		a.setAge(18);
		testTableMapper.insert(a);
	}
}
