public class CatCanEat {
    private String name;
    private int satiety;
    private int maxSatiety = 100;
    private int appetite;

    public CatCanEat(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        appetite = maxSatiety - satiety;
        satiety += plate.decreaseFood(appetite);
    }

    public void currSatiety() {
        System.out.println(name + "s satiety is " + satiety);
    }

}
