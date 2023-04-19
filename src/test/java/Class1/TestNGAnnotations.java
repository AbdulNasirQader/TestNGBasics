package Class1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("i am before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("i am after Method");
    }

    @Test(groups = "regression")
    public void aFirstTestCase(){
        System.out.println("i am the first test case");
    }
    @Test
    public void bSecondTestCase(){
        System.out.println("i am the second test case");
    }
    @Test
    public void cThirdTestCase(){
        System.out.println("i am the third test case");
    }
}
