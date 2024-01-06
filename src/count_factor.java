import java.util.Scanner;

public class count_factor {
    public static void main(String[] args) {
        int n, fact;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = x.nextInt();
        fact = CountFactorReduced(n);
        System.out.println("Factors : " + fact);
    }
    static int CountFactor(int n) {
        int cnt = 0, i;
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    static int CountFactorReduced(int n) {
        int cnt = 0, i, root_n = 0;
        for (i = 1; i < n; i++) {
            if (i * i == n) {
                root_n = i;
            }
        }
        System.out.println("n : "+n);
        System.out.println("root n : "+root_n);
        if (root_n != 0) {
            for (i = 1; i < root_n; i++) {
                if (n % i == 0) {
                    if (i != (n / i)) {
                        cnt += 2;
                    } else {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}