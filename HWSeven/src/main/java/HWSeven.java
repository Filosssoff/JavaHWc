public class HWSeven {
    public static void main(String[] args) {
        Plate plate1 = new Plate(160);
        CatCanEat cats[] = new CatCanEat[7];
        cats[0] = new CatCanEat("Testo1", 0);
        cats[1] = new CatCanEat("Testo2", 0);
        cats[2] = new CatCanEat("Testo3", 0);
        cats[3] = new CatCanEat("Testo4", 0);
        cats[4] = new CatCanEat("Testo5", 0);
        cats[5] = new CatCanEat("Testo6", 0);
        cats[6] = new CatCanEat("Testo7", 0);

        for (int indCats = 0; indCats < cats.length; indCats++) {
            plate1.leftOver();
            cats[indCats].currSatiety();
            cats[indCats].eat(plate1);
            plate1.leftOver();
            cats[indCats].currSatiety();
            plate1.increaseFood();
            plate1.leftOver();
            System.out.println("------------");
        }
    }
}
