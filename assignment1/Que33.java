/*
33.A rectangular garden has dimensions of 30 m by 20 m
 and is divided in to 4 parts by two pathways that run 
 perpendicular from its sides. One pathway has a width of 3 m 
 and the other, 4 m. Calculate the total usable area of the garden.
 */
class Que33{
    public static void main(String args[]){
        int l=30,w=20;
        int garden_area=l*w;
        int path1_w=3;
        //lengthwise 30m llong
        int path1_area=path1_w*30;
        int path2_w=4;
        //widthwise 20m long
        int path2_area=path2_w*20;
        int overlap_area=path1_w*path2_w;
        int total_path_area=path1_area+path2_area-overlap_area;
        int usable_area=garden_area-total_path_area;
        System.out.println("total usable area of the garden is="+usable_area+"m\u00B2");


    }
}