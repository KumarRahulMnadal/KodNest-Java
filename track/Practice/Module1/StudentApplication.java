package track.Practice.Module1;

class Student {
  String name;
  int age;
  double height;
  Student(String name, int age, double height)
  {
    this.name = name;
    this.age = age;
    this.height = height;
  }
  void display()
  {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
  }
//   void input(String name, int age, double height)
//   {
//   this.name = name;
//   this.age = age;
//   this.height = height;
//   }
//   void display()
//   {
//     System.out.println("Name: " + name);
//     System.out.println("Age: " + age);
//     System.out.println("Height: " + height);
  }


public class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student("Rani",18,5.5);
       // s1.input("Rani", 19, 4.5);
      //  s1.display();
      s1.display();

        
    }

}
