package DAY_5;

class Student {
    String name;
    int age;

    Student(String n , int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
class main{
    public static void main(String[] args) {
        Student s1 = new Student("Thareesh" ,  21);
        s1.display();
    }
}
    
}
