class Student
{
    int rollno;
    String name;
    Student(int r, String n)
    {
        this.rollno=r;
        this.name=n;
    }
    Student(Student s)
    {
        s.rollno=28;
    }
    void display()
    {
        System.out.print(rollno+" "+name);
    }
    public static void main(String[] args){
        Student s1 = new Student(11,"ABC");
        Student s2 = new Student(s1);
        s1.display();
    }
}