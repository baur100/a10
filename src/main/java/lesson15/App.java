package lesson15;

public class App {
    public static void main(String[] args) {
        int a = 7;
        int b=1;
        int[]x = {1,2};

        System.out.println("Before try block");
        try{
            System.out.println("In the try block");
            x[1]=3;
            System.out.println("After first error");
            int c=a/b;
            System.out.println("After second error");

        } catch (ArithmeticException exception){
            System.out.println("In the divide by zero catch block");
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("In the out of bound catch block");
//            throw new ArrayIndexOutOfBoundsException("Critical error "+exception.getLocalizedMessage());
        } finally {
            System.out.println("In the finally block");
        }
        System.out.println("After try-catch block");
    }
}
