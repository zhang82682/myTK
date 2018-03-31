package com.myTk;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.tk.TKBaseMapper;

public interface TestTableMapper  extends TKBaseMapper<TestTable> {

	@Select("select * from TestTable")
	List<TestTable> test();

}
