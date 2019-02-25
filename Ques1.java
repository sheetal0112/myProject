//Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
import java.util.*;
public class Ques1 {
    public static void main(String args[])
    {
        Float s = 0.0f;
        List<Float> list = new ArrayList<>();
        list.add(78.35f);
        list.add(254.68f);
        list.add(17.56f);
        list.add(15.21f);
        list.add(90.24f);
        ListIterator<Float> listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            s = s + listIterator.next();
        }
        System.out.println("The total sum is :" + s);

    }

}
