package lesson_03;

public class HomeworkVariables {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
//
//        result = i2 / d1 + (d2 % i1) - l;
//        System.out.println("result = " + result);
//
//        int a = 5;
//        int b = 8;
//
//        System.out.println("result = " + (a-- - --a + ++a + a++ + a));
//        System.out.println("b = " + (++b - b++ + ++b - --b));

        // Second slide:
        int x = 10;
        int y = 12;
        int z = 3;
        x += y - x++ * z;
        System.out.println("x = " + x); // x= -8

        z = --x - y * 5;
        System.out.println("z = " + z); // z= -69


        System.out.println("============================");
        // тут Java не отрабаьывает действие '/=' | рассмотрим подробнее:
        // y /= x + 5 % z;
        System.out.println("y = " + y); // в данный момент y=12

        // первое действие : взятие остатка от деления (5 % (-69)) : ответ = 5
        System.out.println("5 % (-69) = " + 5 % (-69) + " correct!"); // 5  correct!

        // второе действие : х + 5   -> -8 + 5 -> ответ = -3
        System.out.println("x + 5 = " + (x + 5) + " correct!"); // -3  correct!

        // третье действие (/=): y = 12/(-3)= -4 !!!    тут вместо деления выполняется простое присвоение
        System.out.println("y / (-3) = " + (y / (-3) ) + " correct!"); // -4  correct!

        // разберем весь пример у /= (-8 + (5 % (-69)) =>  y=12/(-8+5) =  ответом должно быть  -4 !!! -bug found
        System.out.println("y /= x + 5 % z = " + (y /= x + 5 % z)); // -3  bug found

        System.out.println("============================");
        System.out.println("y = " + y);

        z = x++ + y * 5;
        x = y - x++ * z;
        System.out.println("x, y, z = " + x + y + z);
    }
}
