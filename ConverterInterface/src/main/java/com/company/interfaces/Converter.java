package com.company.interfaces;

public interface converter {
    //    this converts any given number from 1-12 to the month it corresponds to.
    String convertMonth(int monthNumber);
    //    this converts any given number from 1-7 to the day of the week it corresponds to.
    String convertDay(int dayNumber);
}
