package textQuestGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First {
    Second partTwo = new Second();

    public void start(){
        System.out.println("Тебе исполнилось 18 и тебя выгнали из дома, выбери где ты останешься на ночь. Выбери один из вариантов:");
        System.out.println("1. На лавочке с бомжами" + '\n' + "2. Попросить остаться у друга" + '\n' + "3. Набухаться");

        Scanner sc = new Scanner(System.in);
        int choose = 0;
        try {
            choose = sc.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            start();
        }

        if(choose == 1){
            badNight();
        }
        else if(choose == 2){
            goodNight();
        }
        else if(choose == 3){
            youDied();
        }
        else {
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            start();
        }
    }


    //1.
    void badNight(){
        System.out.println("Это была твоя худшая ночь, но ты нашел новых друзей Сифона и Димона.\n Что будешь делать:");
        System.out.println("1. Тусить с ними дальше" + '\n' + "2. Бежать к другу, ты понял, что это была плохая идея!");

        Scanner sc = new Scanner(System.in);
        int choose = 0;
        try {
            choose = sc.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            badNight();
        }

        if(choose == 1){
            partTwo.patty();
        }
        else if(choose == 2){
            goodNight();
        }
        else{
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            badNight();
        }

    }

    //2.
    void goodNight(){
        System.out.println("Тебя приютили. Ты выспался, хорошо поел и попил, но тебе больше запретили у них оставаться.'У него что своего дома нет?'\n Что будешь делать:");
        System.out.println("1. Останусь тут, теперь это мой дом!" + '\n' + "2. Предложить другу найти работу и снимать вместе хату!");

        Scanner sc = new Scanner(System.in);
        int choose = 0;
        try{
            choose = sc.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            goodNight();
        }

        if(choose == 1){
            youDied();
        }
        else if(choose == 2){
            partTwo.soloWay();
        }
        else{
            System.out.println("Неверный выбор. Попробуйте еще раз!");
            goodNight();
        }

    }

    //3.
    public void youDied(){
        System.out.println("Потрачено!");
    }




}

