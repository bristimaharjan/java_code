import java.util.*;
class Car2 {
    String model;
    String color;
    int year;
    public Car2 (){}
    public Car2 (String model1,String color1,int year1)
    {
        model=model1;
        color=color1;
        year=year1;
    }
    
}
public class Tesla2 extends Car{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter model :");
        String model1= scan.nextLine();
        System.out.println("Enter color:");
        String color1=scan.nextLine();
        System.out.println("Enter year :");
        int year1=scan.nextInt();
        Car2 car = new Car2(model1,color1,year1);
        System.out.println("Model:"+car.model);
        System.out.println("Color :"+car.color);
        System.out.println("Year :"+car.year);

    }
}
