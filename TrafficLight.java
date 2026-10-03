public class TrafficLight {
    private String color;
    private final String id;

    public TrafficLight(String id) {
        this.id = id;
        this.color = "RED";
    }

    public String getColor() { return color; }
    public String getId() { return id; }

    public void next() {
        switch (color) {
            case "RED": color = "GREEN"; break;
            case "GREEN": color = "YELLOW"; break;
            default: color = "RED";
        }
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println(t.getColor());
        t.next(); System.out.println(t.getColor());
        t.next(); System.out.println(t.getColor());
        t.next(); System.out.println(t.getColor());
    }
}
