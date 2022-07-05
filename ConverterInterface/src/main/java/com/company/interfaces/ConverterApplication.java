package com.company.interfaces;
import com.company.ConverterSwitch;
import com.company.ConverterIf;

public class ConverterApplication {
    public static void main(String[] args) {

//      using the if
        Converter converter1 = new ConverterIf();
        System.out.println(converter1.convertDay(7));
        System.out.println(converter1.convertMonth(7));

//       Using the switch
        Converter converter2 = new ConverterSwitch();
        System.out.println(converter2.convertDay(7));
        System.out.println(converter2.convertMonth(9));
    }
}
