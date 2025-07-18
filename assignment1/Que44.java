/**
 Find the 28th term of an Arithmetic Progression -21 -18 -15 -12 . . . . . 
 */
class Que44{
    public static void main(String args[]){
        int n=28;
        int a1=-21,a2=-18;
        int d=a2-a1;
        int T;
        T=a1+(n-1)*d;
        System.out.println("The n of term is="+T);

    }
}