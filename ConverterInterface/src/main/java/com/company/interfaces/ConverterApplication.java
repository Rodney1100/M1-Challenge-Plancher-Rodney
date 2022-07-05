package com.company.interfaces;
import com.company.ConverterIf;
import com.company.ConverterSwitch;

public class ConverterApplication {
    public static void main(String[] args) {

//      using the if
        converter converter1 = new ConverterIf();
        System.out.println(converter1.convertDay(7));
        System.out.println(converter1.convertMonth(7));

//       Using the switch
        converter converter2 = new ConverterSwitch();
        System.out.println(converter2.convertDay(7));
        System.out.println(converter2.convertMonth(9));
    }
}
