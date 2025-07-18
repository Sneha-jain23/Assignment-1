/*
8.Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².
 */
class Que8{
    public static void main(String args[]){
        float area=0.8f;
        int height=20;
        float base;
        base=(2*area)/height;

        System.out.println("Base="+base);
    }
}