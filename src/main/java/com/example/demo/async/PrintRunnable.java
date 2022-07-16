package com.example.demo.async;

public class PrintRunnable implements Runnable{

    private String text;
    public PrintRunnable(String text){
        this.text = text;
    }
    @Override
    public void run() {
        System.out.println(this.text);
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        System.out.println(this.text);
    }
    
}
