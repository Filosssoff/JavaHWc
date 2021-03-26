public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int aVar = (int) (Math.random() * (50000 + 1)) - 25000;
        int bVar = (int) (Math.random() * (50000 + 1)) - 25000;
        int sumAB = aVar + bVar;

        if (sumAB > 0){
            System.out.println ("Сумма положительна и равна " + sumAB);
        } else if (sumAB < 0){
            System.out.println ("Сумма отрицательна и равна " + sumAB);
        } else {
            System.out.println("Сумма равна " + sumAB);
        }

    }
    public static void printColor(){
        int value = (int) (Math.random() * (300 + 1)) - 100;
        int borderValueOne = 0;
        int borderValueTwo = 100;

        if (value <= borderValueOne ) {
            System.out.println("Красный");
        } else if (value > borderValueTwo) {
            System.out.println("Зелёный");
        } else {
            System.out.println("Жёлтый");
        }
    }
    public static void compareNumbers(){
        int a = (int) (Math.random() * (3000 + 1)) - 1500;
        int b = (int) (Math.random() * (3000 + 1)) - 1500;

        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
