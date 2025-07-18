/*
24.How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required 
for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand 
what will it cost to build the wall?
*/
class Que24{
    public static void main(String args[]){
        int wall_L=20*1000;
        int wall_B=2*1000;
        float wall_Thick=0.75f*1000;
        double wall_Volume=wall_L*wall_B*wall_Thick;

        int brick_L=25;
        int brick_W=10;
        float brick_H=7.5f;
        double brick_Volume=brick_L*brick_W*brick_H;
        double res=wall_Volume/brick_Volume;
        System.out.println("Number of bricks="+res);
        double total=(res*900)/1000;
        System.out.println("Total cost=$"+total);


    }
}