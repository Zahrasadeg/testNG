package class04;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class annotationsBeforeClass {
    @BeforeClass
    public void hello(){
        System.out.println("I am the before class");
    }
    @Test
    public void testB(){
        System.out.println("I am test b");
    }
}
