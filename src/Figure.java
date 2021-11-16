public abstract class Figure implements Element {
    private double x_poz;
    private double y_poz;
    private String color;
    private double dimension;

    public Figure(double x_poz, double y_poz, String color, double dimension) {
        this.x_poz = x_poz;
        this.y_poz = y_poz;
        this.color = color;
        this.dimension = dimension;
    }

    public double getX_poz() {
        return x_poz;
    }

    public void setX_poz(double x_poz) {
        this.x_poz = x_poz;
    }

    public double getY_poz() {
        return y_poz;
    }

    public void setY_poz(double y_poz) {
        this.y_poz = y_poz;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

}
