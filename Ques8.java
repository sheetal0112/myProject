//Write a program to format date as example "21-March-2016"
import java.text.SimpleDateFormat;
import java.util.Date;
public class Ques8 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMMM-yyyy");
        System.out.println("Date : "+ simpleDateFormat.format(date));
    }

}
