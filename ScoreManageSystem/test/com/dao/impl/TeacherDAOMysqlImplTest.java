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
		String teacherCode="001";
		String password="321";
		
		try {
			teacher=teacherDAOMysqlImpl.login(teacherCode,password);
			if(teacher!=null){
				//System.out.println("name:"+teacher.getName());
				System.out.println("��¼�ɹ�");
			}else{
				System.out.println("��¼ʧ��");
			}
			//assertEquals("tom", teacher.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
