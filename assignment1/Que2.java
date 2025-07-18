/*
2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm,
 find its length and perimeter. 
*/
class Rect2{
    public static void main(String args[]){
        int perimeter;
        int length;
        int breadth=8;
        int area=96;
        length=area/breadth;
        perimeter=2*(length+breadth);
        
        
        System.out.println("length="+length+ "\nbreadth="+breadth+"\nPerimeter of rectangle="+perimeter);
        System.out.println("\nArea of rectangle="+area);

    }
}