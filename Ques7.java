//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

        class Specialstack
        {
            int MAX = 10;
            List<Integer>  list = new LinkedList<>();
            void push (int i)
            {
                if(list.size()<MAX){
                    list.add(i);
                    System.out.println(i + "Element added successfully");
                }
                else
                {
                    System.out.println("Error: Stack overflow!!");
                }
            }
            void pop()
            {
                if(list.size()>0){
                    System.out.println(list.size()-1 + "Element removed succesfully");
                    list.remove(list.size()-1);
                }
                else{
                    System.out.println("Error: Stack Underflow");
                }

            }
            void isEmpty()
                {
                if(list.isEmpty())
                {
                    System.out.println("Stack is empty");
                }
                else{
                    System.out.println("Stack is not empty");
                }
        }
        void isFull()
                {
                if(list.size()== MAX)
                {
                    System.out.println("Stack is full");
                }
                else{
                    System.out.println("Stack is not full");
                }
        }
        int getmin()
        {
            if(list.isEmpty())
            {
                System.out.println("Errror: Stack is empty");
                return 0;
            }
            else
            {
                return Collections.min(list);
            }

        }
        }
public class Ques7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Specialstack sp = new Specialstack();
        while(true)
        {
            System.out.println("stack operations");
            System.out.println("1. Push a value");
            System.out.println("2. Pop a value");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Check if Stack is Full");
            System.out.println("5. Get Min Value");
            System.out.println("6. EXIT");
            switch (s.nextInt())
            {
                case 1:
                    System.out.println("enter the value");
                    sp.push(s.nextInt());
                    break;
                case 2:
                    sp.pop();
                    break;
                case 3:
                    sp.isEmpty();
                    break;
                case 4:
                    sp.isFull();
                    break;
                case 5:
                    System.out.println("Min value: "+ sp.getmin());
                    break;
                default:
                    System.out.println("Stack Data: " + sp.list);
                    System.exit(0);
            }
        }
    }
}
