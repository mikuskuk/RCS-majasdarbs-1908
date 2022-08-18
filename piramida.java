public class Piramida{
   public static void main(String args[]){
      int i, j, input;
      input = 5;
     
      for (i=0; i<input; i++){
         for (j=input-i; j>1; j--){
             System.out.print(" ");
         }
         for (j=0; j<=i; j++ ){
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}
