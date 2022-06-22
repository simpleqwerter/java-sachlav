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
        System.out.println("x = " + x); // x= -9

        y /= x + 5 % z;
        System.out.println("y = " + (y)); // -3


        z = x++ + y * 5;
        x = y - x++ * z;
        System.out.println("x, y, z = " + x + y + z);
    }
}
