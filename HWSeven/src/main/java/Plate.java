public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int decreaseFood(int decAmount) {
        int eatenF;
        if (food >= decAmount) {
            eatenF = decAmount;
            food -= eatenF;
        } else {
            eatenF = (decAmount - (decAmount - food));
            food -= eatenF;

        }
        return eatenF;
    }

    public void increaseFood() {
        food += 80;
    }

    public void leftOver() {
        System.out.println("Food left : " + food);
    }


}
