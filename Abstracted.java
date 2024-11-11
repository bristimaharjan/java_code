
abstract class Animal{
    public abstract void eat ();
    public void sleep()
    {
        System.out.println("Animal sleep");
    }
}
class Dog extends  Animal{
    public void eat ()
    {
        System.out.println("Dog eats  ");

    }

}
class Cat extends  Animal{
    public void eat ()
    {
        System.out.println("Cat eats  ");

    }

}
public class Abstracted {
    public static void main (String [] args){
        Animal obj= new Dog();

        obj.eat();
        obj.sleep();
        obj= new Cat();
        obj.eat();
        obj.sleep();

    }

}

