package com.wpqa123.homepage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit1Test {

    @BeforeClass
   public static void beforeClassAnnotation() {        
     System.out.println("@BeforeClass - for junit class 1");
   }

   @AfterClass
   public static void afterClassAnnotation() {       
     System.out.println("@AfterClass - for junit class 1");
   }  

   @Test
   public void testAnnotation() {       
       System.out.println("@Test - first class test method");
   } 

}
