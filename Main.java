import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Point2D p2 = new Point2D();
    p2.setX(5);
    p2.setY(10);
    System.out.println(p2.getX());
    System.out.println(p2.getY());
    // START #1
    System.out.println("Enter the person's first name");
    String nm = input.nextLine();
    System.out.println("Enter the person's last name");
    String lnm = input.nextLine();
    System.out.println("Enter the person's age");
    int ag = input.nextInt();
    input.nextLine();
    System.out.println("Enter the person's social security number");
    String ssn1 = input.nextLine();
    Person p1 = new Person();
    p1.setFirst(nm);
    p1.setLast(lnm);
    p1.setAge(ag);
    p1.setSSN(ssn1);
    System.out.println(p1.toString());
    // END #1
    // START #2
    
  }
}