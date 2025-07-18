/*
23.Find the number of cubical boxes of cubical side 3 cm
 which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
 */
class Que23{
    public static void main(String args[]){
        int l=15,b=9,h=12;
        int side=3;
        int volume=l*b*h;
        //Volume of one box
        int boxVolume=side*side*side;
        //Total boxes
        int total=volume/boxVolume;
        System.out.println("Total cubical boxes = " + total);

    }
}