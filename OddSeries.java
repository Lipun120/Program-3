package OddSeriesConditional;
import java.util.Scanner;

public class OddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        // If even, reduce by 1 to make it odd
        if (a % 2 == 0) {
            a = a - 1;
        }

        for (int i = 0; i < a; i++) {
            int odd = 2 * i + 1;
            System.out.print(odd);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }
    }
}
