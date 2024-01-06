import java.util.Scanner;
public class SumofN {
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int n,sum;
        System.out.println("Enter N : ");
        n = x.nextInt();

        sum = sumofNatural(n);
        System.out.println("Sum of N natural Number : "+sum);
        sum = sumofWhole(n);
        System.out.println("Sum of N Whole Number : "+sum);
    }
    static int sumofNatural(int n){
        // sum of N natural numbers
        return n*(n+1)/2;
    }
    static int sumofWhole(int n){
        // sum of N Whole numbers
        return ((n-1)*n)/2;
    }
}
