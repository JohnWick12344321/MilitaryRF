package org.example;

public class soldierChecker {
    public boolean check(Soldier soldier) {
        if (soldier.age > 18 && soldier.age < 30 && soldier.Children < 3 && soldier.category == 'A' && (soldier.speciality == Speciality.Svyazist || soldier.speciality == Speciality.SNIPER || soldier.speciality == Speciality.TANKIST)) {
            System.out.println("Первый эшелон");
            return true;

        } else if (soldier.age > 18 && soldier.age <= 45 && (soldier.Children == 3 || soldier.Children < 4 && soldier.category == 'B' || soldier.category == 'A' && soldier.speciality == Speciality.TEXNIK || soldier.speciality == Speciality.Voditel)) {
            System.out.println("Второй эшелон");
            return true;

        } else if (soldier.age >= 60 || soldier.category == 'D') {
            System.out.println("Вы не подходите");
            return true;
        } else {
            System.out.println("Третий эшелон");
            return false;
        }
    }
}