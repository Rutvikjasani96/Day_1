import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int square,ans;
        System.out.println("Enter a Perfect Square : ");
        square = x.nextInt();
        ans = squareRoot(square);
        System.out.println("Square root : "+ans);
    }
    static int squareRoot(int square){
        for(int i=1;i<square;i++){
            if(i*i==square){
                return i;
            }
        }
        return 0;
    }
}
