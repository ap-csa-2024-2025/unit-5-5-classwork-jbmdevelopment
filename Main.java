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
    Person p3 = new Person();
    p3.setFirst(p1.getFirst());
    p3.setLast(p1.getLast());
    p3.setAge(p1.getAge());
    p3.setSSN(p1.getSSN());
    System.out.println(p1.toString());
    System.out.println(p1.equals(p3));
    Oven oven = new Oven();
    boolean ovenStatus = true; // object created so assume its on?
    String status = "";
    while(ovenStatus) { // run as long as it's on :)
        //oven.getStatus();
        System.out.println("Test");
        //System.out.println("To preheat the oven enter \"p\" to turn the oven off enter \"o\", \n"
        //"to restart enter \"r\", to quit enter \"q\"");
        status = input.nextLine().toLowerCase();
        if(status.equals("p")) {

        } else if(status.equals("o")) {
          ovenStatus = false; // use a getter later (im lazy lol)
        } else if(status.equals("r")) {
          
        } else if(status.equals("q")) {

        }
    }

    // END #1
    // START #2
    
    // END #2
  }
}