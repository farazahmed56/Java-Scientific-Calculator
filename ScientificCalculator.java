import java.util.*;
public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice;
        double num1, num2, result;

do {


    System.out.println("\n\nScientific Calculator Menu");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Division");
    System.out.println("4. Multiplication");
    System.out.println("5. Square Root");
    System.out.println("6. Cube Root");
    System.out.println("7. Power");
    System.out.println("8. Round Off");
    System.out.println("9. Absoulte value");
    System.out.println("10. Sine");
    System.out.println("11. Cosine");
    System.out.println("12. Tangent");


    System.out.print("\nEnter No 1 to 12: ");
    choice = scan.nextInt();

    switch (choice) {

        case 1:
            System.out.println("\nAddition");
            System.out.print("Enter 1st Number: ");
            num1 = scan.nextDouble();
            System.out.print("Enter 2nd Number: ");
            num2 = scan.nextDouble();
            result = num1 + num2;
            System.out.print("The Sum of Given Numbers is: " + result);

            break;

        case 2:
            System.out.println("\nSubtraction");
            System.out.print("Enter 1st Number: ");
            num1 = scan.nextDouble();
            System.out.print("Enter 2nd Number: ");
            num2 = scan.nextDouble();
            result = num1 - num2;
            System.out.print("The Difference of Given Numbers is: " + result);

            break;

        case 3:
            System.out.println("\nDivision");
            System.out.print("Enter 1st Number: ");
            num1 = scan.nextDouble();
            System.out.print("Enter 2nd Number: ");
            num2 = scan.nextDouble();
            result = num1 / num2;
            System.out.print("The Quotient of Given Numbers is: " + result);

            break;

        case 4:
            System.out.println("\nMultiplication");
            System.out.print("Enter 1st Number: ");
            num1 = scan.nextDouble();
            System.out.print("Enter 2nd Number: ");
            num2 = scan.nextDouble();
            result = num1 * num2;
            System.out.print("The Product of Given Numbers is: " + result);

            break;
        case 5:
            System.out.println("\nFind the Square Root");
            System.out.print("Enter a Number: ");
            num1 = scan.nextDouble();
            result = Math.sqrt(num1);
            System.out.printf("The Square Root of %.1f is: %.1f", num1, result);

            break;

        case 6:
            System.out.println("\nFind the Cube Root");
            System.out.print("Enter a Number: ");
            num1 = scan.nextDouble();
            result = Math.cbrt(num1);
            System.out.printf("The Cube Root of %.1f is: %.1f", num1, result);

            break;

        case 7:
            System.out.println("\nFind the Power");
            System.out.print("Enter the base Number: ");
            num1 = scan.nextDouble();
            System.out.print("Enter the Exponent: ");
            num2 = scan.nextDouble();
            result = Math.pow(num1,num2);
            System.out.printf("The Power of %.1f is: %.1f", num1, result);

            break;

        case 8:
            System.out.println("\n\nRound Off");
            System.out.print("Enter a Number: ");
            num1 = scan.nextDouble();
            result = Math.round(num1);
            System.out.print("The Round Off of "+num1+" is: "+result);

            break;
        case 9:
            System.out.println("\n\nFind the Absolute Value");
            System.out.print("Enter a Number: ");
            num1 = scan.nextDouble();
            result = Math.sin(num1);
            System.out.printf("The Absolute value of %.1f is: %.1f", num1, result);

            break;

        case 10:
            System.out.println("\nSine");
            System.out.print("Enter an Angle in Radius: ");
            num1 = scan.nextDouble();
            result = Math.sin(num1);
            System.out.printf("The Sine of %.1f is: %.3f", num1, result);

            break;
        case 11:
            System.out.println("\nCosine");
            System.out.print("Enter an Angle in Radius: ");
            num1 = scan.nextDouble();
            result = Math.cos(num1);
            System.out.printf("The Cosine of %.1f is: %.1f", num1, result);

            break;
            case 12:
            System.out.println("\nTangent");
            System.out.print("Enter an Angle in Radius: ");
            num1 = scan.nextDouble();
            result = Math.tan(num1);
            System.out.printf("The Tangent of %.1f is: %.1f", num1, result);

            break;
        default:
            System.out.println("Invalid Choice! Please enter a number between 1 and 12");
    }


}
while (choice != 13) ;

scan.close();
    }

}
