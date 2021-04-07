import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static char[][] map;

    public static Scanner scanner = new Scanner(System.in);

    public static Random random = new Random();

    public static void main(String[] args) {
        int gameParams[] = initParams();
        initMap(gameParams);
        printMap(gameParams);
        while (true) {
            humanTurn();
            printMap(gameParams);
            if (checkWin(DOT_X, gameParams)) {
                System.out.println("Скайнет повержен!Победа за Сопротивлением!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
            compTurn(gameParams);
            printMap(gameParams);
            if (checkWin(DOT_O, gameParams)) {
                System.out.println("Скайнет победил. Инициация ядерного апокалипсиса...");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
        }
        System.out.println("Игра закончена");

    }

    public static int[] initParams() {
        System.out.println("Введите длину стороны игрового поля");
        int mapSize = scanner.nextInt();
        System.out.println("Введите длину линии для победы");
        int winLength = scanner.nextInt();
        int gameParams[] = {mapSize, winLength};
        return gameParams;
    }

    public static char[][] initMap(int[] gameParams) {
        map = new char[gameParams[0]][gameParams[0]];
        for (int mapIndR = 0; mapIndR < gameParams[0]; mapIndR++) {
            for (int mapIndC = 0; mapIndC < gameParams[0]; mapIndC++) {
                map[mapIndR][mapIndC] = DOT_EMPTY;
            }
        }
        return map;
    }

    public static void printMap(int[] gameParams) {
        for (int indInd = 0; indInd < gameParams[0] + 1; indInd++) {
            System.out.print(indInd + " ");
        }
        System.out.println();
        for (int printIndR = 0; printIndR < gameParams[0]; printIndR++) {
            System.out.print((printIndR + 1) + " ");
            for (int printIndC = 0; printIndC < gameParams[0]; printIndC++) {
                System.out.print(map[printIndR][printIndC] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isCellEmpty(int indRow, int indCol) {
        if (indRow < 0 || indRow > map.length || indCol < 0 || indCol > map[0].length) {
            return false;
        }
        if (map[indRow][indCol] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int mapIndRow = 0; mapIndRow < map.length; mapIndRow++) {
            for (int mapIndCol = 0; mapIndCol < map[0].length; mapIndCol++) {
                if (map[mapIndRow][mapIndCol] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char symbCh, int[] gameParams) {
        //Строки
        for (int indRow = 0; indRow < map.length; indRow++) {
            int countDownToExtinction = 0;
            for (int indCol = 0; indCol < (map[indRow].length); indCol++) {
                if (map[indRow][indCol] == symbCh) {
                    countDownToExtinction++;
                } else {
                    countDownToExtinction = 0;
                }
                if (countDownToExtinction == gameParams[1]) {
                    return true;
                }

            }
        }
        //Столбцы
        for (int indCol = 0; indCol < map[0].length; indCol++) {
            int countDownToExtinction = 0;
            for (int indRow = 0; indRow < (map.length); indRow++) {
                    if (map[indRow][indCol] == symbCh) {
                        countDownToExtinction++;
                    } else {
                        countDownToExtinction = 0;
                    }
                    if (countDownToExtinction == gameParams[1]) {
                        return true;
                    }
            }
        }
        //Диагонали слева направо
        for (int indRow = 0; indRow < (map.length + 1 - gameParams[1]); indRow++) {
            int countDownToExtinction = 0;
            for (int indCol = 0; indCol < (map[0].length + 1 - gameParams[1]); indCol++) {
                if (map[indRow][indCol] == symbCh) {
                    for (int indRC = 0; indRC < gameParams[1]; indRC++) {
                        if (map[indRow][indCol] == map[indRow + indRC][indCol + indRC]) {
                            countDownToExtinction++;
                        } else {
                            countDownToExtinction = 0;
                        }
                        if (countDownToExtinction == gameParams[1]) {
                            return true;
                        }
                    }
                }
            }
        }
        //Диагонали справа налево
        for (int indRow = 0; indRow < (map.length + 1 - gameParams[1]); indRow++) {
            int countDownToExtinction = 0;
            for (int indCol = (gameParams[1] - 1); indCol < map[0].length; indCol++) {
                if (map[indRow][indCol] == symbCh) {
                    for (int indRC = 0; indRC < gameParams[1]; indRC++) {
                        if (map[indRow][indCol] == map[indRow + indRC][indCol - indRC]) {
                            countDownToExtinction++;
                        } else {
                            countDownToExtinction = 0;
                        }
                        if (countDownToExtinction == gameParams[1]) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    public static void humanTurn() {
        int xCoordHT, yCoordHT;
        do {
            System.out.println("Введите координаты хода в формате X Y (через пробел)");
            xCoordHT = scanner.nextInt() - 1;
            yCoordHT = scanner.nextInt() - 1;
        } while (!isCellEmpty(xCoordHT, yCoordHT));
        map[xCoordHT][yCoordHT] = DOT_X;
    }

    public static void compTurn(int[] gameParams) {
        int xRand, yRand;
        do {
            xRand = random.nextInt(gameParams[0]);
            yRand = random.nextInt(gameParams[0]);
        } while (!isCellEmpty(xRand, yRand));
        map[xRand][yRand] = DOT_O;
        System.out.println("Скайнет занял точку : " + (xRand + 1) + " " + (yRand+1));
    }

}
