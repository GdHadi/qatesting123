package com.wpqa123.homepage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit2Test {

	@BeforeClass
    public static void beforeClassAnnotation() {        
      System.out.println("@BeforeClass - for junit class 2");
    }

    @AfterClass
    public static void afterClassAnnotation() {       
      System.out.println("@AfterClass - for junit class 2");
    }  

    @Test
    public void testMethod2() {       
        System.out.println("@Test - Second class test method");
    }    

}
