package z002;

import org.junit.Test;

/**
 * @author Zhang Chi
 * @create 2022-02-2022/2/26-20:45
 */
public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(1);
        System.out.println(maven);
    }
}
