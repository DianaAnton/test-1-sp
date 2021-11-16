public interface Visitor {
    void visit(StructuraFiguri structuraFiguri);
    void visit(Circle circle);
    void visit(Square square);
    void visit(Point point);
}
