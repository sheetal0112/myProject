public class Ques5 {
    int a;
    int b;

    public Ques5(int a, int b){
        this.a=a;
        this.b=b;
    }

    public Ques5(Ques5 ref){
        a=ref.a;
        b=ref.b;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        A obj = new A();
        obj.i=1;
        obj.j=3;

        A obj1=(A)obj.clone();
        obj1.j=9;
        System.out.println(obj.j+ " "+ obj1.j);


        Ques5 o = new Ques5(4,6);
        Ques5 o1= new Ques5(o);
        o1.a=10;

        System.out.println(o.a+" "+o1.a);
    }
}

class A  implements Cloneable {
    int i;
    int j;
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}