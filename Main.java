import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.##");

        System.out.println("Enter a fahrenheit degree ");
        double f = input.nextdouble();

        // fahrenheit to kelvin
        double k;
        k = (f + 459.67) * 5/9;

        System.out.println("The convertion to kelvin is: " + fmt.format(k));
    }
}
