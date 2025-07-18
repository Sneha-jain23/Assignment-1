/**
 * Find the surface of the cylinder if its diameter is 12 centimeters
  and its height is 9 centimeters.
 */
class Que39{
    public static void main(String args[]){
        int d=12,h=9;
        int r=d/2;
        double area=2*3.14*r*(r+h);
        System.out.println("Surface area of the cylinder="+area);

    }
}