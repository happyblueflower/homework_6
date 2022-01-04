package homework_6;

public class TestCircleWithPrivateDataFields {
	public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
        System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects());
    }

}
