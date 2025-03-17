package Shape;
public class FootShape {
    public String drawAsRectangle(){
        Rectangle obj = new Rectangle();
        return obj.draw();
    }
    public String drawAsEllipse(){
        Ellipse obj = new Ellipse();
        return obj.draw();
    }
}
