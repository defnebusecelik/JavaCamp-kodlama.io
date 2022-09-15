public class FindNumber {
    public static void main(String[] args) {
      int[] numbers=new int[]{1,2,4,5,7,9};
      int aranan=4;
      boolean varMi=false;
      
      for(int number:numbers){
          if(number==aranan){
              varMi=true;
              break;
          }
      }
      if(varMi){
          System.out.println("Sayi mevcuttur.");
      }else{
          System.out.print("Sayi mevcut degildir.");
      }
    }
}
