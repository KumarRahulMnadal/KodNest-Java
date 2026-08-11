package track.Practice.Module1;

public class EmpApplication {
    
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 11;
        e1.name = "Rahul";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();

        Employee e2 = new Employee();
        e2.id = 12;
        e2.name = "Mohit";
        System.out.println(e2.id);
        System.out.println(e2.name);
        e2.work();
    }
}
class Employee
    {
        int id;
        String name;
        void work()
        {
            System.out.println("Working");
        }
    }