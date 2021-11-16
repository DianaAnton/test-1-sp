public class Square extends Figure {
    private double latura;

    public Square(double x_poz, double y_poz, String color, double dimension, double latura) {
        super(x_poz, y_poz, color, dimension);
        this.latura = latura;
    }

    public double getLatura() {
        return latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }

    @Override
    public void print() {
        System.out.println("Patrat:\nPozitia x: " + this.getX_poz() + "\nPozitia y: " + this.getY_poz() + "\nCuloare: "
                + this.getColor() + "\nDimensiune: " + this.getDimension() + "\nLatura: " + this.getLatura() + "\n\n");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
