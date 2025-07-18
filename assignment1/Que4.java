/*
4. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide 
at the rate of $6 per hundred square m. 

 */
class Que4{
    public static void main(String agrs[]){
        int l=300;
        int b=150;
        int area=l*b;
        System.out.println("Area of rectangle="+area);
        float rate=6.0f/100;
        float total_cost=area*rate;
        System.out.println("Total cost of tiling is =$"+total_cost);
    }
}