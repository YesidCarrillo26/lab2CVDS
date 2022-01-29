package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;

public class ShapeFactory {
    public static Shape create(RegularShapeType type) {
        Shape shape;
        switch(type){
            case Hexagon:
                shape = new Hexagon();
                break;
            default:
                shape = null;
        }
        return shape;
    }

}
