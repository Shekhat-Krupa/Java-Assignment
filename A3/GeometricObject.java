package A3;
import java.util.Date;
abstract public class GeometricObject {
	private Date dateCreated;
	abstract void getArea();
	abstract void getPerimeter();
	 String color;
	 boolean filled;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	GeometricObject(){
		color="white";	
	}
}
