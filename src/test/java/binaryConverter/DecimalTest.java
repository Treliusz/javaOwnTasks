package binaryConverter;

import org.junit.Before;
import org.junit.Test;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.Assert.assertEquals;



public class DecimalTest {
    Decimal decimal;

    @Before
    public void before() {
        decimal = new Decimal();
    }

    @Test
    public void should_return_binary_representation() {

        int decNumberA = 1;
        int decNumberB = 2;
        int decNumberC = 67;
        int decNumberD = 125;

        String resultA = decimal.convert(decNumberA);
        String resultB = decimal.convert(decNumberB);
        String resultC = decimal.convert(decNumberC);
        String resultD = decimal.convert(decNumberD);


        assertEquals("1", resultA);
        assertThat(resultB).isEqualTo("10");
        assertEquals("1000011", resultC);
        assertThat(resultD).isEqualTo("1111101");


    }
}
