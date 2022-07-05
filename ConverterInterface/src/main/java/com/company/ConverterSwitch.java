package com.company;

import com.company.interfaces.Converter;

public class ConverterSwitch implements Converter {

    @Override
    public String convertMonth(int monthNumber) {
//        if nun is outside 1-12 then return error.
        String returnVal = "No month";
        switch (monthNumber) {
            case 1:
                returnVal = "January";
                break;
            case 2:
                returnVal =  "February";
                break;
            case 3:
                returnVal = "March";
                break;
            case 4:
                returnVal = "April";
                break;
            case 5:
                returnVal = "May";
                break;
            case 6:
                returnVal = "June";
                break;
            case 7:
                returnVal =  "July";
                break;
            case 8:
                returnVal = "August";
                break;
            case 9:
                returnVal = "September";
                break;
            case 10:
                returnVal = "October";
                break;
            case 11:
                returnVal = "November";
                break;
            case 12:
                returnVal = "December";
                break;
        }
        return returnVal;
    }

    @Override
    public String convertDay(int dayNumber) {
        //        If day is between 1-7 it will print a date and if not it will send it to the no day return.
        String returnVal = "No day";
        switch (dayNumber) {
            case 1:
                returnVal = "sunday";
                break;
            case 2:
                returnVal = "Monday";
                break;
            case 3:
                returnVal = "Tuesday";
                break;
            case 4:
                returnVal = "Wednesday";
                break;
            case 5:
                returnVal = "Thursday";
                break;
            case 6:
                returnVal = "Friday";
                break;
            case 7:
                returnVal = "Saturday";
                break;
        }
        return returnVal;
    }
}
