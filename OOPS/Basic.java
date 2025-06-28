class Student {
    int id;
    String name;
    void setData(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id+","+name);
    }
    
}
public class Main {
public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData(1,"Baasith");
        Student s2 = new Student();
        s2.setData(2,"Sabari");
        s1.display();
        s2.display();
    }
}
