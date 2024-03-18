package Opgave2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch(){

    }

    public void start(){
        this.startTime = LocalTime.now();
    }

    public void stop(){
        this.endTime = LocalTime.now();
    }

    public long elapsedTime(){
        return startTime.until(endTime,ChronoUnit.SECONDS);
    }

}
