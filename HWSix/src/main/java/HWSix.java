import java.util.Scanner;

public class HWSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAct = 0;
        int catCount = 0;
        int dogCount = 0;

        Cat cats[] = new Cat[50];
        Dog dogs[] = new Dog[50];

        while (numAct != 9) {
            System.out.println("Что будем делать?");
            System.out.println("1 - добудем котэ");
            System.out.println("2 - добудем пёселя");
            System.out.println("3 - попросим котэ побегать");
            System.out.println("4 - попросим котэ поплавать");
            System.out.println("5 - попросим пёселя побегать");
            System.out.println("6 - попросим пёселя поплавать");
            System.out.println("7 - посчитаем добытых котэ");
            System.out.println("8 - посчитаем добытых пёселей");
            System.out.println("9 - хватит животину тиранить!");
            numAct = scanner.nextInt();

            switch (numAct) {
                case 1 : {
                    System.out.println("Как назовём котэ?");
                    String name = scanner.next();
                    System.out.println("Сколько лет котэ?");
                    int age = scanner.nextInt();
                    System.out.println("Какой порядковый номер присвоим котэ?");
                    int num = scanner.nextInt();
                    cats[num] = new Cat(name, age);
                    catCount++;
                    break;
                }

                case 2 : {
                    System.out.println("Как назовём пёселя?");
                    String name = scanner.next();
                    System.out.println("Сколько лет пёселю");
                    int age = scanner.nextInt();
                    System.out.println("Какой порядковый номер присвоим пёселю?");
                    int num = scanner.nextInt();
                    dogs[num] = new Dog(name, age);
                    dogCount++;
                    break;
                }

                case 3 : {
                    System.out.println("Какого именно котэ отправим на пробежку?");
                    int num = scanner.nextInt();
                    System.out.println("Какое расстояние предложим котэ?");
                    int distance = scanner.nextInt();
                    cats[num].run(distance);
                    break;
                }

                case 4 : {
                    System.out.println("Какого именно пёселя отправим на пробежку?");
                    int num = scanner.nextInt();
                    System.out.println("Какое расстояние предложим пёселю?");
                    int distance = scanner.nextInt();
                    cats[num].run(distance);
                    break;
                }

                case 5 : {
                    System.out.println("Какого котэ отправим плавать?");
                    int num = scanner.nextInt();
                    System.out.println("Какое расстояние предложим котэ?");
                    int distance = scanner.nextInt();
                    cats[num].swim(distance);
                    break;
                }

                case 6 : {
                    System.out.println("Какого пёселя отправим плавать?");
                    int num = scanner.nextInt();
                    System.out.println("Какое расстояние предложим пёселю?");
                    int distance = scanner.nextInt();
                    dogs[num].swim(distance);
                    break;
                }

                case 7 : {
                    System.out.println("В наличии имеется " + catCount + " котэ");
                    System.out.println();
                    break;
                }

                case 8 : {
                    System.out.println("В наличии имеется " + dogCount + " пёселей");
                    System.out.println();
                    break;
                }

                case 9 : {
                    System.out.println("Ну и правильно.");

                }
            }
        }
    }
}
