import java.util.Scanner;

class MyCalc {
    private Scanner sc;  // use one scanner for whole class

    public MyCalc(Scanner sc) {
        this.sc = sc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalc obj = new MyCalc(sc);

        while (true) {
            // take inputs from the user and decide which has to be performed
            System.out.println("Choose an operation : + , - , * , / , % ");
            String input = sc.next();
            char ch = input.charAt(0);

            obj.chooseOperation(ch);

            // Ask user whether to exit
            System.out.println("Do you want to exit? (y/n) ");
            String exitInput = sc.next();
            char ch1 = exitInput.charAt(0);

            if (ch1 == 'y' || ch1 == 'Y') {
                System.out.println("Exiting program...");
                break;
            }
        }

        sc.close();
    }

    public int getInteger(String message){
        System.out.print(message);
        return sc.nextInt();
    }

    public void chooseOperation(char ch) {
        int num1, num2;

        switch (ch) {
            case '+':
                num1 = getInteger("Enter your 1st no.: ");
                num2 = getInteger("Enter your 2nd no.: ");
                System.out.println("Addition Result : " + (num1 + num2));
                break;

            case '-':
                num1 = getInteger("Enter your 1st no.: ");
                num2 = getInteger("Enter your 2nd no.: ");
                System.out.println("Subtraction Result : " + (num1 - num2));
                break;

            case '*':
                num1 = getInteger("Enter your 1st no.: ");
                num2 = getInteger("Enter your 2nd no.: ");
                System.out.println("Multiplication Result : " + (num1 * num2));
                break;

            case '/':
                num1 = getInteger("Enter your numerator: ");
                num2 = getInteger("Enter your denominator: ");
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Division Result : " + (num1 / num2));
                }
                break;

            case '%':
                num1 = getInteger("Enter your 1st no.: ");
                num2 = getInteger("Enter your 2nd no.: ");
                if (num2 == 0) {
                    System.out.println("Error: Modulus by zero is not allowed.");
                } else {
                    System.out.println("Modulus Result : " + (num1 % num2));
                }
                break;

            default:
                System.out.println("Unknown operation! Please choose +, -, *, /, or %.");
                break;
        }
    }
}
