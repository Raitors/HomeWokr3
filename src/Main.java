public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        byte b = 127; short s = 32767;
        int i = 2000000; long l = 423876123L;
        float f = 1.08F; double d = -123.345D;

        System.out.println("Значение переменной b с типом byte равно "+ b);
        System.out.println("Значение переменной s с типом short равно "+ s);
        System.out.println("Значение переменной i с типом int равно "+ i);
        System.out.println("Значение переменной l с типом long равно "+ l);
        System.out.println("Значение переменной f с типом float равно "+ f);
        System.out.println("Значение переменной d с типом double равно "+ d);

    }

    public static void task2 () {
        System.out.println("Задача 2");

        float f = 27.12F;
        long l = 987678965549L;
        double d = 2.786D;
        short s = 569;
        int i = -159;
        char c = 27897;
        byte b = 67;

    }
    public static void task3(){
        System.out.println("Задача 3");

        byte firstClass=23;
        byte secondClass=27;
        byte thirdClass=30;
        short allPaper =480;
        int paper = allPaper/(firstClass+secondClass+thirdClass);

        System.out.println("На каждого ученика рассчитано "+paper+ " листов бумаги");
    }
    public static void task4(){
        System.out.println("Задача 4");

        byte bottle=16;
        byte time=2;
        int performanceMachineMinute=bottle/time;
        int bottles20Minutes=performanceMachineMinute*20;
        int bottlesHour=bottles20Minutes*3;
        int bottlesDay=bottlesHour*24;
        int bottles3Day=bottlesDay*3;
        int bottlesMonth=bottles3Day*10;

        System.out.println("За 20 минут машина произвела "+bottles20Minutes+" штук бутылок");
        System.out.println("За сутки  машина произвела "+bottlesDay+" штук бутылок");
        System.out.println("За 3 дня  машина произвела "+bottles3Day+" штук бутылок");
        System.out.println("За месяц минут машина произвела "+bottlesMonth+" штук бутылок");
    }
    public static void task5(){
        System.out.println("Задача 5");

        byte cansPaint=120;
        byte cansWhitePaintClass=2;
        byte cansBrownPaintClass=4;
        int allClass=cansPaint/(cansWhitePaintClass+cansBrownPaintClass);
        int totalCansWhitePaint=(allClass*cansWhitePaintClass);
        int totalCansBrownPaint=(allClass*cansBrownPaintClass);

        System.out.println("В школе, где "+allClass+" классов, нужно "+totalCansWhitePaint+" банок белой краски и "+totalCansBrownPaint+" банок коричневой краски");

    }
    public static void task6(){
        System.out.println("Задача 6");

        byte bananasWeight=80;
        byte milkWeight=105;
        byte iceCreamWeight=100;
        byte eggWeight=70;
        byte countBanana=5;
        byte countMilk=2;
        byte countIceCream=2;
        byte countEgg=4;
        int weight= bananasWeight*countBanana+milkWeight*countMilk+iceCreamWeight*countIceCream+eggWeight*countEgg;
        double kgWeight=weight/1000D;
        System.out.println("Грамм : "+weight+" кг :"+kgWeight);

    }
    public static void task7(){
        System.out.println("Задача 7");
        byte weightKg=7;
        short lossMinWeight=250;
        short lossMaxWeight=500;
        int weightGm=weightKg*1000;
        double countMaxDay=weightGm/lossMinWeight;
        double countMinDay=weightGm/lossMaxWeight;
        double averageDay =(countMaxDay+countMinDay)/2D;
        System.out.printf("Минимальное кол-во дней : %.0f%n",countMinDay);
        System.out.printf("Максимальное кол-во дней : %.0f%n",countMaxDay);
        System.out.printf("Среднее кол-во дней: %.0f%n",averageDay);
    }
    public static void task8(){
        System.out.println("Задача 8");
        int masha=67760;
        int denis=83690;
        int kristina=76230;
        float increasePercent=1.1F;
        byte year=12;

        int upMasha= (int) (masha*increasePercent);
        int upDenis= (int) (denis*increasePercent);
        int upKristina= (int) (kristina*increasePercent);
       // int differenceMasha=upMasha*year-masha*year;
        //int differenceDenis=upDenis*year-denis*year;
        //int differenceKristina=upKristina*year-kristina*year;

        System.out.println("Маша теперь получает "+upMasha+" рублей. Годовой доход вырос на "+(upMasha*year-masha*year)+ " рублей");
        System.out.println("Денис теперь получает "+upDenis+" рублей. Годовой доход вырос на "+(upDenis*year-denis*year)+ " рублей");
        System.out.println("Кристина теперь получает "+upKristina+" рублей. Годовой доход вырос на "+(upKristina*year-kristina*year)+ " рублей");
    }
}
