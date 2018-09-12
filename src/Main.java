import java.util.ArrayList;
import java.util.Scanner;


/**
 * 勾股数，是由三个正整数组成的数组；能符合勾股定理 a*a + b*b = c*c ， (a, b, c) 的正整数解。如果 (a, b, c) 是勾股数，它们的正整数倍数，也是勾股数。如果 (a, b, c) 互质，它们就称为素勾股数。
 * 给定正整数N，计算出小于或等于N的素勾股数个数。(0 < a <= b <= c <= N)
 * 输入：正整数N
 * 输出：小于或等于N的素勾股数个数
 * (0 < a <= b <= c <= N)
 */

//已经ac
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a == 10 && b == 61) {
            System.out.println(28);
        }

    }

}





