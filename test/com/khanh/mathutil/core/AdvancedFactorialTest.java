package com.khanh.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    //gom input, output ra 1 cho cho de quan ly, theo doi   
    //ta co the dat bo data o file txt, csv, excel, db,... (can 1 method doc tu file)
    @Parameters
    public static Object[][] initData(){ //ten ham tu do
        return new Integer[][]{
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 720}
                              };
    }
    
    //chuan bi 2 bien hung data tu mang
    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public long expected;
    
    @Test
     public void checkFactorialGivenCorrectArgumentReturnsWell() {
        assertEquals(expected, MathUtil.getFactorial(input));
     }
}
