public class DistanceManager {
    private java.util.Map<VehicleModelTypeRecord, java.util.Map<Route, Integer>> distanceMap;
    public int getDistanceInMeters(VehicleModelTypeRecord model, Place from, Place to) {
        Route route = new Route(from, to);
        if (distanceMap.containsKey(model) && distanceMap.get(model).containsKey(route)) {
            return distanceMap.get(model).get(route);
        }
        return -1; 
    }
    public void addDistanceOfModel(VehicleModelTypeRecord model, java.util.Map<Route, Integer> distances) {
        distanceMap.put(model, distances);
    }
    
    private java.util.Map<VehicleModelTypeRecord, java.util.Map<Route, Integer>> travelTimeMap;
    public int getTravelTimeInSeconds(VehicleModelTypeRecord model, Place from, Place to) {
        Route route = new Route(from, to);
        if (travelTimeMap.containsKey(model) && travelTimeMap.get(model).containsKey(route)) {
            return travelTimeMap.get(model).get(route);
        }
        return -1; 
    }
    public void addTravelTimeOfModel(VehicleModelTypeRecord model, java.util.Map<Route, Integer> travelTimes) {
        travelTimeMap.put(model, travelTimes);
    }
}