package homework_6;

public class CircleWithStaticMembers {

	double radius;
    static int numnerOfObjects = 0;
    CircleWithStaticMembers(){
        radius = 1;
        numnerOfObjects++;
    }
    CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numnerOfObjects++;
    }
    static int getNumnerOfObjects(){
        return numnerOfObjects;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }

}
