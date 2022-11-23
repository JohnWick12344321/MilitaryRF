import java.util.Scanner;

public class SoldierInfoCollector {
    Soldier collectInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fio = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.print("Введите количество детей: ");
        int children = scanner.nextInt();
        return new Soldier(age, fio, children);
    }
}