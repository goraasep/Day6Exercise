package org.example.Day6Exercise;

public class Exercise {
    public static void run(int number) {
        switch (number) {
            case 1:
                Problem1 problem1=new Problem1();
                problem1.run();
                break;
            case 2:
                Problem2 problem2=new Problem2();
                problem2.run();
                break;
            case 3:
                Problem3 problem3=new Problem3();
                problem3.run();
                break;
            case 4:
                Problem4 problem4=new Problem4();
                problem4.run();
                break;
            case 5:
                Problem5 problem5=new Problem5();
                problem5.run();
                break;
            case 6:
                Problem6 problem6=new Problem6();
                problem6.run();
                break;
            case 7:
                Problem7 problem7=new Problem7();
                problem7.run();
                break;
//            case 3:
//                Problem3.run();
//                break;
//            case 4:
//                Problem4.run();
//                break;
//            case 5:
//                Problem5.run();
//                break;
            default:
                System.out.println("Not available");
        }
    }
}
