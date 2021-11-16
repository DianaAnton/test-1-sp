import java.util.List;

public class SaveXML implements Visitor {
    private String circles_xml = "";
    private String squares_xml = "";
    private String points_xml = "";

    @Override
    public void visit(StructuraFiguri structuraFiguri) {
        List<Element> figures = structuraFiguri.getFigures();
        for (Element el : figures) {
            el.accept(this);
        }
    }

    @Override
    public void visit(Circle circle) {
        circles_xml += "<class value=Circle>\n<x_poz value=" + circle.getX_poz() + "/>\n<y_poz value=" + circle.getY_poz()
                + "/>\n<color value=" + circle.getColor() + "/><dimension value=" + circle.getDimension()
                + "/>\n<raza value=" + circle.getRaza() + "/>\n<line value=" + circle.getLine()
                + "/>\n</class>\n";
    }

    @Override
    public void visit(Square square) {
        squares_xml += "<class value=Square>\n<x_poz value=" + square.getX_poz() + "/>\n<y_poz value=" + square.getY_poz()
                + "/>\n<color value=" + square.getColor() + "/><dimension value=" + square.getDimension()
                + "/>\n<latura value=" + square.getLatura() + "/>\n</class>\n";

    }

    @Override
    public void visit(Point point) {
        points_xml += "<class value=Point>\n<x_poz value=" + point.getX_poz() + "/>\n<y_poz value=" + point.getY_poz()
                + "/>\n<color value=" + point.getColor() + "/><dimension value=" + point.getDimension()
                + "/>\n</class>\n";
    }

    public void display_xml() {
            System.out.println("XML-ul pentru cercuri este:\n" + circles_xml + "\n\n");
            System.out.println("XML-ul pentru patrate este:\n" + squares_xml + "\n\n");
            System.out.println("XML-ul pentru puncte este:\n" + points_xml + "\n\n");
        }
}
