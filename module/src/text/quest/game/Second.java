package text.quest.game;

import java.util.InputMismatchException;
import java.util.Scanner;

import static text.quest.game.First.youDied;

public class Second {

    public static void patty(){
        System.out.println("Тебе выдали место возле мусорки. Ты голодный и хочешь пить. Сифон предлагает пошариться в помойке, а Димон украсть шаурму у вокзала");
        System.out.println("1. Пойду с Сифоном" + '\n' + "2. Пойду с Димоном");

        Scanner sc = new Scanner(System.in);
        int choose = 0;

        try {
            choose = sc.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            patty();
        }

        if(choose == 1){
            findPizza();
        }
        else if(choose == 2){
            bigBoys();
        }
        else{
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            patty();
        }
    }

    public static void soloWay(){
        System.out.println("Друг отказался, но ты решил не отпускать руки и поехал на вахту\n Что будешь делать:");
        System.out.println("1. Таскать мешки!" + '\n' + "2. Халтурить!" + '\n' + "3. Угнать самосвал :)");

        Scanner sc = new Scanner(System.in);
        int choose = 0;
        try{
            choose = sc.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            soloWay();
        }

        if(choose == 1){
            manager();
        }
        else if(choose == 2){
            youDied();
        }
        else if(choose == 3){
            skuf();
        }
        else{
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            soloWay();
        }
    }

    public static void findPizza(){
        System.out.println("Вы нашли пиццу, но выглядит она не очень, на ней много плесени. Сифон говорит, что это сыр дорблю");
        System.out.println("1. Съесть" + '\n' + "2. Пойти с Димоном");

        Scanner sc = new Scanner(System.in);
        int choose = 0;
        try{
            choose = sc.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            findPizza();
        }

        if(choose == 1){
            youDied();
        }
        else if(choose == 2){
            bigBoys();
        }
        else{
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            findPizza();
        }
    }

    public static void bigBoys(){
        System.out.println("Вы вкусно поели, но за вами пришли крупные ребята");
        System.out.println("1. Драться!" + '\n' + "2. Притворится мертвым!");
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        try{
            choose = sc.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            bigBoys();
        }

        if(choose == 1){
            youDied();
        }
        else if(choose == 2){
            badShavuha();
        }
        else{
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            bigBoys();
        }
    }

    public static void manager(){
        System.out.println("Ты заработал грыжу, но есть плюсы, тебя заметил директор и повысил, теперь ты менеджер");
        System.out.println("1. Открыть свой бизнес" + '\n' + "2. Набухаться");

        Scanner sc = new Scanner(System.in);
        int choose = 0;
        try{
            choose = sc.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            manager();
        }

        if(choose == 1){
            finish();
        }
        else if(choose == 2){
            youDied();
        }
        else{
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            manager();
        }

    }

    public static void skuf(){
        System.out.println("Ты стал скуфом и провел свою жизнь на вахте");
    }

    public static void badShavuha(){
        System.out.println("Это прокатило, но шаурма с вокзала дала о себе знать, ты словил инфекцию и откинулся");
    }

    public static void finish(){
        System.out.println("WIN");
    }
}
