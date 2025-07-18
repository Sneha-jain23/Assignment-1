/*
How many square tiles of side 10 cm will be required
 to tile a floor measuring 800 cm by 900 cm?
 */
class Que29{
    public static void main(String args[]){
        int l=800,b=900;
        long floor_area=l*b;
        int side=10;
        int tiles_area=side*side;
        long required_tiles=floor_area/tiles_area;
        System.out.println("Required tiles="+required_tiles);
    }
}