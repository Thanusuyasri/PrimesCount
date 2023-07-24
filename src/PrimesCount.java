import java.util.Scanner;

public class PrimesCount {
    public static int factor(int num)
    {
        int count =0;
        if(num == 1 || num==0)
        {
            return 0;
        }
        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                if(i==num/i)
                {
                    count++;
                }
                else
                {
                    count+=2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count =0;
        for(int i=0;i<=num;i++)
        {
            count=(factor(i)==2)?count+1:count;
        }
        System.out.println(count);
    }
}
