import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();
    p1.x = 0;
    p2.y = 1;
    System.out.println(p1.x);
    System.out.println(p2.y);
    Dog d1 = new Dog();
    d1.breed = "gshepherd";
    d1.size = "big";
    d1.furColor = "brown";
    System.out.println(d1.size);
    System.out.println(d1.bark());
    // Create objects and test your classes in here
  }
}
