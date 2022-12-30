public class Main {

    public static void main(String[] args) {
        //-128 до 127  1 byte
        byte byteValue = 127;

        //-32768 до 32767 2 bytes
        short shortValue = 32767;

        // -2 147 483 648 до 2 147 483 647. 4 bytes
        int intValue = 123;

        // -9223372036854775808 до 9223372036854775 807 8 bytes
        long longValue = 123L;

        // від -3.4 * 1038 до 3.4 * 1038 4 bytes
        float floatValue = 12.5f;

        // ±4.9*10 -324 до ±1.8*10 308 8 bytes
        double doubleValue = 12.6;

        // 2 bytes
        char charValue = '^';

        // 1 bytes
        boolean booleanValue = true;

        Boolean booleanWrapper = Boolean.FALSE;

        int testIntValue = byteValue;

        byteValue = (byte) intValue;

        int testIntValue2 = 3000000;

        testIntValue2 = (byte) 12;

        System.out.println(testIntValue2);

        byte testByteValue = (byte) 129L;


        Integer integer = Integer.valueOf("1243");
        Double aDouble = Double.MAX_VALUE;

        Double aDouble2 = Double.MAX_VALUE;

        System.out.println(testByteValue);
    }

    public void testMethod() {
        int someValue = 5;
        Double aDouble = Double.valueOf("123.5");
        System.out.println(aDouble);
    }
}
