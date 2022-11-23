public class soldierChecker {
    public boolean check(Soldier soldier) {
        if (soldier.age > 18 || soldier.age <= 30 && soldier.Children < 3 && katGod.KatGod == 'A') {
            System.out.println("Первый эшелон");
            return true;

        } if (soldier.age > 30 || soldier.age <= 45 && soldier.Children == 3 || soldier.Children < 4 && katGod.KatGod == 'B') {
            System.out.println("Второй эшелон");
            return true;

        } if (soldier.age>45 || soldier.age<60 && soldier.Children ==4 && katGod.KatGod == 'C' || katGod.KatGod == 'D'){
            System.out.println("Третий эшешлон");
            return true;
        } if (soldier.age>=60 && soldier.Children >4 && katGod.KatGod != 'A' || katGod.KatGod != 'B' || katGod.KatGod != 'C' || katGod.KatGod != 'D')
            System.out.println("Вы не подходтие");
        return false;
    }
}