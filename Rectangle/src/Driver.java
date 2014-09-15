import java.awt.Color;

import gpdraw.*;

public class Driver {

	public static void main(String args[]) {

		SketchPad pad = new SketchPad(500, 500);
		DrawingTool marco = new DrawingTool(pad);

		DrawnSphere Jeff = new DrawnSphere(0.0, 0.0, 0.0, 50.0);
		Jeff.nameSphere(marco, "Jeff");
		Jeff.setSphereColor(marco, new Color (128, 0 , 128));
		Jeff.embiggen(10);
		Jeff.draw(marco);

	}

}
