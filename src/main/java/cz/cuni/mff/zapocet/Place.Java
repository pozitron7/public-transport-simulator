public record Coordinate(int x, int y) {}
public abstract class Place {
    private int id;
    private String name;
    private Coordinate coordinate;
}