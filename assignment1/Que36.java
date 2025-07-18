/*
 What is the surface area of a cylinder
  if the diameter is 15m height is 7m?
 */
class Que36{
    public static void main(String args[]){
        int d=15,h=7;
        double r=d/2;
        double s;
        s=2*3.14*r*(r+h);
        System.out.println("surface area of a cylinder="+s);

    }
}