
abstract class Pen {

	PenColor penColor;
	
	public void write() {
		System.out.print("It can write!");
	}
	
	public void setPenColor(PenColor penColor) {
		this.penColor = penColor;
	}
	
	public abstract void showSize(); 	
}
