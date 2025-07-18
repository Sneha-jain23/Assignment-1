/*
How many tiles of length 5 cm and breadth 8 cm are needed to tile
 the floor of a bed room 200 cm long and 400 cm wide?
 */
class Que30{
    public static void main(String args[]){
        int tiles_l=5,tiles_b=8;
        int tiles_area=tiles_l*tiles_b;
        int floor_l=200,floor_w=400;
        long floor_area=floor_l*floor_w;
        long required_tiles=floor_area/tiles_area;

        System.out.println("Required tiles="+required_tiles);
    }
}