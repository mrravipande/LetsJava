public class typecasting {
    public static void main(String args[]) {
        // Widening Casting (automatically) - converting a smaller type to a larger type size

        byte a = 10;
        System.out.println(a);

        int b = a;
        System.out.println(b);

        long c = b;
        System.out.println(c);

        double d = c;
        System.out.println(d);

        // Narrowing Casting (manually) - converting a larger type to a smaller size type

        double dval = 130.1;
        int intval = (int) dval;
        System.out.println(intval);

        byte bval = (byte) intval;
        System.out.println(bval);

    }
}
