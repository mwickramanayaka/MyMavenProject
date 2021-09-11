import org.testng.annotations.Test;

public class TestCases {

    @Test(priority = 0)
    void setup(){
        System.out.println("I am inside setup ");
    }

    @Test(priority = 2)
    void tearDown(){
        System.out.println("I am inside teardown");
    }

    @Test(priority = 1)
    void testSteps(){
        System.out.println("I am inside testSteps");
    }

}
