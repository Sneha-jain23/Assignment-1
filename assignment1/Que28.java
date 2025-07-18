/*
A carpet is 5 m long and 4 m wide.
Find its price at the rate of $ 205 per square meter.
 */
class Que28{
    public static void main(String args[]){
        int l=5,w=4;
        int area,rate=205,cost;
        area=l*w;
        cost=area*rate;
        System.out.println("Carpet price=$"+cost);
    }
}