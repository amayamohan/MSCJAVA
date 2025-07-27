/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaya
 */
public class TimeSum {
    public static void main(String[] args) {
        Sum t1 = new Sum(5, 10, 15);
        Sum t2 = new Sum(3, 30, 20);

        int s = t1.seconds + t2.seconds;
        int m = s / 60;
        s = s % 60;
        m = m + t1.minute + t2.minute;
        int h = m / 60;
        m = m % 60;
        h = h + t1.hours + t2.hours;

        System.out.println(h + " : " + m + " : " + s);
    }
    
}

class Sum {
    int hours, minute, seconds;
    Sum(int h, int m, int s) {
        hours = h;
        minute = m;
        seconds = s;
    }
}


output 

8 : 40 : 35