import java.util.Scanner;
public class Letters {
    Scanner scan=new Scanner(System.in);
    System.out.println("Sesli harf yaziniz: ");
    char letter=scan.next();
    switch(letter){
        case 'A':
        case 'a':
        case 'I':
        case 'ı':
        case 'O':
        case 'o':
        case 'U':
        case 'u':
            System.out.println("Kalin sesli harf!");
            break;
        default:
            System.out.println("İnce sesli harf!");
    }
    }
}
