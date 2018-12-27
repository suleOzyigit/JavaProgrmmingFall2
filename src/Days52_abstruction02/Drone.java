package Days52_abstruction02;
public class Drone implements Moveable,Flyable {
    
    int engineSize;
    int maxHeight;
    
    
    @Override
    public void move() {
        System.out.println("Move from drone");
    }


    @Override
    public void moveIt() {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        Drone d = new Drone();
        d.move();
        d.moveIt();
        Moveable m = new Drone();
        System.out.println(MAX);
        System.out.println(Flyable.MAX);
    }


    @Override
    public void fly() {
        System.out.println("Drone flying");
        
    }

    

}
