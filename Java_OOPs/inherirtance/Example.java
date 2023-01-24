package Java_OOPs.inherirtance;

public class  Example {
     public static void main(String[] args) {
         Cycle c = new Cycle(100, 2, 4);
         c.speedUp(200);
         c.gearUp(3);
         c.setSeatHeight(5);
         System.out.println(c.printinfo());
     }
}
class Bike{
   
    public int speed;
    public int gear;

    public Bike(int speed , int gear){
        this.speed = speed;
        this.gear = gear;
    }
    public void speedUp(int increase){
            speed += increase;
        }
     public void gearUp(int gearup){
            gear+= gearup;
        }
    public String printinfo(){
        return("No. of gear are " + gear + "\n" + "Speed is " + speed);
        }
    }  

class Cycle extends Bike{
    public int seatheight;

    public Cycle(int speed , int gear , int height){
      super(speed , gear);
      seatheight = height;
    }
     public void setSeatHeight(int value){
        seatheight = value;
 }
    @Override 
    public String printinfo(){
        return(super.printinfo()+"\n"+ "seat height is " + seatheight);
    }

}

