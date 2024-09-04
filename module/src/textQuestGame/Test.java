package textQuestGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

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
                patty();
            }
            else if(choose == 2){
                goodNight();
            }
            else{
                System.out.println("Неверный выбор. Попробуйте еще раз!");
                badNight();
            }

        }

    public void patty(){
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
                soloWay();
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


    public void soloWay(){
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

    public void findPizza(){
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

    public void bigBoys(){
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

    public void manager(){
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

    public void skuf(){
        System.out.println("Ты стал скуфом и провел свою жизнь на вахте");
    }

    public void badShavuha(){
        System.out.println("Это прокатило, но шаурма с вокзала дала о себе знать, ты словил инфекцию и откинулся");
    }

    public void finish(){
        System.out.println("WIN");
    }
}
