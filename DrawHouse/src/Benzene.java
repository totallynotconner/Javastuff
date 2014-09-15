import gpdraw.DrawingTool;
import gpdraw.SketchPad;

public class Benzene {

	SketchPad pad = new SketchPad(500, 500);
	DrawingTool marco = new DrawingTool(pad);

	private double circleSize;
	private double lineSize;
	
	public Benzene(double cSize, double lSize) {
		
		circleSize = cSize;
		lineSize = lSize;
		
	}
	
	public void drawBenzene() {
		// Inner Circle
		marco.drawCircle(circleSize);

		// Lines
		marco.up();
		marco.move(lineSize, 50);
		marco.down();
		marco.move(lineSize, -50);
		marco.move(0, -1 * (lineSize + lineSize / 6));
		marco.move(-1 * lineSize ,-50);
		marco.move(-1 * lineSize , 50);
		marco.move(0, lineSize + lineSize / 6);
		marco.move(lineSize, 50);
	}
}
