import gpdraw.SketchPad;
import gpdraw.DrawingTool;

public class House {

	public void drawHouse() {
		SketchPad pad = new SketchPad(500, 500);
		DrawingTool marco = new DrawingTool(pad);

		// House frame
		marco.drawRect(300, 200);

		// Right window
		marco.up();
		marco.move(75, 20);
		marco.down();
		marco.drawRect(50, 50);

		// Left window
		marco.up();
		marco.move(-75, 20);
		marco.down();
		marco.drawRect(50, 50);

		// Door
		marco.up();
		marco.move(0, -62);
		marco.down();
		marco.drawRect(50, 75);

		// Roof
		marco.up();
		marco.move(-150, 100);
		marco.down();
		marco.move(0, 200);
		marco.move(150, 100);

	}

}
