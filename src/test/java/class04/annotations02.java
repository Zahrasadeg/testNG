package class04;

import org.testng.annotations.*;

public class annotations02 {
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("I am the before class");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("I am the after class");
    }
    @BeforeMethod
    public void beforeMethods(){
        System.out.println("I am the before method");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("I am the after method");
    }
    @Test
    public void testA(){
        System.out.println("I am test a");
    }
    @Test
    public void testB(){
        System.out.println("I am test b");
    }
}
