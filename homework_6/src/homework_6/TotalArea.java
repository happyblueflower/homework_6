package homework_6;

public class TotalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] circleArray;
        circleArray = createCirclrArray();
        printCircleArray(circleArray);
	}
	public static Circle[] createCirclrArray(){
        Circle[] circleArray = new Circle[5];
        
        for (int i = 0;i <circleArray.length;i++)
            circleArray[i] = new Circle(Math.random() * 100);
        
        return circleArray;
    }
    public static void printCircleArray(Circle[] circleArray){
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for (int i = 0;i < circleArray.length;i++){
            System.out.printf("-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
        }
        System.out.println("- - - - - - - - - - - - - - - -");
        System.out.printf("%-30s%-15s","The total area of circlrs is",sum(circleArray));
    }
    public static double sum(Circle[] ciecleArray){
        double sum = 0;
        for (int i = 0;i < ciecleArray.length;i++)
            sum += ciecleArray[i].getArea();
        return sum;
    }

}
