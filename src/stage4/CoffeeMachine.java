package stage4;

import java.util.Scanner;

public class CoffeeMachine {
    Scanner scanner = new Scanner(System.in);
    int cups;
    int waterN;
    int milkN;
    int coffeeN;
    int money;

    public CoffeeMachine() {
        this.cups = 9;
        this.waterN = 1200;
        this.milkN = 540;
        this.coffeeN = 120;
        this.money = 550;
    }

    public void setCups(int cups) {
        this.cups += cups;
    }

    public void setWaterN(int waterN) {
        this.waterN += waterN;
    }

    public void setMilkN(int milkN) {
        this.milkN += milkN;
    }

    public void setCoffeeN(int coffeeN) {
        this.coffeeN += coffeeN;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String askAnswer(String ask) {
        System.out.println(ask);
        return scanner.nextLine();
    }

    public void makeEspresso() {
        this.waterN -= 250;
        this.cups -= 1;
        this.coffeeN -= 16;
        this.money += 4;

    }

    public void makeLatte() {
        this.milkN -= 75;
        this.waterN -= 350;
        this.cups -= 1;
        this.coffeeN -= 20;
        this.money += 7;
    }

}