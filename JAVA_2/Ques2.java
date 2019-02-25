import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String");
        String input=sc.next();
        System.out.println("Original string is: "+input);
        String output=sortString(input);
        System.out.println("After Sort string: "+output);
    }
    public static String sortString(String input){
        char[] cA = input.toCharArray();
        char temp;
                for(int i=0;i<input.length();i++)
                {
                    for(int j=i+1;j<input.length()-1;j++)
                    {
                        if(cA[i]>cA[j])
                        {
                            temp=cA[i];
                            cA[i]=cA[j];
                            cA[j]=temp;
                        }
                    }
                }

        return new String(cA);
    }
}

