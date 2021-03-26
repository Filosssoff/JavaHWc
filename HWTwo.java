import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HWTwo {
    public static void main(String[] args) throws IOException {
        Scanner enter = new Scanner(System.in);
        System.out.println("Первое число (попадание суммы в отрезок)");
        int entFirstS = enter.nextInt();
        System.out.println("Второе число (попадание суммы в отрезок)");
        int entSecondS = enter.nextInt();
        if (ifBetween(entFirstS , entSecondS)) {
            System.out.println("Сумма попадает в отрезок");
        } else {
            System.out.println("Сумма не попадает в отрезок");
        }
        System.out.println("Число для проверки отрицательности без bool");
        int entCheckOne = enter.nextInt();
        checkPosNeg(entCheckOne);
        System.out.println("Число для проверки отрицательности с bool");
        int entCheckTwo = enter.nextInt();
        if (checkPosNegBool(entCheckTwo)) {
            System.out.println("Число отрицательно");
        } else {
            System.out.println("Число неотрицательно");
        }
        System.out.println("Строчка символов");
        BufferedReader readOne = new BufferedReader(new InputStreamReader(System.in));
        String entString = readOne.readLine();
        System.out.println("Количество раз");
        int printOutAm = enter.nextInt();
        printSomeStrings(entString , printOutAm);
        System.out.println("Год");
        int entYear = enter.nextInt();
        if (isBissextile(entYear)) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
        enter.close();


    }
    public static boolean ifBetween(int firstVal, int secondVal) {
        int sumIfBetween = firstVal + secondVal;
        return (sumIfBetween >= 10) && (sumIfBetween <= 20);
    }
    public static void checkPosNeg(int checkThisInt){
        if (checkThisInt < 0) {
            System.out.println("Число отрицательно");
        } else {
            System.out.println("Число неотрицательно (положительно или ноль)");
        }
    }
    public static boolean checkPosNegBool(int checkThisInt) {
        return checkThisInt < 0;
    }
    public static void printSomeStrings(String printThis, int printAmount) {
        for (int iterAmount = 1; iterAmount <= printAmount; iterAmount++) {
            System.out.println(printThis);
        }
    }
    public static boolean isBissextile(int enterYear){
        boolean isBis;
        if ((enterYear % 4 == 0) || (enterYear % 400 == 0)) {
            isBis = true;
        } else if (enterYear % 100 == 0 ) {
            isBis = false;
        } else {
            isBis = false;
        }
        return isBis;
        /**
         * Слабо ориентируюсь в високосности.
         * Остаётся надеяться, что в пояснении к заданию
         * указаны правильные параметры определения таковой.
         */
    }


}
