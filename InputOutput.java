import java.util.Scanner;
import java.util.Calendar;

public class InputOutput {
 public static void main (String [] args) {
	Scanner scanner   = new Scanner (System.in);
	Calendar calendar = Calendar.getInstance();
	String nama;
	String kelas;
	int jumlahSKS;
	double IPK;
	
	System.out.println("================================================");
	System.out.println("Waktu sekarang "+ calendar.getTime());
	System.out.println("================================================");
	System.out.println();
	System.out.print("Masukkan Nama Anda : ");
	nama = scanner.nextLine();

	System.out.print("Masukkan Kelas Anda : ");
	kelas = scanner.nextLine();

	System.out.print("Masukkan jumlah SKS yang sudah ditempuh : ");
	jumlahSKS = scanner.nextInt();
	
	System.out.print("Masukkan IPK Sementara : ");
	IPK = scanner.nextDouble();

	double jumlah = IPK * jumlahSKS;

	System.out.println();
	System.out.println("Hai, "+nama);
	System.out.println("Kamu anak kelas "+kelas);
	System.out.print("Total Nilai = "+jumlah);
	System.out.println();
	System.out.println("================================================");
	}
}