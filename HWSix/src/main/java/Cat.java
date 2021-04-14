public class Cat extends Animal {
    int runLim = 200;
    int swimLim = 0;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void run(int distance) {
        if (distance <= runLim && distance > 0) {
            System.out.println("Котэ лениво пробегает " + distance + " метров");
        } else if (distance > runLim) {
            System.out.println("У котэ пушистая кость, поэтому котэ пробегает только " + runLim + " метров.");
            System.out.println("Оставшиеся " + (distance - runLim) + " метров котэ пробегать отказывается");
        } else if (distance < 0 && distance <= (runLim * (-1))) {
            System.out.println("Котэ разворачивается и лениво пробегает " + (distance * (-1)) + " метров");
        } else {
            System.out.println("У котэ пушистая кость, поэтому котэ пробегает только " + runLim + " метров после разворота.");
            System.out.println("Оставшиеся " + ((distance * (-1)) - runLim) + " метров котэ пробегать отказывается");
        }

    }

    public void swim(int distance) {
        System.out.println("Котэ категорически отказывается плыть.");
    }
}
