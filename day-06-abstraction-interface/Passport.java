public class Passport {
    int rollno;
    String name;

    // Proper constructor
    Passport(int a, String b) {
        this.rollno = a;
        this.name = b;
    }

    // Copy constructor
    Passport(Passport s) {
        this.rollno = s.rollno;
        this.name = s.name;
    }

    void display() {
        System.out.println(rollno + " " + name);
    }

    public static void main(String[] args) {
        Passport obj = new Passport(12, "ABC");   // normal constructor
        Passport obj1 = new Passport(obj);        // copy constructor
        obj.display();
        obj1.display();
    }
}
