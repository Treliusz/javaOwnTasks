package calculatorsAndConverters;

import org.junit.Before;
import org.junit.Test;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.Assert.assertEquals;



public class ConverterTest {
    Converter converter;

    @Before
    public void before() {
        converter = new Converter();
    }

    @Test
    public void should_return_binary_representation() {

        int decNumberA = 1;
        int decNumberB = 2;
        int decNumberC = 67;
        int decNumberD = 125;

        String resultA = converter.convertDecimalToBinary(decNumberA);
        String resultB = converter.convertDecimalToBinary(decNumberB);
        String resultC = converter.convertDecimalToBinary(decNumberC);
        String resultD = converter.convertDecimalToBinary(decNumberD);


        assertEquals("1", resultA);
        assertThat(resultB).isEqualTo("10");
        assertEquals("1000011", resultC);
        assertThat(resultD).isEqualTo("1111101");
    }

    @Test
    public void should_return_decimal_representation() {

        String binNumberA = "1";
        String binNumberB = "10";
        String binNumberC = "1000011";
        String binNumberD = "1111101";


        int resultA = converter.convertBinaryToDecimal(binNumberA);
        int resultB = converter.convertBinaryToDecimal(binNumberB);
        int resultC = converter.convertBinaryToDecimal(binNumberC);
        int resultD = converter.convertBinaryToDecimal(binNumberD);

        assertEquals(1,resultA);
        assertThat(resultB).isEqualTo(2);
        assertEquals(67, resultC);
        assertThat(resultD).isEqualTo(125);
    }
}
