import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Saya: ");
        String nama = input.nextLine();
        System.out.print("Nim: ");
        int nim = input.nextInt();
        System.out.print("Usia: ");
        int usia = input.nextInt();
        System.out.print("Tinggi: ");
        double tinggi = input.nextInt();
        System.out.println("Jawaban soal nomor 1 yaitu usia*2/10+3-5= " + (usia*2/10+3-5));
        System.out.println("Jawaban soal nomor 2 yaitu usia>18 " + (usia>18));
        System.out.println("Jawaban soal nomor 3 yaitu usia>18 dan tinggi >160 " + ((usia>18) && (tinggi>160)));
        System.out.println("Jawaban soal nomor 4:");
        
        double casting_usia = usia;
        System.out.println("Hasil Casting usia = " + casting_usia);
        int casting_tinggi = (int) tinggi;
        System.out.println("Hasil Casting tinggi = " + casting_tinggi);
        input.close();
    }
}
