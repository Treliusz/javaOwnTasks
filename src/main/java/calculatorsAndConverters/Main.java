package calculatorsAndConverters;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println("315 = " + converter.convertDecimalToBinary(315));
        System.out.println("101 = " + converter.convertBinaryToDecimal("101"));

    }
}
