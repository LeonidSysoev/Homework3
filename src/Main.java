public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
         int age = 18;
         if (age >= 18) {
             System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
         }
         else {
             System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, " +
                     "нужно немного подождать");
         }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temp = -5;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 3;
        if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место  в университете");
        } else if (age >= 24) {
          System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }

    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 7;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе" +
                    " в сопровождении взрослого.");
        }else if (age >= 14 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе" +
                    " без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte wagonCapacity = 102;
        byte seats = 60;
        byte realPlaceInWagon = 80;
        boolean havePlaceInWagon = realPlaceInWagon > wagonCapacity;
        boolean haveSeatsInWagon = realPlaceInWagon <= wagonCapacity && realPlaceInWagon <= seats;
        boolean haveStandingPlaceInWagon = realPlaceInWagon >= seats && realPlaceInWagon <= wagonCapacity;
        if (haveSeatsInWagon) {
            System.out.println("В вагоне есть сидячие места");
        } else if (haveStandingPlaceInWagon) {
            System.out.println("В вагоне есть стоячие места");
        } else if (havePlaceInWagon) {
            System.out.println("В вагоне нет мест.");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 11;
        int two = 10;
        int three = 1;
        boolean oneMoreOthers = one > two && one > three;
        boolean twoMoreOthers = two > one && two > three;
        boolean threeMoreOthers = three > two && one < three;
        if (oneMoreOthers) {
            System.out.println("Число один больше всех.");
        } else if (twoMoreOthers) {
            System.out.println("Число два больше всех.");
        } else if (threeMoreOthers) {
            System.out.println("Число три больше всех.");
        }
    }
}