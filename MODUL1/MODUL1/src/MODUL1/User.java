import java.util.Scanner;
public class User {
    String nama;
    int nohp;

    User() {
        System.out.println("=================================");

        Scanner input = new Scanner(System.in);
        System.out.print("\nNama : ");
        String nama = input.nextLine();
        System.out.print("No. Handphone : ");
        String nohp = input.nextLine();
        System.out.println("\nRegister Success");

        System.out.println("Name : "+nama);
        System.out.println("Phone Number : "+nohp);
    }
}
