package section.six;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(int x, int y) {
        double dist = Math.sqrt((this.x - x)*(this.x - x)+(this.y - y)*(this.y - y));
        return dist;
    }

    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }
}


