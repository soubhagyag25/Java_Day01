package Day01;

public class ObjectAndClass {
    int a = 10,b=20;
    double c = 12.5;
    String str = new String("hello");
    public void showStates(){
        System.out.println("the value of a is :- "+a);
        System.out.println("the value of b is :- "+b);
        System.out.println("the sum of and b is :- "+(a+b));
        System.out.println("the value of c is :- "+c);
        System.out.println("the value of str is :- "+str);
    }

    public static void main(String[] args) {
       ObjectAndClass objectAndClass = new ObjectAndClass();
       objectAndClass.showStates();
    }
}
