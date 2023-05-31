package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {
    @BeforeMethod
    public void beforeMethods(){
        System.out.println("I am the before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am the after method");
    }
    @Test(groups = "regression")
    public void AfirstTestCase(){
        System.out.println("I am the first test case");
    }
    @Test
    public void bSecondTestCase(){
        System.out.println("I am the second test case");
    }
    @Test
    public void CThirdTestcase(){
        System.out.println("I am the third test case");
    }
}
