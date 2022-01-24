package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGGeneratedClass {
  @Test(enabled = true, priority = 3)
  
  //highest priority will execute first - 1 -> high and 3 -> low
  public void Test1() {
	  System.out.println("Test1");
	  System.out.println("Priority 3");
  }
  @Test(enabled = false, priority = 2)
  public void Test2() {
	  System.out.println("Test2");
	  System.out.println("Priority 2");
  }
  @Test(priority = 1)
  public void Test3() {
	  System.out.println("Test3");
	  System.out.println("Priority 1");
  }
  @Test(groups = {"Smoke"})
  public void Test4() {
	  System.out.println("Test4");
  }
  @Test(groups = {"Smoke","Regression"})
  public void Test5() {
	  System.out.println("Test5");
  }
  
  @Test(groups = {"Regression"})
  public void Test6() {
	  System.out.println("Test6");
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
