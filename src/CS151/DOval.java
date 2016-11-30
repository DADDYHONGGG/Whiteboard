package CS151;

import javafx.scene.shape.Shape;
import javafx.scene.shape.Ellipse;

public class DOval extends DShape{

    private Ellipse oval;
    
    public DOval() {
	model = new DOvalModel();
	oval = new Ellipse();
    }
    
    public void draw() {
	oval.setFill(model.getColor());
	// casts are necessary because model does not know it's 
	// a DOvalModel. it only knows it is a DShapeModel
	double x = ( (DOvalModel) model).getXCenter();
	double y = ( (DOvalModel) model).getYCenter();
	double xRadius = ( (DOvalModel) model).getXRadius();
	double yRadius = ( (DOvalModel) model).getYRadius();
	oval.setCenterX(x);
	oval.setCenterY(y);
	oval.setRadiusX(xRadius);
	oval.setRadiusY(yRadius);	    
    }

    public void randomize(int max) {
	model.randomize(max);
	( (DOvalModel) model).defineEllipse();
    }
    
    public Shape getShape() {
	return oval;
    }
}
