public class Main {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
        homeWork3();
        homeWork4();
        homeWork5();
        homeWork6();
        homeWork7();
    }

    public static void homeWork1() {
        System.out.println("Задание 1");
        var clientOS = 0;
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else if (clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }
        System.out.println();
        System.out.println();
    }

    public static void homeWork2() {
        System.out.println("Задание 2");
        var clientDeviceYear = 2022;
        var clientOS = 1;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }

        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void homeWork3() {
        System.out.println("Задание №3");
        int year = 2012;
        boolean visYear = ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0;
        if (visYear) {
            System.out.println("Год висакосный");
        } else {
            System.out.println("Год не висакосный");
        }
        System.out.println();
    }

    public static void homeWork4() {
        System.out.println("Задача №4");
        var deliveryDistance = 19;
        var deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        System.out.println();


    }

    public static void homeWork5() {
        System.out.println("Задача 5");
        var monthNumber = 20;
        switch (monthNumber) {
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
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца нет");
        }


    }

    public static void homeWork6() {
        System.out.println("Задача №6");

        int age = 20;
        int salary = 80000;

        if (age >= 23) {
            if (salary >= 50000 && salary < 80000) {
                salary = salary * 3;
                double salary1 = salary * 1.2;
                System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + salary1 + " рублей");
            } else if (salary >= 80000) {
                salary = salary * 3;
                double salary1 = salary * 1.5;
                System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + salary1 + " рублей");
            }
        }

        if ((age >= 19) && (age < 23)) {
            if (salary >= 50000 && salary < 80000) {
                salary = salary * 2;
                double salary1 = salary * 1.2;
                System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + salary1 + " рублей");
            } else if (salary >= 80000) {
                salary = salary * 2;
                double salary1 = salary * 1.5;
                System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + salary1 + " рублей");
            }
        }
        System.out.println();
    }

    public static void homeWork7() {
        System.out.println("Задача 7");

        int age = 21;
        int salary = 25000;
        int wantedSum = 330000;
        double bet = 0.1;


        if (age < 23 && salary < 80000) {
            bet = bet + 0.01;
            int mainPay = wantedSum / 12;
            double sumProcent = wantedSum * bet / 12;
            double mainPayment = mainPay + sumProcent;
            if ((salary / 2) < mainPayment) {
                System.out.println("Максимальный платеж при ЗП " + salary + " равен " + mainPayment + " рублей. " +
                        "Платеж по кредиту " + wantedSum + " рублей. Отказано");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary + " равен " + mainPayment + " рублей. " +
                        "Платеж по кредиту " + wantedSum + " рублей. Одобрено");
            }
        } else if (age < 23 && salary > 80000) {
            bet = bet + 0.01;
            bet = bet - 0.007;
            int mainPay = wantedSum / 12;
            double sumProcent = wantedSum * bet / 12;
            double mainPayment = mainPay + sumProcent;
            if ((salary / 2) > mainPayment) {
                System.out.println("Максимальный платеж при ЗП " + salary + " равен " + mainPayment + " рублей. " +
                        "Платеж по кредиту " + wantedSum + " рублей. Одобрено");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary + " равен " + mainPayment + " рублей. " +
                        "Платеж по кредиту " + wantedSum + " рублей. Отказано");
            }


            if ((age >= 23 && age <= 30) && salary < 80000) {
                bet = bet + 0.005;
                int mainPay1 = wantedSum / 12;
                double sumProcent1 = wantedSum * bet / 12;
                double mainPayment1 = mainPay1 + sumProcent1;
                if ((salary / 2) > mainPayment1) {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + mainPayment1 + " рублей. " +
                            "Платеж по кредиту " + wantedSum + " рублей. Одобрено");

                } else {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + mainPayment1 + " рублей. " +
                            "Платеж по кредиту " + wantedSum + " рублей. Отказано");
                }

            } else if ((age >= 23 && age <= 30) && salary > 80000) {
                bet = bet + 0.005;
                bet = bet - 0.007;
                int mainPay2 = wantedSum / 12;
                double sumProcent2 = wantedSum * bet / 12;
                double mainPayment2 = mainPay2 + sumProcent2;

                if ((salary / 2) > mainPayment) {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + mainPayment2 + " рублей. " +
                            "Платеж по кредиту " + wantedSum + " рублей. Одобрено");
                } else {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + mainPayment2 + " рублей. " +
                            "Платеж по кредиту " + wantedSum + " рублей. Отказано");
                }

            }
        }
    }
}
