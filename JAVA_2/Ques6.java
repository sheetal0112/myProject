import java.util.InputMismatchException;
import java.util.Scanner;

public class Ques6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quotient = 0;
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            quotient  =  num1 / num2;
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Quotient is : "+ quotient);
        }

    }
}
