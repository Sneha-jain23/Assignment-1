/*
A wooded area is in the shape of a a trapezoid whose
bases measure 128 m and 92 m and its height is 40 m.
A 4 m wide walkway is constructed which runs perpendicular to the two bases.
Calculate the area of the wooded area after the addition of the walkway.
 */
class Que34{
    public static void main(String args[]){
        int a=128,b=92,h=40;
        double trapezoid_area=0.5*(a+b)*h;
        double walk_way_width=4;
        double walk_way_length=40;
        double walk_way_area=walk_way_length*walk_way_width;
        double total_area=trapezoid_area+walk_way_area;
        System.out.println("Area of trapezoid =" +trapezoid_area + "m\u00B2");
        System.out.println("Area of walkway =" +walk_way_area + "m\u00B2");
        System.out.println("Total area =" +total_area + "m\u00B2");

    }
}