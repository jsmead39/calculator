import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt) {
        System.out.println(prompt);
        String retrieved = inputScanner.next();
        return retrieved;
    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        double retrieved = inputScanner.nextDouble();
        return retrieved;
    }
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // String promptOne = "Input a string";
        // System.out.println(getString(promptOne));

        // String promptTwo = "Double String";
        // System.out.println(getDouble(promptTwo));
        boolean moreMath = true;
        while (moreMath) {
            String promptOne = "Enter first number";
            double num1 = getDouble(promptOne);

            String promptTwo = "Enter second number";
            double num2 = getDouble(promptTwo);
            
            
            String calculation = "What would you like to do? \n" + "add \n" + "subtract \n" + "multiply \n" + "divide \n" + "exit";
                               
            
            String calcMethod = getString(calculation);                     

            Calculator calc = new Calculator();
            if(calcMethod.equals("add")) {
                System.out.println("The numbers added equals " + calc.add(num1,num2));
            }

            if(calcMethod.equals("subtract")) {
                System.out.println("The numbers subtracted equals " + calc.subtract(num1,num2));
            }

            if(calcMethod.equals("multiply")) {
                System.out.println("The numbers multiplied equals " + calc.multiply(num1,num2));
            }

            if(calcMethod.equals("divide")) {
                if (num2 == 0) {
                    System.out.println("Cannot divide by 0");
                } else {
                System.out.println("The numbers divided equals " + calc.divide(num1,num2));
                }
            }

            if(calcMethod.equals("exit")) {
                break;
            }

            String keepGoing = "Do you want to continue? y/n";
            String answer = getString(keepGoing);
            if (answer.equals("n")) {
                System.out.println("Goodbye");
                moreMath = false;

            }

            
        }

    }

    

}

