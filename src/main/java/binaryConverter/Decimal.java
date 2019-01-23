package binaryConverter;

import java.util.ArrayList;
import java.util.List;

public class Decimal {



    public String convert(int decNumber) {
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
}
