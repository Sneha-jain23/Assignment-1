/*
32.A square garden with a side length of 150 m has a square
 swimming pool in the very centre with a side length of 25 m . 
 Calculate the area of the garden.
 */
class Que32{
    public static void main(String args[]){
        int garden_side=150;
        int garden_area=garden_side*garden_side;
        int pool_side=25;
        int pool_area=pool_side*pool_side;
        int result=garden_area-pool_area;
        System.out.println("Garden area excluding swimming pool="+result+"m\u00B2");
    }
}