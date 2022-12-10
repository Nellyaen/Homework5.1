public class Main {
    public static void main(String[] args) {
        //task 1
        int clientIos = 0;
        int clientAndroid = 1;
        if (clientIos == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        }
        if (clientAndroid == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //task 2

        int clientDeviceYear = 2017;
        if (clientIos == 0 && clientDeviceYear > 2015) {
            System.out.println("Приложение будет работать корректно");
        } else if (clientIos == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        }
        if (clientAndroid == 1 && clientDeviceYear > 2015) {
            System.out.println("Приложение будет работать корректно");
        } else if (clientAndroid == 1 && clientDeviceYear < 2015) ;
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //task3
        int year = 2021;
        int everyFourYear = 4; //високосным является каждый четвертый год
        if (year == 2021 / everyFourYear) {
            System.out.println(year + " Високосный год");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //task 4
        //int deliveryDistance = 95;
        //int twentyKm = 1;
        //int twentyToSixtyKm = twentyKm + 1;
        //int sixtyToOneHundredKm = twentyToSixtyKm + 1;
        //if (twentyKm ==20) {
           // System.out.println("Потребуется " + twentyKm + "дней");
        //else if (twentyToSixtyKm >=20 && <=60) {
            //System.out.println("Потребуется " + twentyToSixtyKm + "дней");
        //else {
           // System.out.println("Потребуется " + sixtyToOneHundredKm + "дней");


        //task 5
        int monthNumber =12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
        System.out.println("Не существует");
        }





        }

    }






