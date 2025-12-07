package com.java.learning.loop;

public class WhileLoopDemo {

    public static void main(String[] args) {

        int bottleLevel = 0;

        while(bottleLevel < 5) {
            System.out.println("Pouring water..."+bottleLevel);
            bottleLevel++;
        }
    }
}
