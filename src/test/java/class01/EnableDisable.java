package class01;

import org.testng.annotations.Test;

public class EnableDisable {
    @Test(enabled = false)
    public void Atest(){
        System.out.println("I am the first test case");
    }
    @Test
    public void Btest(){
        System.out.println("I am the b test case");
    }
}
