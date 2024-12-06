public class Main {


    public static void main(String[] args){

    byte a = 1;
    System.out.println("Значение переменной " + "a "  + "с типом " + " byte" + " равно " + a );
    short b =2;
    System.out.println("Значение переменной " + "b " + "с типом " + " short" + " равно " + b);
    int c = 3;
    System.out.println("Значение переменной " + "c " + "с типом " + "int " + "равно " + c);
    long d =4L;
    System.out.println("Значение переменной " + "d " + "с типом " + "long " + "равно " + d );
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
    System.out.println(q
    );

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
    int bottleInTwentyMinutes = bottleInOneMinute *  twentyMinutes ;
    System.out.println("За " + twentyMinutes + " минут " + " машина произвела " + bottleInTwentyMinutes + " бутылок");
    int threeDays = 4320;
    int bottleInThreeDays = threeDays * bottleInOneMinute ;
    System.out.println("За три дня " + " машина производит " + bottleInThreeDays + " бутылок");
    int month = 43200 ;
    int bottleInOneMonth = month * bottleInOneMinute ;
    System.out.println("За один месяц " + "машина производит " + bottleInOneMonth + " бутылок" );


    }
}