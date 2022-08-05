import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }

                    break;
                case 2:
                    System.out.println("Draw the square triangle botton-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("Draw the square triangle top-left");
                    for (int i = 5; i >=1 ; i--) {
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("*");

                        }
                        System.out.println("");
                    }
                    System.out.println("Draw the square triangle top-right");
                    for (int i = 1; i <=5 ; i++) {
                        for (int j = 1; j<=i-1 ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <=6-i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");

                    }
                    System.out.println("Draw the square triangle botton-right");
                    for (int i = 1; i <=5 ; i++) {
                        for (int j = 1; j <=5-i ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");

                    }
                    break;
                case 3:
                    System.out.println("Draw isosceles triangle");
                    for (int i = 1; i <=6 ; i++) {
                        for (int j = 1; j <=6-i ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <=2*i-1 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

