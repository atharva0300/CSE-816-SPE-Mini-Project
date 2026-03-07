import java.util.Scanner;

public class Main {

    public static double sqrt(double x){
        return Math.sqrt(x);
    }

    public static long factorial(int x){
        long result = 1;
        for(int i=1;i<=x;i++)
            result *= i;
        return result;
    }

    public static double ln(double x){
        return Math.log(x);
    }

    public static double power(double x,double b){
        return Math.pow(x,b);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter number: ");
                    double x = sc.nextDouble();
                    System.out.println("Result = " + sqrt(x));
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    int f = sc.nextInt();
                    System.out.println("Result = " + factorial(f));
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    double ln = sc.nextDouble();
                    System.out.println("Result = " + ln(ln));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter power: ");
                    double pow = sc.nextDouble();
                    System.out.println("Result = " + power(base,pow));
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}