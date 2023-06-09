import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean isnotprime=false;
        for (int i = 2; i*i <= n; i++) {
            if (n%i==0){
                isnotprime=true;
                break;
            }
        }
        if (isnotprime) System.out.println("It is not a prime number");
        else System.out.println("It is not a prime number");
        sc.close();
    }
}