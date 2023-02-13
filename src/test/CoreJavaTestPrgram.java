package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CoreJavaTestPrgram {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1.1").setScale(0, RoundingMode.UP).setScale(2);

        System.out.println(new BigDecimal("4.5").toString());
        System.out.println(new BigDecimal("4.5").toPlainString());

        System.out.println(new BigDecimal(1).setScale(2));
        System.out.println(bigDecimal);
    }
}
