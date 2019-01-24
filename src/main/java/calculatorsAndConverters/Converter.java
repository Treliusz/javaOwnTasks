package calculatorsAndConverters;

import java.util.ArrayList;
import java.util.List;

public class Converter {



    public String convertDecimalToBinary(int decNumber) {
        List<Integer> intList = new ArrayList<Integer>();
        StringBuilder stringBuilder = new StringBuilder();
        while (decNumber != 0){
            intList.add(decNumber % 2);
            decNumber /=2;
        }
        for (int i = intList.size() - 1; i >= 0 ; i--) {
            stringBuilder.append(intList.get(i));
        }

        return stringBuilder.toString();
    }

    public int convertBinaryToDecimal(String binNumber) {
        List<String> stringList = new ArrayList<String>();
        int counter = 1;
        int decimNumber = 0;

        for (int i = binNumber.length() - 1; i >= 0 ; i--) {
            decimNumber += Integer.parseInt(Character.toString(binNumber.charAt(i))) * counter;
            counter *=2;
        }

        return decimNumber;
    }
}
