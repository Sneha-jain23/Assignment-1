/*1. The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, 
find its breadth and area.*/

class Rect{
    public static void main(String args[]){
        int perimeter=230;
        int length=70;
        int breadth;
        breadth=(perimeter)/2-length;
        System.out.println("length="+length+ "\nbreadth="+breadth+"\nPerimeter of rectangle="+perimeter);
        int area=length*breadth;
        System.out.println("\nArea of rectangle="+area);

    }
}