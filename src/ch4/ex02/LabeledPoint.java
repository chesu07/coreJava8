package ex02;

public class LabeledPoint extends Point{
	private String label;
	private double x;
	private double y;
	
	public LabeledPoint(){		
		this.label = "";
		this.x = 0;
		this.y = 0;
	}
	
	public LabeledPoint(String label, double x, double y){		
		this.label = label;
		this.x = x;
		this.y = y;
	}
	
	public String getLabel(){
		return this.label; 
	}
	
	public double getX(){
		return this.x; 
	}
	
	public double getY(){
		return this.y; 
	}
	
	public void setLabel(String label){	 	
		this.label = label;
	}
	
	public String toString(){ 
		return super.toString()+"의 인스턴스 변수는 x= "+x+", y= "+y+", label= "+label;
	}
	
	public boolean equals(Object otherObject){		
		return super.equals(otherObject);
	}
	
	
}
