package com.company;
import com.company.interfaces.Converter;
public class ConverterIf implements Converter {

    @Override
    public String convertMonth(int monthNumber) {
        //        if nun is outside 1-12 then return error.
        if(13 < monthNumber || monthNumber < 0){
            return "invalid month number";
        }
        if (monthNumber ==1) {
            return "January";
        }
        if (monthNumber ==2) {
            return "Febuary";
        }
        if (monthNumber ==3) {
            return "March";
        }
        if (monthNumber ==4) {
            return "April";
        }
        if (monthNumber ==5) {
            return "May";
        }
        if (monthNumber ==6) {
            return "June";
        }
        if (monthNumber ==7) {
            return "July";
        }
        if (monthNumber ==8) {
            return "August";
        }
        if (monthNumber ==9) {
            return "September";
        }
        if (monthNumber ==10) {
            return "October";
        }
        if (monthNumber ==11) {
            return "November";
        }
        if (monthNumber ==12) {
            return "December";
        }
        return "no month";
    }


    @Override
    public String convertDay(int dayNumber) {
        //        If day is between 1-7 it will print a date and if not it will send it to the no day return.
        if(dayNumber== 1){
            return "sunday";
        }
        if (dayNumber==2){
            return "Monday";
        }
        if (dayNumber==3){
            return "Monday";
        }
        if (dayNumber==4){
            return "Monday";
        }
        if (dayNumber==5){
            return "Monday";
        }
        if (dayNumber==6){
            return "Monday";
        }
        if (dayNumber==7){
            return "Monday";
        }
        return "No day";
    }
}
