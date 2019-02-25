public class Ques13 extends Exception
{
    Ques13(String message) {
        super(message);
    }
}


class CustomExceptonImpl {
    public static void main(String[] args) {
        try {
            throw new Ques13("Something went wrong");
        } catch (Ques13 e) {
            e.fillInStackTrace();
        }
    }

}