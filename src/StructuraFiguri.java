import java.util.ArrayList;
import java.util.List;

public class StructuraFiguri implements Element {
    private int number_of_figures;
    private List<Element> figures;

    public StructuraFiguri() {
        number_of_figures = 0;
        this.figures = new ArrayList<>();
    }

    public int getNumber_of_figures() {
        return number_of_figures;
    }

    public void setNumber_of_figures(int number_of_figures) {
        this.number_of_figures = number_of_figures;
    }

    public List<Element> getFigures() {
        return figures;
    }

    public void setFigures(List<Element> figures) {
        this.figures = figures;
    }

    public void print() {
        System.out.println("Structura de figuri are " + number_of_figures + "elemente.");
        for (Element el : figures) {
            el.print();
        }
    }

    public void add_element(Element element) {
        number_of_figures++;
        this.figures.add(element);
    }

    public void remove_element(Element element) {
        number_of_figures--;
        this.figures.remove(element);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
