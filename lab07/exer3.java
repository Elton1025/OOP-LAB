public class exer3 {
    public static void main(String[] args) {

        Integer intObj = 100;
        Double doubleObj = 3.14;
        Character charObj = 'A';
        Boolean boolObj = true;
        Byte byteObj = 10;
        Short shortObj = 500;
        Long longObj = 123456789L;
        Float floatObj = 2.718f;

        int intValue = intObj;
        double doubleValue = doubleObj;
        char charValue = charObj;
        boolean boolValue = boolObj;
        byte byteValue = byteObj;
        short shortValue = shortObj;
        long longValue = longObj;
        float floatValue = floatObj;

        System.out.println("Autoboxed values:");
        System.out.println("Integer: " + intObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Character: " + charObj);
        System.out.println("Boolean: " + boolObj);
        System.out.println("Byte: " + byteObj);
        System.out.println("Short: " + shortObj);
        System.out.println("Long: " + longObj);
        System.out.println("Float: " + floatObj);

        System.out.println("\nUnboxed values:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + boolValue);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
    }
}