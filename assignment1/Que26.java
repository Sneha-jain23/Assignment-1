/*
How many bricks will be required to lay a path 120 m long
and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?
 */
class Que26{
    public static void main(String args[]){
        double path_l=120*100;
        double path_b=2.4*100;
        double path_area=path_l*path_b;
        int brick_l=24, brick_b=15;
        int brick_area=brick_l*brick_b;
        double result=path_area/brick_area;
        System.out.println("Number of bricks required="+result);
    }
}