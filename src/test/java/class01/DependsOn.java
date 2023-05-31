package class01;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void Login(){
        System.out.println(6/0);
    }
    //if the first one cant run the second one because it is depends on the first one it will not work and the test will ignored every thing
    @Test(dependsOnMethods = {"Login"})
    public void DashBoredVerification(){
        System.out.println("After login I am verifying dashboard");
    }
}
