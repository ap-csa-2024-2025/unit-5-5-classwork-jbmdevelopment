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
    public int getAge() {
        return age;
    }
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }
    public String getSSN(){
        return SSN;
    }
    public String toString() {
        String formatted = "\tSSN " + SSN + "\n \tName: " + first + " " + last + " \n \tAge: " + age;
        return formatted;
    }
    public boolean equals(Object other) {
        if(other == null) {
            return false;
        }
        Person temp = (Person) other;
        if(age == temp.getAge() && first.equals(temp.getFirst()) && last.equals(temp.getLast()) &&
         SSN.equals(temp.getSSN())+_) {
            return true;
        }
        return false;
    }
}
