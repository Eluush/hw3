public class Main {

    public static void main(String[] args) {

        byte a = 1;
        System.out.println("Значение переменной " + "a " + "с типом " + " byte" + " равно " + a);
        short b = 2;
        System.out.println("Значение переменной " + "b " + "с типом " + " short" + " равно " + b);
        int c = 3;
        System.out.println("Значение переменной " + "c " + "с типом " + "int " + "равно " + c);
        long d = 4L;
        System.out.println("Значение переменной " + "d " + "с типом " + "long " + "равно " + d);
        float e = 5f;
        System.out.println("Значение переменной " + "e " + "с типом " + " float" + " равно " + e);
        double k = 6;
        System.out.println("Значение переменной " + "k " + " с типом" + " double " + "равно " + k);

        byte p = 67;
        System.out.println(p);
        short r = -159;
        System.out.println(r);
        short m = 27897;
        System.out.println(m);
        int s = 569;
        System.out.println(s);
        long n = 987678965549L;
        System.out.println(n);
        float v = 27.12f;
        System.out.println(v);
        double q = 2.786;
        System.out.println(q);

        byte oneClass = 23;
        byte twoClass = 27;
        byte threeClass = 30;
        int totalStudents = oneClass + twoClass + threeClass;
        System.out.println("Всего в трех классах " + totalStudents + " учеников");
        int paper = 480;
        int paperForEachStudent = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperForEachStudent + " листов бумаги");

        byte bottle = 16;
        byte time = 2;
        System.out.println("За " + time + " минуты " + " производится " + bottle + " бутылок");
        int bottleInOneMinute = bottle / time;
        System.out.println("За одну минуту производится " + bottleInOneMinute + " бутылок");
        int twentyMinutes = 20;
        int bottleInTwentyMinutes = bottleInOneMinute * twentyMinutes;
        System.out.println("За " + twentyMinutes + " минут " + " машина произвела " + bottleInTwentyMinutes + " бутылок");
        int threeDays = 4320;
        int bottleInThreeDays = threeDays * bottleInOneMinute;
        System.out.println("За три дня " + " машина производит " + bottleInThreeDays + " бутылок");
        int month = 43200;
        int bottleInOneMonth = month * bottleInOneMinute;
        System.out.println("За один месяц " + "машина производит " + bottleInOneMonth + " бутылок");

        int cans = 120;
        int cansPerClass = 2 + 4;
        System.out.println("На один класс необходимо " + cansPerClass + " банок с краской");
        int totalClasses = cans / cansPerClass;
        System.out.println("Всего в школе " + totalClasses + " классов");
        int whitePaint = 2 * totalClasses;
        int brownPaint = 4 * totalClasses;
        System.out.println("В школе,где " + totalClasses + " классов,нужно " + whitePaint + " банок белок краски и " + brownPaint + " банок коричневой краски");

        int weightOneBananas = 80;
        int numberOfBanans = 5;
        int weightFiveBanans = weightOneBananas * numberOfBanans;
        int milk = 105 * 2;
        int numberOfBriquette = 2;
        int weightBriquette = 100;
        int weightTwoBriquette = numberOfBriquette * weightBriquette;
        int numberOfEggs = 4;
        int weightEggs = 70;
        int weightFourEggs = numberOfEggs * weightEggs;
        int weightBreckfast = weightFiveBanans + milk + weightTwoBriquette + weightFourEggs;
        System.out.println("Вес спортивного завтрака составляет " + weightBreckfast + " грамм");
        float weightBreckfastInKilogram = weightBreckfast / 1000f;
        System.out.println("Вес завтрака составляет " + weightBreckfastInKilogram + " килограмм");

        int weightInKilogram = 7;
        int weightInGram = weightInKilogram * 1000;
        int weightInDay = 250;
        int day = weightInGram / weightInDay;
        System.out.println("Спортсмену нужно " + day + " дней,чтобы сбросить " + weightInKilogram + " кг,если он в день сбрасывает " + weightInDay + " грамм");
        int amountOfWeight = 500;
        int days = weightInGram / amountOfWeight;
        System.out.println("Спортсмену нужно " + days + " дней,чтобы сбросить " + weightInKilogram + " кг,если он в день сбрасывает " + amountOfWeight + " грамм");
        int average = (days + day) / 2;
        System.out.println("В среднем спортсмену понадобиться " + average + " день,чтобы сбросить " + weightInKilogram + " кг");

        int masha = 67760;
        int masha1 = masha / 100 * 10;
        int mashaUp = masha + masha1;
        int revenue = 67760 * 12;
        int revenue1 = mashaUp * 12;
        int difference1 = revenue1 - revenue;
        System.out.println("Маша теперь получает " + mashaUp + " рублей.Годовой доход вырос на " + difference1 + " рублей");
        int denis = 83690;
        int denis1 = denis / 100 * 10;
        int denisUp = denis + denis1;
        int revenueD = denis * 12;
        int revenueD1 = denisUp * 12;
        int difference2 = revenueD1 - revenueD;
        System.out.println("Денис теперь получает " + denisUp + " рублей в год.Годовой доход вырос на " + difference2 + " рублей");
        int kris = 76230;
        int kris1 = 76230 / 100 * 10;
        int krisUp = kris + kris1;
        int revenueK = kris * 12;
        int revenueK1 = krisUp * 12;
        int difference3 = revenueK1 - revenueK;
        System.out.println("Кристина теперь получает " + krisUp + " рублей в год.Годовой доход вырос на " + difference3 + " рублей");


    }
}