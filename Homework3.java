import java.util.Scanner;
public class Homework3
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int i = scanf.nextInt();
        int [] a = new int [i]; // 입력 받은 만큼 배열 크기 생성
        System.out.print("수를 입력하세요: ");
        for(int n=0;n<i;n++)
        {
            a[n] = scanf.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for(int n=0;n<i;n++) //c프로그래밍1 최댓값 최솟값 함수 구현//
        {

            if (a[n] > max)
                max = a[n];
        }
        for(int n=0;n<i;n++)
        {

            if (a[n] < min)
                min = a[n];
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);







    }
}