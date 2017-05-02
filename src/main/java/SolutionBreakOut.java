/**
 * @Author John Antonio Collins
 * Created on 5/2/17.
 */
//this is an easily testable version of the solution
public class SolutionBreakOut
{

    public int solutionBreakOut(int[][] arr)
    {
//MY CODE START
        int answer = -63;
        int eachHourGlass;
        int counter = 1;
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
                    //test:
                    //System.out.println(eachHourGlass +" answer number "+ counter);
                    counter ++;
                    if (eachHourGlass > answer)
                    {
                        answer = eachHourGlass;
                    }
                }
            }
        } catch (IndexOutOfBoundsException e)
        {
           // System.out.println("IndexOutOfBoundsException");
        } catch (NullPointerException n){
           // System.out.println("NullPointerException");
        }
        //System.out.println(answer);
//MY CODE END
    return answer;
    }
}
