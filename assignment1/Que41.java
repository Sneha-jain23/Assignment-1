/**
  I need to calculate the cylinder volume with a height of 50 cm
   and a diameter of 30 cm.

 */
class Que41{
    public static void main(String args[]){
        int d=30;
        int r=d/2;
        int h=50;
        double area=(22/7)*r*r*h;
        System.out.println("Volume of cylinder="+area);
    }
}