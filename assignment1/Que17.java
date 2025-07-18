/**
  17. Luci is making a display board for the school exhibition. 
 The display board is a 3 m by 2 m rectangle. 
 He needs to add a ribbon border around the entire display board.
  What is the length of ribbon that he needs?
 */
class Que17{
    public static void main(String args[]){
        int l=3;
        int b=2;
        int area=l*b;
        int perimeter=2*(l+b);
        System.out.println("length of ribbon that he needs:"+perimeter);
    }
}