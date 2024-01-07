public class hello {

    public static void main(String[] args) {

        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // variable
        // int a = 10;
        // int b = 20;
        // System.out.println(a);
        // System.out.println(b);
        // String name = "piyush";
        // System.out.println(name);

        // datatype- byte,short,char,boolean,int,float,long,double
        // byte b = 8;
        // System.out.println(b);
        // char ch = 'a';
        // System.out.println(ch);
        // boolean var = true;
        // System.out.println(var);

        // type conversion
        // byte > short > int > float > long > double

        // Type Promotion in Expressions--
        // 1. Java automatically promotes each byte, short, or char operand to hit
        // when evaluating an Expressions.

        // 2. If one operand is long, float or double the whole expression is promoted
        // to long, float, or double respectively.

        // que 1
        // int x = 2;
        // int y = 5;

        // int exp1 = (x * y / x);
        // int exp2 = (x * (y / x));

        // System.out.println(exp1 + ",");
        // System.out.println(exp2);

        // que2
        // int x = 200, y = 50, z = 100;
        // if (x > y && y > z) {
        // System.out.println("Hello");
        // }
        // if (z > y && z < x) {
        // System.out.println("Java");
        // }
        // if ((y + 200) < x && (y + 150) < z) {
        // System.out.println("Hello Java");
        // }

        // que3
        // int x, y, z;
        // x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z);

        // que4
        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b *
        // y);
        // System.out.println(exp);

        // que5
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);

    }
}