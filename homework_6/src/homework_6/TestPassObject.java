package homework_6;

public class TestPassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle(1);
        int n = 5;
        printArea(myCircle,n);
	}
	public static void printArea(Circle c,int times){
        System.out.println("Radius \t\tArea");
        while (times >= 1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
	

}
