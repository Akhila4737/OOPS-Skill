package Skill6;

public class student {
	int id;
    String name;
    int mark1, mark2, mark3;
    public student(int id, String name, int mark1, int mark2, int mark3) {
        this.id = id;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    public int findTotal() {
        return mark1 + mark2 + mark3;
    }
    public double findAverage() {
        return findTotal() / 3.0;
    }
    public void displayDetails() {
        int total = findTotal();
        double average = findAverage();
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + average + "%");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(101, "Akhila", 85, 90, 88);
        student s2 = new student(102, "Tejaswi", 78, 82, 80);
        s1.displayDetails();
        s2.displayDetails();
	}

}
