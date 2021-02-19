package lesson15_exerciseAtHome;

public class App {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;
        int[] x = {1, 2};

        System.out.println("Befor try block");

        try {
            System.out.println("In the try block");
            x[4]=3;
            System.out.println("After first error");
            int c = a / b;
            System.out.println("After second errror");
        } catch (ArithmeticException exception) {
            System.out.println("In the divide by zero catch block");
        } catch (ArrayIndexOutOfBoundsException exeption){
            System.out.println("In the out of bound catch block" );

 //           throw new ArrayIndexOutOfBoundsException("Critical error"+exeption.getMessage());
        } finally {
            System.out.println("In the finally block");
        }
        System.out.println("After try catch block");
        }

    }
