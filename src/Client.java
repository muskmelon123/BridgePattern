
public class Client {

	public static void main(String args[]) {
		Pen pen = new BigPen();
		PenColor penColor = new GreenPenColor();
		pen.write();
		pen.setPenColor(penColor);
		pen.showSize();
		pen.penColor.showColor();
	}
}
//注意：就是把一个主要变化的维度设为abstract class，然后另外变化较小的维度设为interface，在abstract class中调用interface，有多个维度可以实现，用多个interface.