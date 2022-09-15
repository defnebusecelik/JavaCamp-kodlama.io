import java.util.Scanner;
public class PrimeNumber {
    static void asal(){
        int number,sayac=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        number=input.nextInt();
        if(number<=1){
            System.out.println("Asal sayi degildir.");
        }
        if(number==2){
            System.out.println("2 asal sayidir.");
        }
        for(int i=2; i<number; i++){
            if(number%i==0){
                sayac++;
            }
        if(sayac==0){
        System.out.println(number+" asal sayidir.");
        }
        else{
            System.out.println(number+" asal sayi degildir.");
            break;
        }
        }
       
    }
    
    public static void main(String[] args) {
       asal();
    }
}
