package view;

import controller.Schedule;

import java.util.Timer;

public class Main {
    public static void main(String[] args) {

        //Schedule 5 minutos
        Schedule schedule = new Schedule();
        Timer time = new Timer();
        time.scheduleAtFixedRate(schedule, 0, 300000);
    }

}