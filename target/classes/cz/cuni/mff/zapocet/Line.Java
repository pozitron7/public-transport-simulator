public class Line {
    private Place from;
    private Place to;
    private int[] intentionalDelay;
    private java.util.Map<Place, Integer> timeOfArrivalAtStop;
    public Line(Place[] stops, Vehicle vehicle, int departureTime, DistanceManager distanceManager) { //departure time is in seconds from the start of the day
        this.from = stops[0];
        this.to = stops[stops.length - 1];
        this.intentionalDelay = new int[stops.length - 1];
    }
    public void addIntentionalDelay(int delay, int stopIndex) { //time is in seconds
        intentionalDelay[stopIndex] = delay;
    }
}