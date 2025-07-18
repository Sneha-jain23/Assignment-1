/*
 19. A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am
  are kept on a table. Which shape has more volume?
 */
class Que19{
    public static void main(String args[]){
        int edge=7;
        int volume_cube=edge*edge*edge;
        System.out.println("Volume of cube is="+volume_cube);
        int l=7,b=4,h=8;
        int volume_cuboid=l*b*h;
        System.out.println("Volume of cuboid is="+volume_cuboid);
        if(volume_cube > volume_cuboid){
            System.out.println("Volume of cube is greater than volume of cuboid");
        }
        else{
             System.out.println("Volume of cuboid is greater than volume of cube");
             }
    

    }
}