/*
12. Find the area of a right angled triangle whose
 hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm.
  Find the length of the other side.
 */
class Que12{
    public static void main(String args[]){
        int hypotenius=13;
        int base=12;
        double height;
        height=Math.sqrt((hypotenius*hypotenius)-(base*base));
        System.out.println("Height is="+height);
        double area;
        area= (1*base*height)/2;
         System.out.println("area of a right angled triangle="+area);


    }
}