package com.msa.assignment.productService.utils;

public class SleepUtils {

    public static void sleep(int delayMs){
        try {
            Thread.sleep(delayMs);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
