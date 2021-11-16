public class Main {
    public static void main() {

        StructuraFiguri struct1 = new StructuraFiguri();
        StructuraFiguri struct2 = new StructuraFiguri();

        Circle c1 = new Circle(15.3, 2.4, "verde", 25.4, 6.3);
        Circle c2 = new Circle(3.1, 4.2, "rosu", 45.3, 7.4);
        Circle c3 = new Circle(3.51, 4.29, "roz", 4.3, 17.4);
        c1.setLine(new DottedLine());
        c2.setLine(new SmallLine());
        struct2.add_element(c1);
        struct2.add_element(c2);
        struct2.add_element(c3);

        Square s1 = new Square(4.2, 3.1, "mov", 7.8, 5);
        Square s2 = new Square(6.5, 3.4, "alb", 5.3, 6);
        struct1.add_element(s1);
        struct1.add_element(s2);

        struct1.add_element(struct2);

        Point p1 = new Point(4.3, 6.5, "galben", 4.3);
        Point p2 = new Point(8.5, 61.2, "albastru", 63.1);
        struct1.add_element(p1);
        struct1.add_element(p2);

        struct1.print();
        System.out.println("-----------------------------------------------------------------------------------------");

        SaveXML saveXML = new SaveXML();
        struct1.accept(saveXML);

        saveXML.display_xml();


    }
}
