/*
 * The cylinder has a volume of 1287.
  The base has a radius 10. What is the area of the surface of the cylinder?
 */
class Que38{
    public static void main(String args[]){
        int v=1287;
        int r=10;
        double h;
        h=v/(3.14*r*r);
        double area;
        area=2*3.14*r*(r+h);
        System.out.println("Surface area of cylinder="+area);
    }

}
