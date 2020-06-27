package codingPractice3;

import java.util.InputMismatchException;
import java.util.Scanner;

final class CetakLuas {
	private static void cetakBangunDatar(BangunDatar BD, double p, double l, double t) {
		BD.setP(p);
		BD.setL(l);
		BD.setT(t);
		BD.setLuas();
		BD.tampil();
	}

	private void input() {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double tt = 0;
		JajaranGenjang jg = new JajaranGenjang();
		Lingkaran lingkaran = new Lingkaran();
		Persegi persegi = new Persegi();
		PersegiPanjang pp = new PersegiPanjang();
		Segitiga segitiga = new Segitiga();
		Trapesium trapesium = new Trapesium();
		try {
			for (int a = 1;; a++) {
				System.out.println("Program Perhitungan Luas Bangun Datar");
				System.out.println("1. Menghitung Luas Jajaran Genjang");
				System.out.println("2. Menghitung Luas Lingkaran");
				System.out.println("3. Menghitung Persegi");
				System.out.println("4. Menghitung Persegi Panjang");
				System.out.println("5. Menghitung Segitiga");
				System.out.println("6. Menghitung Trapesium");
				System.out.println("7. Keluar");
				System.out.print("Masukan pilihan Anda: ");
				a = sc.nextInt();
				switch (a) {
				case 1:
					System.out.print("Masukan nilai alas jajaran genjang: ");
					x = sc.nextDouble();
					System.out.print("Masukan nilai tinggi jajaran genjang:");
					y = sc.nextDouble();
					cetakBangunDatar(jg, x, y, tt);
					break;
				case 2:
					System.out.print("Masukan nilai jejari lingkaran: ");
					x = sc.nextDouble();
					cetakBangunDatar(lingkaran, x, x, tt);
					break;
				case 3:
					System.out.print("Masukan nilai sisi persegi: ");
					x = sc.nextDouble();
					cetakBangunDatar(persegi, x, x, tt);
					break;
				case 4:
					System.out.print("Masukan nilai panjang persegi panjang: ");
					x = sc.nextDouble();
					System.out.println("Masukan nilai lebar persegi panjang: ");
					y = sc.nextDouble();
					cetakBangunDatar(pp, x, y, tt);
					break;
				case 5:
					System.out.print("Masukan nilai alas segitiga: ");
					x = sc.nextDouble();
					System.out.println("Masukan nilai tinggi segitiga: ");
					y = sc.nextDouble();
					cetakBangunDatar(segitiga, x, y, tt);
					break;
				case 6:
					System.out.print("Masukan nilai sisi 1 trapesium: ");
					x = sc.nextDouble();
					System.out.println("Masukan nilai sisi 2 trapesium: ");
					y = sc.nextDouble();
					System.out.println("Masukan nilai tinggi trapesium: ");
					tt = sc.nextDouble();
					cetakBangunDatar(trapesium, x, y, tt);
					break;
				case 7:
					System.exit(0);
					break;
				default:

					System.out.print("Maaf ulangi lagi pilihan anda!");
				}
				System.out.println("");

			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.print("Exception" + e);
		} finally {

		}

	}

	public static void main(String[] args) {
		CetakLuas c = new CetakLuas();
		c.input();
	}

}
