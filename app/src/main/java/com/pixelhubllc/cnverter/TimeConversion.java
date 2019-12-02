package com.pixelhubllc.cnverter;

import android.util.Log;

public class TimeConversion {
    private String finalconverted;

    public String time(String value, String convertFrom, String converTo) {

        if (convertFrom.toLowerCase().equals("minute")) {
            if (converTo.toLowerCase().equals("secend")) {

                int minute;
                minute = Integer.parseInt(value) * 60;
                finalconverted = String.valueOf(minute);

            }else  if (converTo.toLowerCase().equals("hour")){

                Log.e("Log","chec");
                double hour;
                hour = Integer.parseInt(value) * 0.0166667;
                finalconverted = String.valueOf(hour);

            }

        }

        else if ( convertFrom.toLowerCase().equals("secend")){
            if (converTo.toLowerCase().equals("minute")){

                Log.e("Log","chec");
                double secend;
                secend = Integer.parseInt(value) * 0.0166667;
                finalconverted = String.valueOf(secend);

            }
        }

        else if ( convertFrom.toLowerCase().equals("hour")){
            if (converTo.toLowerCase().equals("minute")){

                Log.e("Log","chec");
                double minute;
                minute = Integer.parseInt(value) * 60;
                finalconverted = String.valueOf(minute);

            }
        }


        return finalconverted;

    }
}
