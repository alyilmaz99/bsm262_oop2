package week2;
public class week2 {
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int a = add(3, 5);
        int integerValue = 3;
        double doubleValue = 3;
        char characterValue = '3';
        boolean boolValue = true;
        short shortValue = 3;
        byte byteValue = 3;
        long longValue = 3;
        float floatValue = 3;

        // javada program auto casting yapabilir.
        // typecasting 
        int typec1 = (int)characterValue;
        System.out.println(typec1);
        short typec2 = (short) integerValue;
        System.out.println(typec2);
        System.out.println(a);
    }
}
