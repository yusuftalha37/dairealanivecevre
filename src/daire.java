import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        System.out.println("Lütfen Dairenin Yarı Çapını Giriniz");
        Scanner input =new Scanner(System.in);
        int daire;
        daire = input.nextInt();
        System.out.println("Dairenizin Çevresi : "+ daire*2*3.14);
        System.out.println("Dairenizin Alanı : "+ daire*daire*3.14);

    }
}
