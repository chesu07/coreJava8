package ex01;

public class LabeledPoint extends Point{
	private String label;
	private double x;
	private double y;
	
	public LabeledPoint(String label, double x, double y){		
		this.label = label;
		this.x = x;
		this.y = y;
	}
	
	public String getLabel(){
		return this.label; 
	}
	
}
