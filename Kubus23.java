import java.util.Scanner;

public class Kubus23 {

    public static int volume(int panjang,int tinggi,int lebar) {
        int volume = panjang*tinggi*lebar;
        return volume;
    }

    public static int permukaan(int panjang, int lebar, int tinggi) {
        int permukaan = (2*panjang*lebar) + (2*panjang*tinggi) + (2*lebar*tinggi);
        return permukaan;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int panjang = sc.nextInt();
        System.out.print("Masuakkan lebar: ");
        int lebar = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        int tinggi = sc.nextInt();

        int volume = volume(panjang, lebar, tinggi);
        int permukaan = permukaan(panjang, lebar, tinggi);
        System.out.println("Volume kubus: "+volume);
        System.out.println("Luas permukaan kubus: "+permukaan);
    }
}
