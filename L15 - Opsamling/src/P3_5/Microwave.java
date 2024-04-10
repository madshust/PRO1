package P3_5;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Microwave {

    Scanner input = new Scanner(System.in);
    private Duration time; // seconds
    private int powerLevel;

    public Microwave(){
        this.time = Duration.of(0,ChronoUnit.SECONDS);
        powerLevel = 1;
    }

    public Duration getTime() {
        return time;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void add30(){
        time = time.plusSeconds(30);
    }

    public void switchPowerLevel(){
        if (powerLevel == 1)
            powerLevel = 2;
        else
            powerLevel =1;
    }

    public void reset(){
        time = Duration.of(0,ChronoUnit.SECONDS);
        powerLevel = 1;
    }

    public void start() throws InterruptedException {
        System.out.printf("Cooking for " + time.toSeconds() + " seconds at level " + powerLevel);
        Thread.sleep(time.toMillis());
    }






}
