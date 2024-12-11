public class Person
{
    private String first;
    private String last;
    private int age;
    private String SSN;
    public void setFirst(String name) {
        first = name;
    }
    public void setLast(String name) {
        last = name;
    }
    public void setAge(int x) {
        age = x;
    }
    public void setSSN(String s) {
        SSN = s;
    }
    public String toString() {
        String formatted = "SSN " + SSN + "\n Name: " + first + " " + last + " \n Age: " + age;
        return formatted;
    }
}
