package homework_6;
import java.util.Scanner;
public class TestPoint2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

        System.out.print("Enter point1's x-,y-coordinates: ");
        @SuppressWarnings("unused")
		double x1 = input.nextDouble();
        @SuppressWarnings("unused")
		double y1 = input.nextDouble();
        System.out.print("Enter point2's x-,y-coordinates: ");
        @SuppressWarnings("unused")
		double x2 = input.nextDouble();
        @SuppressWarnings("unused")
		double y2 = input.nextDouble();

        TestPoint2D p1 = new TestPoint2D();
        TestPoint2D p2 = new TestPoint2D();
        System.out.println("pa is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        System.out.println("The distance between p1 and p2 is " + p1.distance(p2));
        System.out.println("The midpoint between p1 and p2 is " + p1.midpoint(p2).toString());
   
	}

	private Object midpoint(TestPoint2D p2) {
		// TODO Auto-generated method stub
		return null;
	}

	private String distance(TestPoint2D p2) {
		// TODO Auto-generated method stub
		return null;
	}

}
