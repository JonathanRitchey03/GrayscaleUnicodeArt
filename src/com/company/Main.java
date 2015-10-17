package com.company;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
	    GSCanvas canvas = new GSCanvas(170,40);
        Random random = new Random();
        for ( int k = 0; k < 100; k++ ) {
            for (int i = 0; i < 20; i++) {
                if ( random.nextInt(2) == 0 ) {
                    canvas.fillRect(random.nextInt(127), random.nextInt(40), random.nextInt(30), random.nextInt(30), (short) random.nextInt(127));
                }
                for (int j = 0; j < 2; j++) {
                    canvas.average();
                }
                System.out.print(canvas.render());
                //pressAnyKeyToContinue();
                try { Thread.sleep(50); } catch(InterruptedException e) {}
                clearScr();
            }
        }
    }
    private static void pressAnyKeyToContinue()
    {
        System.out.println("Press any key to continue...");
        try {
            System.in.read();
        } catch(Exception e)
        {}
    }
    public static void clearScr() {
        final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
    }
}
