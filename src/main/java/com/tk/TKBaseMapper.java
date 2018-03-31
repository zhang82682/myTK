package com.tk;


import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.UpdateProvider;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.provider.base.BaseUpdateProvider;

public interface TKBaseMapper<T> extends Mapper<T>, MySqlMapper<T>
{
	
	@UpdateProvider(type = BaseUpdateProvider.class, method = "dynamicSQL")
	@Options(useCache = false, useGeneratedKeys = false)
	int updateByPrimaryKey(T record);
	
	@UpdateProvider(type = BaseUpdateProvider.class, method = "dynamicSQL")
	@Options(useCache = false, useGeneratedKeys = false)
	int updateByPrimaryKeySelective(T record);
}
