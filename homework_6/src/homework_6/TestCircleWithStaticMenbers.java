package homework_6;

public class TestCircleWithStaticMenbers {
	public static void main(String[] args) {
        System.out.println("Before creating objects: ");
        System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numnerOfObjects);

        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numnerOfObjects + ")");
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        c1.radius = 9;
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numnerOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numnerOfObjects + ")");
    }

}
