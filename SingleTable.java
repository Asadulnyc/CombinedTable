public class SingleTable {
    private int seats;
    private int height;
    private double quality;

    public SingleTable(int s, double q, int h) {
        seats = s;
        quality = q;
        height = h;
    }

    public int getNumSeats() {
        return seats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return quality;
    }
    
    public void setViewQuality(double value) {
        quality = value;
    }
}