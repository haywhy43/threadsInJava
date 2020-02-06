package com.company;

public class Main {

    public static void main(String[] args) {
	    Runnable task1 = new PrintChar('a', 10);
        Runnable task2 = new PrintChar('b', 100);
        Runnable task3 = new PrintNum(100);


        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PrintChar implements  Runnable {
    private char character;
    private int noOfTimes;

    public PrintChar(char c, int t) {
        character = c;
        noOfTimes = t;
    }

    @Override

    public void run() {
        for (int i = 0; i < noOfTimes; i++) {
            System.out.print(character);
        }
    }
}

class PrintNum implements Runnable {
    private int noOfTimes;

    public PrintNum(int t){
        noOfTimes = t;
    }


    @Override
    public void run() {
        for (int i = 1; i <= noOfTimes; i++){
            System.out.print(i);
        }
    }
}

