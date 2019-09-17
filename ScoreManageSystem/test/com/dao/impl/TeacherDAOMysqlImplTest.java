package com.dao.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dto.Teacher;

public class TeacherDAOMysqlImplTest {

	private TeacherDAOMysqlImpl teacherDAOMysqlImpl;
	@Before
	public void setUp() throws Exception {
		teacherDAOMysqlImpl=new TeacherDAOMysqlImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLogin() {
//		fail("Not yet implemented");
		Teacher teacher=null;
		String teacherCode="";
		String password="";
		try {
			teacher=teacherDAOMysqlImpl.login("001", "321");
			if(teacher!=null){
				System.out.println("name:"+teacher.getName());
			}
			assertEquals("tom", teacher.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
