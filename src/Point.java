public class Point extends Figure {
    public Point(double x_poz, double y_poz, String color, double dimension) {
        super(x_poz, y_poz, color, dimension);
    }

    @Override
    public void print() {
        System.out.println("Punct:\nPozitia x: " + this.getX_poz() + "\nPozitia y: " + this.getY_poz() + "\nCuloare: "
                + this.getColor() + "\nDimensiune: " + this.getDimension() + "\n\n");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
