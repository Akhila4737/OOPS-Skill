package Skill6;

public class shape {
	void findArea(int side) {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }
    public void findArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
    public void findArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s = new shape();

        s.findArea(5);             
        s.findArea(4, 6);          
        s.findArea(3.5);
	}

}
