public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNum;
    int salary;
    int age;

    public Employee(String fullName, String position, String email, String phoneNum, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public void infoFull() {
        System.out.println("---------------------------");
        System.out.println("Full name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Phone number: " + phoneNum);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("---------------------------");
    }

    public int getAge() {
        return age;
    }
}
