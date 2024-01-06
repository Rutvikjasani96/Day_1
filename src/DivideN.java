import java.util.Scanner;
public class DivideN {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n,cnt=0;
        System.out.println("Enter N : ");
        n = x.nextInt();
        for(;n!=1;n=n/2){
            System.out.println(n);
            cnt++;
        }
        System.out.println("cnt : "+cnt);
    }
}
