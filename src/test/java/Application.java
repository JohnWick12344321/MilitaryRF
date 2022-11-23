import java.util.Scanner;

public class Application {
    public static void main(String args[]) {
        SoldierInfoCollector soldierInfoCollector = new SoldierInfoCollector();
        Soldier soldier = soldierInfoCollector.collectInfo();
        Scanner scanner1 =new Scanner(System.in);
        System.out.print("Введите категорию годности: ");
        String KatGodString = scanner1.nextLine();
        char KatGod = KatGodString.charAt(0);
        katGod katGod = new katGod(KatGod);

        soldierChecker soldierChecker = new soldierChecker();
        soldierChecker.check(soldier);
    }
}