import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Point2D p2 = new Point2D();
    p2.setX(5);
    p2.setY(10);
    System.out.println(p2.getX());
    System.out.println(p2.getY());
     System.out.println("Enter the person's first name");
        String nm = input.nextLine();

        System.out.println("Enter the person's last name");
        String lnm = input.nextLine();

        System.out.println("Enter the person's age");
        int ag = input.nextInt();
        
        // Consume the leftover newline character
        input.nextLine();  // This reads and discards the leftover newline

        System.out.println("Enter the person's social security number");
        String ssn1 = input.nextLine();

        Person p1 = new Person();
        p1.setFirst(nm);
        p1.setLast(lnm);
        p1.setAge(ag);
        p1.setSSN(ssn1);

        System.out.println(p1.toString());
    /*Dog d1 = new Dog();
    d1.breed = "gshepherd";
    d1.size = "big";
    d1.furColor = "brown";
    System.out.println(d1.size);
    System.out.println(d1.bark());*/
    // Create objects and test your classes in here
  }
}
