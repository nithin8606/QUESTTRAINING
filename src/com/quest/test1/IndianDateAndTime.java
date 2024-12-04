package com.quest.test1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IndianDateAndTime {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}

