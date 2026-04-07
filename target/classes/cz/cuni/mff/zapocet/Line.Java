public class Line {
    private Place from;
    private Place to;
    private int[] intentionalDelay;
    public Line(Place[] stops, Vehicle vehicle, int departureTime, DistanceManager distanceManager) {
        this.from = stops[0];
        this.to = stops[stops.length - 1];
        this.intentionalDelay = new int[stops.length - 1];
    }
}