package com.example.akash.currency;

import android.widget.Toast;

/**
 * Created by Akash on 12-11-2016.
 */
public class Convert {

    public static String toUSD(String inr)
    {
        if(inr.length()!=0)
        {
            double c1 = Double.parseDouble(inr);
            c1 = c1/60;
            String res = String.valueOf(c1);
            return res;
        }
        else{
            return "INR should not be empty";
        }
    }

    public static String toINR(String usd)
    {
        if(usd.length()!=0){
            double c1 = Double.parseDouble(usd);
            c1 = c1*60;
            String res = String.valueOf(c1);
            return res;
        }
        else{
            return "USD can't be empty";
        }
    }

}
