
public class rectangle {
	private int height;
	private int width;
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}
	public void setHeight(int newHeight) {
		this.height = newHeight;
	}
	public void setWidth(int newWidth) {
		this.width = newWidth;
	}
	public int getArea() {
		int area = (this.height*this.width);
		return area;
	}
	public int getPerim() {
		int perim = ((2*this.height)+(2*this.width));
		return perim;
	}
	public rectangle(int newHeight, int newWidth) {
		height = newHeight;
		width = newWidth;
	}
}
