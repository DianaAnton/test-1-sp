public class Circle extends Figure {
    private double raza;
    private DrawingMode line;

    public Circle(double x_poz, double y_poz, String color, double dimension, double raza) {
        super(x_poz, y_poz, color, dimension);
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    @Override
    public void print() {
        System.out.println("Cerc:\nPozitia x: " + this.getX_poz() + "\nPozitia y: " + this.getY_poz() + "\nCuloare: "
                + this.getColor() + "\nDimensiune: " + this.getDimension() + "\nRaza: " + this.getRaza() + "\n\n");
        if (this.line != null) {
            System.out.println("Cercurile vor fi desenate cu: " + this.line.print_message());
        }
    }

    public DrawingMode getLine() {
        return line;
    }

    public void setLine(DrawingMode line) {
        this.line = line;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
