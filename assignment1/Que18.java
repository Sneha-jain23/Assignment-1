/**
 18.Ron jogs around a rectangular park of length 50 m and breadth 30 m. 
 If he takes 10 rounds of the park each day, 
 how much distance does he cover in a day in km?
 */
class Que18{
    public static void main(String args[]){
        int l=50;
        int b=30;
        int perimeter=2*(l+b);
        float res=perimeter*10;
        res=res/1000;
        System.out.println(res);
    }
}