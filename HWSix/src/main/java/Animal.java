public class Animal {
    String name;
    int age;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void run(int distance) {
        System.out.println("Животное пробежало " + distance + " метров");
    }

    protected void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " метров");
    }
}
