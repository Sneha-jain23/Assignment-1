/**
 A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. 
 How many bricks will be used to make a wall of length 15 m, breadth 10 m
  and height 8 metres?
 */
class Que21{
    public static void main(String args[]){
        //
        int l=15,b=10,h=8;
        l=15*100;
        b=10*100;
        h=8*100;
        long Wall_Volume=l*b*h;
        System.out.println("Volume of wall="+Wall_Volume);
        //Volume of one brick
        int Brick_Volume=15*8*5;
        System.out.println("Volume of brick="+Brick_Volume);
        //Number of Bricks
        long res=Wall_Volume/Brick_Volume;
        System.out.println("Number of bricks"+res);
        
    }
}