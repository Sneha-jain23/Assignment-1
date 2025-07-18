/*
 Find the surface area of the cylindrical
  solid whose radius is 7.7 cm and height is 12 cm.
 */
class Que35{
    public static void main(String args[]){
        float r=7.7f;
        int h=12;
        double s;
        s=2*(22/7)*r*(r+h);
        System.out.println("surface area of the cylindrical="+s+"cm\u00B2");
    }
}