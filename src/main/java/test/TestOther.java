package test;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestOther {

    @Test
    public void fun() {
        for (int i = 1; i <= 26; i++) {
            System.out.print((char)(96 + i) + "\t");
        }
    }

    @Test
    public void mathTest() {
        double a = 2019.321;
        System.out.println(String.format("%.0f", a));
//        System.out.println(BigDecimal.valueOf(a2, BigDecimal.ROUND_UNNECESSARY));

        long l = 2015L;
        System.out.println(l);
    }


}
