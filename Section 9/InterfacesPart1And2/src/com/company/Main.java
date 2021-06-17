package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone stefansPhone;
        stefansPhone = new DeskPhone(123456);
        stefansPhone.powerOn();
        stefansPhone.callPhone(123456);
        stefansPhone.answer();

        stefansPhone = new MobilePhone(24565);
        // stefansPhone.powerOn();
        stefansPhone.callPhone(24565);
        stefansPhone.answer();

    }
}
