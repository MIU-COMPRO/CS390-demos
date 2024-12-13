package lesson4.junittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import lesson4.junittest.MyTestClass;
public class MyTestClassTest {
    @Test
    public void test1() {
        int res = MyTestClass.add(10, 10);
        assertEquals(res,20);
    }
    @Test
    public void test2() {
        int res = MyTestClass.Sum(5);
        assertEquals(res,15);
    }
}