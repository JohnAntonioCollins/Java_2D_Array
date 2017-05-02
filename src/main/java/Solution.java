/**
 * Created by John Antonio Collins on 5/2/17.
 * hackerrank.com Java 2D Array
 **/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//this is my actual solution that I pasted into hackerrank.com
public class Solution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
//MY CODE START
        int answer = -63;//the lowest possible sum
        int eachHourGlass;
        //PLAN: just try to calculate through the hourglass pattern and try/catch any exceptions
        //NOTE: this should work for any 2D array of minimum size 3 by 3.
        try
        {
            for (int k = 0; k < arr.length-2; k++)
            {
                for (int m = 0; m < arr[k].length-2; m++)
                {
                    eachHourGlass = 0;
                    //seperate lines for readability:
                    eachHourGlass += arr[k][m] + arr[k][m + 1] + arr[k][m + 2];
                    eachHourGlass += arr[k + 1][m + 1];
                    eachHourGlass += arr[k + 2][m] + arr[k + 2][m + 1] + arr[k + 2][m + 2];

                    if (eachHourGlass > answer)
                    {
                        answer = eachHourGlass;
                    }
                }
            }
        } catch (IndexOutOfBoundsException ioobE)
        {
        } catch (NullPointerException npE){
        }
        System.out.println(answer);
//MY CODE END
    }
}