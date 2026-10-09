import java.util.Scanner;

public class Homework4
{

    static int gcd1(int m, int n)
    {
        int big, small;
        if (n == 0)
        {
            return m;
        }
        if(m-n>0)
        {
            big = m;
            small = n;
        }
        else
        {
            big = n;
            small = m;
        }

        int remainder = big % small;
        return gcd1(small, remainder);
    }
    static int gcd2(int m, int n)
    {

        while (n != 0)
        {
            int big, small;
            if(m-n>0)
            {
                big = m;
                small = n;
            }
            else
            {
                big = n;
                small = m;
            }
            int remainder = big % small;
            m = small;
            n = remainder;
        }
        return m;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = gcd2(num1, num2);

        System.out.printf("두 수의 최대공약수는 %d입니다.\n",result);

    }
}

