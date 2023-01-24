package Java_OOPs.Encapsulation;

class Example{
    public static void main(String[] args) {
       Student Vinayak = new Student();
       Vinayak.setRoll_no(101);
       System.out.print(Vinayak.getRoll_no()); 
    }
}
class Student{
    String name;
    private int roll_no;

    public int getRoll_no(){
        return roll_no;
    }
    public void setRoll_no(int rollNum){
        this.roll_no = rollNum;
    }
}