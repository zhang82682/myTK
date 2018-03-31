package com.myTk;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    	TestService bean = (TestService) applicationContext.getBean("testService");
    	
    	List<TestTable> list = bean.selectList();
    	for (TestTable testTable : list) {
			System.out.println(testTable);
		}
    	//bean.insert();
    }
}
