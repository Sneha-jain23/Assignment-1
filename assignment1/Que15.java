/**
 * 15. Shelly has a rectangular garden of length 22 m and breath 15 m.
 *  Her friend Rachel has a square garden of side 21 m. 
 * Whose garden is bigger and by how much?
 */
class Que15{
    public static void main(String args[]){
        int l=22;
        int b=15;
        int Rarea=l*b;
        System.out.println("Rectangular garden="+Rarea);
        int a=21;
        int Sarea=a*a;
        System.out.println("Square garden="+Sarea);
        if(Rarea>Sarea){
            int res=Rarea-Sarea;
            System.out.println("Rachel's garden=
            "+res+"cm\u00B2 bigger than Shelly. ");
           
        }
        else{
            int res=Sarea - Rarea;
             System.out.println("Shelly's garden="+res+"cm\u00B2 bigger than Rachel. ");
        }
    }
}