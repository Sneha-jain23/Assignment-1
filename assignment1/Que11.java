/*
11. The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m².
 Find the height and base of the triangle.
 */
class Que11{
    public static void main(String args []){
       double area=320;
       int baseR=8;
       int heightR=5;
       double Rarea=0.5*baseR*heightR;

    double onepart=area/Rarea;
    double base=baseR*onepart;
    double height=heightR*onepart;
    System.out.println("Height="+height);
    System.out.println("Base="+base);



    }
}