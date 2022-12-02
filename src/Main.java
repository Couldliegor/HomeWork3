public class Main {
    public static void main(String[] args) {
        //1 - 2 задание
        int first = 27897;
        byte second = 67;
        short third = -159;
        long fourth = 987678965549L;
        float fifth = 2.786f;
        double sixth = 27.12;
        System.out.println("Значение переменной с типом int равно " + first + "!");
        System.out.println("Значение переменной с типом byte равно " + second + "!");
        System.out.println("Значение переменной с типом short равно " + third + "!");
        System.out.println("Значение переменной с типом long равно " + fourth + "!");
        System.out.println("Значение переменной с типом float равно " + fifth + "!");
        System.out.println("Значение переменной с типом double равно " + sixth + "!");
        //Задание 3(вспомнил, что забыл создать папку в самом начале ((

        var wholeCountOfStudents = 23 + 27 + 30;
        var paperCountPerStudent = 480 / wholeCountOfStudents;
        System.out.println("На каждого ученика рассчитано " + paperCountPerStudent + " листов бумаги");
        //программа компилируется !
        System.out.println();
        //задание 4
            int machinePer20Minutes = 16 * 20;
                System.out.println("За 20 минут машина произвела " +  machinePer20Minutes + " Штук бутылок");
            int machineEfficiencyPerDay = (1440 / 2) * 16; //1440 - количество минут в дне
                System.out.println("За день машина произвела " +  machineEfficiencyPerDay + " Штук бутылок");
            int machineEfficiencyPerThreeDays = machineEfficiencyPerDay * 3;
                System.out.println("За три дня машина произвела " +  machineEfficiencyPerThreeDays + " Штук бутылок");
            int machineEfficiencyPerMonth = machineEfficiencyPerDay * 30;//если в месяце 30 дней...
                System.out.println("За месяц машина произвела " + machineEfficiencyPerMonth + " Штук бутылок");
       //Небольшой оступ для удобства  ))
        System.out.println();
        //Задание 5
        int countOfColours = 120;
        int whiteJars = 2;
        int brownJars = 4;
        int generalJarsPerClass = whiteJars + brownJars;
            int coloursInGeneral = countOfColours / generalJarsPerClass;//num of classes
            whiteJars = whiteJars * coloursInGeneral;
            brownJars = brownJars * coloursInGeneral;
                System.out.println("In school, where are " + coloursInGeneral + " classes, need " + whiteJars + "jars of white color, and " + brownJars +  "jars of brown colour. ");
        //compiled successfully
            //отступ для удобства))
        System.out.println();
        //Задача 6
        int bananasFive = 5 * 80;
        int milkThoHundred = 105 * 2;
        int iceCreamTwoBricks = 2 * 100;
        int fourRawEggs = 4 * 70;
            float generalInGramms = bananasFive + milkThoHundred + iceCreamTwoBricks + fourRawEggs;
            float generalInKilos = generalInGramms / 1000;
            System.out.println("The whole recipe is " + generalInGramms + " in gramms, so " + generalInKilos + " in Kilos!");
    }
}
