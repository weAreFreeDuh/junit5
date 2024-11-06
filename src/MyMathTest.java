import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest {

    String context = "AWS, DB, SRPING";

    @BeforeAll
    static void BeforeAll(){
        System.out.println("Before All");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("After All");
    }

    @BeforeEach
    void BeforeEach() {
        System.out.println("Before Each");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("After Each");
    }

    @Test
    void calculateSumTest(){

        int[] numbers = {1,2,3};
        MyMath myMath = new MyMath();
        int result = myMath.calculateSum(numbers);
        System.out.println(result);
        assertEquals(result,6);

    }

    @Test
    void contextTest(){
        boolean result = context.contains("AWS");
        System.out.println(result);
        assertEquals(result,true);
    }

    @Test
    void failTest(){
        System.out.println("failTest");
        fail("failTest");
    }

}