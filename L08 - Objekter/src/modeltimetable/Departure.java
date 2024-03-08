package modeltimetable;

public class Departure {
    private int perron;
    private String destination;
    private String arrival;
    private String departure;

    public Departure(int inputPerron, String inputDestination, String inputArrival, String inputDeparture) {
        perron = inputPerron;
        destination = inputDestination;
        arrival = inputArrival;
        departure = inputDeparture;
    }

    public int getPerron() {
        return perron;
    }

    public String getDestination() {
        return destination;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }
}
