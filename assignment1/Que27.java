/*
Find the cost of tiling a dining room 20 m long
 and 15 m wide at the rate of $ 5 per square m.
 */
class Que27{
    public static void main(String args[]){
        int l=20,w=15,rate=5;
        int cost,area;
        area=l*w;
        cost=area*rate;
        System.out.println("cost of tiling a dining room=$"+cost);

    }
}