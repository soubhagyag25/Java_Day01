package Day02;
class Parent
{

public void msg(){
    System.out.println("I am Parent");
}
}
class Child extends Parent
{
    public void msg()
    {
        System.out.println("I am Child");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Parent obj=new Child();
        obj.msg();
        Child obj1=new Child();
        obj1.msg();

    }

}
