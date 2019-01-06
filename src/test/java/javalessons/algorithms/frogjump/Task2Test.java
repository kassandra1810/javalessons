package javalessons.algorithms.frogjump;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void shouldJumpThreeTimes() {
        int inputX = 10;
        int inputY = 40;
        int inputD = 10;
        int expectedResult = 3;

        int actualResult = Task2.solution(inputX, inputY, inputD);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldJumpZeroTimes() {
        int inputX = 10;
        int inputY = 10;
        int inputD = 10;
        int expectedResult = 0;

        int actualResult = Task2.solution(inputX, inputY, inputD);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldStayInPlace() {
        int inputX = 10;
        int inputY = 1;
        int inputD = 10;
        int expectedResult = 0;

        int actualResult = Task2.solution(inputX, inputY, inputD);

        assertEquals(expectedResult, actualResult);
    }
}