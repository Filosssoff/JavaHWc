public class Dog extends Animal {
    int runLim = 500;
    int swimLim = 10;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run(int distance) {
        if (distance <= runLim && distance > 0) {
            System.out.println("Пёсель бодро пробегает " + distance + " метров");
        } else if (distance > runLim) {
            System.out.println("Пёсель весьма активен, поэтому пробегает только " + runLim + " метров, после чего отвлекается.");
            System.out.println("Оставшиеся " + (distance - runLim) + " метров пёселю бежать не интересно");
        } else if (distance < 0 && distance <= (runLim * (-1))) {
            System.out.println("Пёсель разворачивается и бодро пробегает " + (distance * (-1)) + " метров");
        } else {
            System.out.println("Пёсель пробегает только " + runLim + " метров после разворота.");
            System.out.println("Оставшиеся " + ((distance * (-1)) - runLim) + " метров пёселю бежать не интересно");
        }

    }

    public void swim(int distance) {
        if (distance > 0 && distance <= swimLim) {
            System.out.println("Пёсель бодро проплывает " + distance + " метров");
        } else if (distance > swimLim) {
            System.out.println("Пёсель бодро проплывает " + swimLim + " метров");
            System.out.println("Оставшиеся " + (distance - swimLim) + " метров пёселю плыть не интересно");
        } else {
            System.out.println("Пёсель оборачивается и пытается найти воду, чтобы поплыть.");
            System.out.println("К сожалению, водоёма позади пёселю найти не удаётся");
        }
    }
}
