import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.*;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @Author John Antonio Collins
 * Created on 5/2/17.
 */
public class Solution_Test
{
    SolutionBreakOut testSolution;
    int[][] testArrFail;
    int[][] testArrRunCode;
    int[] testCaseRunCode;
    int[][] testArr3;
    int[] testCase3;
    int[][] testArr7;
    int[] testCase7;

    @Before
    public void setUp()
    {
        testSolution = new SolutionBreakOut();
        testArrFail = new int[6][6];
        testArrRunCode = new int[6][6];
        testArr3 = new int[6][6];
        testArr7 = new int[6][6];
        testCaseRunCode = new int[]{
                1, 1, 1, 0, 0, 0,
                0, 1, 0, 0, 0, 0,
                1, 1, 1, 0, 0, 0,
                0, 9, 2, -4, -4, 0,
                0, 0, 0, -2, 0, 0,
                0, 0, -1, -2, -4, 0};

        testCase3 = new int[]{
                -1, -1, 0, -9, -2, -2,
                -2, -1, -6, -8, -2, -5,
                -1, -1, -1, -2, -3, -4,
                -1, -9, -2, -4, -4, -5,
                -7, -3, -3, -2, -9, -9,
                -1, -3, -1, -2, -4, -5};

        testCase7 = new int[]{
                0, -4, -6, 0, -7, -6,
                -1, -2, -6, -8, -3, -1,
                -8, -4, -2, -8, -8, -6,
                -3, -1, -2, -5, -7, -4,
                -3, -5, -3, -6, -6, -6,
                -3, -6, 0, -8, -6, -7,};

        int n =0;
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                testArrFail[i][j] = (int) (Math.round(Math.random() * 18) - 9);
                testArrRunCode[i][j] = testCaseRunCode[n];
                testArr3[i][j] = testCase3[n];
                testArr7[i][j] = testCase7[n];
                n++;
            }
        }
    }

    @Test
    public void solutionBreakOut_Test_FAIL() throws NullPointerException, IndexOutOfBoundsException
    {
        int actual = testSolution.solutionBreakOut(testArrFail);
        int expected = 100;//random -63 to 63 fail-test
        assertNotEquals(expected, actual);
    }
    @Test
    public void solutionBreakOut_Test_RunCode() throws NullPointerException, IndexOutOfBoundsException
    {
        int actual = testSolution.solutionBreakOut(testArrRunCode);
        int expected = 13;//RunCode
        assertEquals(expected, actual);
    }
    @Test
    public void solutionBreakOut_Test_testCase3() throws NullPointerException, IndexOutOfBoundsException
    {
        int actual = testSolution.solutionBreakOut(testArr3);
        int expected = -6;//testCase3
        assertEquals(expected, actual);
    }
    @Test
    public void solutionBreakOut_Test_testCase7() throws NullPointerException, IndexOutOfBoundsException
    {
        int actual = testSolution.solutionBreakOut(testArr7);
        int expected = -19;//testCase7
        assertEquals(expected, actual);
    }
}
