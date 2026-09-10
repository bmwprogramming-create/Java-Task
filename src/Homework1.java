import java.util.Scanner;
public class Homework1
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner plus= new Scanner(System.in);
        for(int a=0;a<5;a++)
        {

            System.out.print("정수를 입력하세요: ");

            int n = plus.nextInt();

            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n",sum+=n);

        }
    }
}
