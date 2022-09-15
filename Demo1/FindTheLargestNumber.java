import java.util.Scanner;
public class FindTheLargestNumber {
    public static void main(String[] args) {
      int total,number,max=0;
      
      Scanner input=new Scanner(System.in);
      
      System.out.print("Kac tane sayi gireceksiniz: ");
      total=input.nextInt();
      
      for(int i=1; i<=total; i++){
          System.out.print(i+". sayiyi giriniz: ");
          number=input.nextInt();
          if(i==1){
              max=number;
          }
          if(number>max){
              max=number;
          }
          }
          
        System.out.println("En buyuk sayi: "+max);
    }
}
