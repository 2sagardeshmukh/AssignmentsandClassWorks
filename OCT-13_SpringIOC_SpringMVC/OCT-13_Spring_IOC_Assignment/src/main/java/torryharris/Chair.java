package torryharris;

import org.springframework.stereotype.Component;

@Component("chair")
public class Chair {
	
	private String color;
	private String type;
	public Chair() {
		super();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Chair [color=" + color + ", type=" + type + "]";
	}
	
	

}
