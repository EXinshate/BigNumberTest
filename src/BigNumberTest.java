import java.math.*;
import java.util.*;

public class BigNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw? ");
        int K = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        BigInteger n = in.nextBigInteger();

        BigInteger LotteryOdds = BigInteger.ONE;

        for (int i = 1; i <= K; i++)
            LotteryOdds = LotteryOdds.multiply(n.subtract(BigInteger.valueOf(i - 1))).divide(BigInteger.valueOf(i));

        System.out.printf("You odds are 1 in %s. Good luck!/n", LotteryOdds);
    }
}