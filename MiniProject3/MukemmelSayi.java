import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int number,total=0;
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Sayiyi giriniz: ");
        number=input.nextInt();
        
        for(int i=1; i<number; i++){
            if(number%i==0){
                total+=i;
            }
        }
        
        if(number==total){
            System.out.println(number+" mukemmel sayidir.");
        }
        else{
            System.out.println(number+" mukemmel sayi degildir.");
        }

    }
}
