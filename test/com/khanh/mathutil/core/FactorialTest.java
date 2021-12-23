package com.khanh.mathutil.core;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {

    @Test //viet code dung de test code chinh mathutil
    //ten ham phai noi len muc dich test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        //ki vong khi goi 5! thi may tra ve 120
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        assertEquals(expected, actual);
        assertEquals(1, MathUtil.getFactorial(1));
        assertEquals(1, MathUtil.getFactorial(0));
        assertEquals(6, MathUtil.getFactorial(3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
        MathUtil.getFactorial(21); //tran so
    }

}
