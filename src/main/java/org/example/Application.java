package org.example;

public class Application {
    public static void main(String args[]) {
        SoldierInfoCollector soldierInfoCollector = new SoldierInfoCollector();
        Soldier soldier = soldierInfoCollector.collectInfo();

        soldierChecker soldierChecker = new soldierChecker();
        soldierChecker.check(soldier);
    }
}