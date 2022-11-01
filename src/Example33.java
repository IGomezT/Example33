import java.util.Scanner;

public class Example33 {
    public static void main(String[] args) {

        double n;
        double y = 0;
        double x;
        double difference;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write a number");
        n = inputValue.nextDouble();
        x = n;
        difference = x - y;

        while (difference >= 0.000001) {
            y = 0.5 * (x + n / x);
            difference = x - y;
            if (difference < 0) {
                difference = -difference;
            }
            x = y;
        }
        System.out.println("Result " + y);


    }
}
