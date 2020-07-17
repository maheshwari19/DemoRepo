package com.org.property;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;

//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

import com.org.locate.ParentClass;
import com.org.valid.Child1;

public class Child2 extends ParentClass {
	
	static ParentClass prop;
	Child1 log;
	
	@BeforeClass
	public static void precondition(){
		driver=prop.getDriver("chrome");
	}
	@Test
	public void condition(){
		log=new Child1();
		log.setTextusername("maha");
		Assert.assertEquals("maha", log.getTextusername());
		log.setTextpassword("yadav1989");
		Assert.assertEquals("yadav1989", log.getTextpassword());
		//log.getLoginbuttonclick().click();
		buttonclick(log.getLoginbuttonclick());
	}
	@AfterClass
	public static void postcondition(){
		driver.close();
	}

}
