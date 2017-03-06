/**
 * Created by Administrator on 3/6/17.
 */
public class Compute
{
    double num1,num2;
    public double ComputeThis(double x,double y)
    {
        num1 = x;
        num2 = y;
        double calculation;
        calculation = num1 * num2;
        System.out.println(calculation);
        return calculation;
    }
}
