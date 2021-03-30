import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class HWThree {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Первая задача");
        arrOneZero();

        System.out.println("Вторая задача");
        countToHundred();

        System.out.println("Третья задача");
        multLessSix();

        System.out.println("Четвёртая задача");
        diagCross();

        System.out.println("Пятая задача");
        System.out.println("Введите длину для создания массива");
        int len = enter.nextInt();
        System.out.println("Введите значение для заполнения массива (одно на весь массив)");
        int initVal = enter.nextInt();
        System.out.println("Получился массив:");
        int arrShow[] = arrConstr(len, initVal);
        for (int arrInd = 0; arrInd < arrShow.length; arrInd++) {
            System.out.print(arrShow[arrInd] + " ");
        }
        System.out.println();

        System.out.println("Шестая задача");
        arrfindMinMax();

        System.out.println("Седьмая задача");
        System.out.println("Введите длину массива");
        int arrLen = enter.nextInt();
        int arrEntFindIf[] = new int[arrLen];
        System.out.println("Рандом или вручную? 1 - рандом, 2 -вручную");
        int randOrHand = enter.nextInt();
        if (randOrHand == 1) {
            for (int arrInd = 0; arrInd < arrEntFindIf.length; arrInd++) {
                arrEntFindIf[arrInd] = (int) ((Math.random() * (250 + 1)) - 125);
            }
        } else if (randOrHand == 2) {
            System.out.println("Введите массив");
            for (int arrInd = 0; arrInd < arrEntFindIf.length; arrInd++) {
                arrEntFindIf[arrInd] = enter.nextInt();
            }
        }

        if (isSideSumsEqual(arrEntFindIf) == true) {
            System.out.println("Нашлось место с равными суммами");
        } else {
            System.out.println("Найти место с равными суммами не удалось");
        }

    }

    /**
     * Делаем массив из единиц и нулей
     * меняем единицы на нули и нули на единицы
     */
    public static void arrOneZero() {
        int arrLenRand = (int) (Math.random() * 30);
        int arrSwitchOneZero[] = new int[arrLenRand];
        int indArr;
        for (indArr = 0; indArr < arrSwitchOneZero.length; indArr++) {
            arrSwitchOneZero[indArr] = (int) (Math.random() * 2);
        }
        System.out.println("Был массив:");
        for (indArr = 0; indArr < arrSwitchOneZero.length; indArr++) {
            System.out.print(arrSwitchOneZero[indArr] + " ");
        }
        System.out.println();
        System.out.println("Стал массив:");
        for (indArr = 0; indArr < arrSwitchOneZero.length; indArr++) {
            if (arrSwitchOneZero[indArr] == 0) {
                arrSwitchOneZero[indArr] = 1;
            } else {
                arrSwitchOneZero[indArr] = 0;
            }
        }
        for (indArr = 0; indArr < arrSwitchOneZero.length; indArr++) {
            System.out.print(arrSwitchOneZero[indArr] + " ");
        }
        System.out.println();
    }

    /**
     * Массив длиной в сто элементов заполняем числами от одного до ста
     */
    public static void countToHundred() {
        int arrCountToHund[] = new int[100];
        for (int arrInd = 0; arrInd < arrCountToHund.length; arrInd++) {
            arrCountToHund[arrInd] = arrInd +1;
        }
        System.out.println("Посчитаем до ста:");
        for (int arrInd = 0; arrInd < arrCountToHund.length; arrInd++) {
            System.out.print(arrCountToHund[arrInd] + " ");
            if ((arrInd + 1) % 25 == 0) {
                System.out.println();
            }
        }
    }

    /**
     * Ищем числа меньше шести и умножаем на два
     */
    public static void multLessSix() {
        int arrMultLessSix[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задан массив:");
        for (int indArr = 0; indArr < arrMultLessSix.length; indArr++) {
            System.out.print(arrMultLessSix[indArr] + " ");
        }
        System.out.println();
        System.out.println("Умножаем на 2 элементы, меньшие 6:");
        for (int indArr = 0; indArr < arrMultLessSix.length; indArr++) {
            if (arrMultLessSix[indArr] < 6) {
                arrMultLessSix[indArr] = arrMultLessSix[indArr] * 2;
            }
            System.out.print(arrMultLessSix[indArr] + " ");
        }
        System.out.println();
    }

    /**
     * Заполняем единицами диагонали квадратного двухмерного
     * целочисленного массива
     */
    public static void diagCross() {
        int arrSize = (int) (Math.random() * 40);
        int arrDiagCross[][] = new int[arrSize][arrSize];
        System.out.println("Возьмём двухмерный массив:");
        for (int indArr2 = 0; indArr2 < arrSize; indArr2++) {
            for (int indArr1 = 0; indArr1 < arrSize; indArr1++) {
                System.out.print(arrDiagCross[indArr1][indArr2] + " ");
            }
            System.out.println();
        }
        System.out.println("Заменим диагональные элементы на единицы:");
        for (int indArr1 = 0; indArr1 < arrSize; indArr1++) {
            for (int indArr2 = 0; indArr2 < arrSize; indArr2++) {
                if (indArr1 == indArr2) {
                    arrDiagCross[indArr1][indArr2] = 1;
                } else if (indArr2 == arrSize - (indArr1 + 1)) {
                    arrDiagCross[indArr1][indArr2] = 1;
                }
            }
        }
        for (int indArr2 = 0; indArr2 < arrSize; indArr2++) {
            for (int indArr1 = 0; indArr1 < arrSize; indArr1++) {
                System.out.print(arrDiagCross[indArr1][indArr2] + " ");
            }
            System.out.println();
        }

    }

    /**
     * Узнаём длину массива и значение (одно на все элементы)
     * Возвращаем соответствующий массив
     * @param len - длина массива
     * @param initialValue - значение
     * @return arrConstrL - готовый массив
     */
    public static int[] arrConstr (int len, int initialValue) {
        int arrConstrL[] = new int[len];
        Arrays.fill(arrConstrL, initialValue);
        return arrConstrL;
    }

    /**
     * Берём одномерный массив, ищем среди значений минимум и максимум
     */
    public static void arrfindMinMax () {
        System.out.println("Возьмём массив:");
        int randLen = (int) (Math.random() * 45 + 1);
        int randMultEl = 147;
        int arrMinMax[] = new int[randLen];
        for (int arrInd = 0; arrInd < arrMinMax.length; arrInd++) {
            arrMinMax[arrInd] = (int) (Math.random() * (randMultEl + 1)) - (randMultEl / 2);
        }
        int findMax = MIN_VALUE;
        int findMin = MAX_VALUE;
        for (int arrInd = 0; arrInd < arrMinMax.length; arrInd++) {
            if (arrMinMax[arrInd] > findMax) {
                findMax = arrMinMax[arrInd];
            }
            if (arrMinMax[arrInd] < findMin) {
                findMin = arrMinMax[arrInd];
            }
        }
        for (int arrInd = 0; arrInd < arrMinMax.length; arrInd++) {
            System.out.print(arrMinMax[arrInd] + " ");
        }
        System.out.println();
        System.out.println("Максимальный элемент - " + findMax);
        System.out.println("Минимальный элемент - " + findMin);
    }

    /**
     *Берём задаваемый массив, ищем место, в котором сумма левой и правой части массива равны
     * @param arrSideSums - непустой целочисленный массив
     * @return - true, если есть место, в котором сумма левой и правой части массива равны
     */
    public static boolean isSideSumsEqual (int arrSideSums[]) {
        int sumAll = 0;
        boolean ifFound = false;
        for (int arrInd = 0; arrInd < arrSideSums.length; arrInd++) {
            sumAll += arrSideSums[arrInd];
        }
        int sumLeft = arrSideSums[0];
        int sumRight = sumAll - arrSideSums[0];
        if (arrSideSums.length < 2) {
            ifFound = false;
        } else if (arrSideSums.length == 2) {
            if (arrSideSums[0] == arrSideSums[1]) {
                ifFound = true;
            }
        } else {
            for (int arrInd = 1; arrInd < arrSideSums.length && sumLeft != sumRight; arrInd++) {
                sumLeft = sumLeft + arrSideSums[arrInd];
                sumRight = sumRight - arrSideSums[arrInd];
            }
            if (sumLeft == sumRight) {
                ifFound = true;
            }
        }

        System.out.println("Массив :");
        for (int arrInd = 0; arrInd < arrSideSums.length; arrInd++) {
            System.out.print(arrSideSums[arrInd] + " ");
        }
        System.out.println();
        System.out.println("Сумма слева = " + sumLeft);
        System.out.println("Сумма справа = " + sumRight);
        System.out.println("Общая сумма = " + sumAll);

        return ifFound;
    }


}
