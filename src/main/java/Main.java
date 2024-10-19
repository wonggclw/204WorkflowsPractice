import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        Calculator numCrunch = new Calculator();

        while(true){
            System.out.println("Welcome to tiny calc!");
            System.out.println("input o for options");
            System.out.println("- Please input your command: ");
            String input = scanner.nextLine();
            String[] parsedInput = input.split(" ");

            String command = parsedInput[0];
            if(input == "o" || input == "O"){
                System.out.println("Command list:");
                System.out.println("- add num1 num2");
                System.out.println("- sub num1 num2");
                System.out.println("- mult num1 num2");
                System.out.println("- div num1 num2");
                System.out.println("- bin num1");
                System.out.println("- fib num1");
                System.out.println("Commands must be spelled correctly and have the same case.");
                continue;
            }

            switch (command) {
                case "add":
                    int add1 = Integer.parseInt(parsedInput[1]);
                    int add2 = Integer.parseInt(parsedInput[2]);

                    int addSum = numCrunch.add(add1, add2);
                    System.out.println(addSum);
                    continue;
                case "sub":
                    int sub1 = Integer.parseInt(parsedInput[1]);
                    int sub2 = Integer.parseInt(parsedInput[2]);

                    int subSum = numCrunch.subtract(sub1, sub2);
                    System.out.println(subSum);
                    continue;
                case "mult":
                    int mult1 = Integer.parseInt(parsedInput[1]);
                    int mult2 = Integer.parseInt(parsedInput[2]);

                    int multSum = numCrunch.multiply(mult1, mult2);
                    System.out.println(multSum);
                    continue;
                case "div":
                    int div1  = Integer.parseInt(parsedInput[1]);
                    int div2 = Integer.parseInt(parsedInput[2]);

                    int divSum = numCrunch.divide(div1, div2);
                    System.out.println(divSum);
                    continue;
                case "bin":
                    int bin1  = Integer.parseInt(parsedInput[1]);

                    String binSum = numCrunch.intToBinaryNumber(bin1);
                    System.out.println(binSum);
                    continue;
                case "fib":
                    int fib1 = Integer.parseInt(parsedInput[1]);

                    int fibSum = numCrunch.fibonacciNumberFinder(fib1);
                    System.out.println(fibSum);
                    continue;
                default:
                    System.out.println("Sorry, incorrect command. Please enter a new command.");
                    continue;
            }
        }
    }
}
