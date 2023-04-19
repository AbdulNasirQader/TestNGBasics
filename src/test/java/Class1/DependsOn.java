package Class1;

import org.testng.annotations.Test;

public class DependsOn {

    @Test
    public void Login(){
       // System.out.println("i am here");
        System.out.println(6/0);
    }
    @Test(dependsOnMethods = {"Login"})
    public void DashBoardverfification(){
        System.out.println("after login i am verifying dashboard");
    }
}
