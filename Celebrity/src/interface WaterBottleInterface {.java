interface WaterBottleInterface {
    String color = "Blue";
    void fillUp ();
}
public class InterfaceExampe implements WaterBottleInterface{
    public static void main(String [] args) {
    System.out.println(color) ;
    InterfaceExample ex = new InterfaceExample();
    ex.fillUp();
    }
    public void fillUp(){
        System.out.println("It is filled ");

    }
