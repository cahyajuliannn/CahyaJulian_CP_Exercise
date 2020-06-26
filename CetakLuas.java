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
		try {
			System.out.print("Masukan nilai p (jejari untuk lingkaran): ");
			x = sc.nextDouble();
			System.out.print("Masukan nilai l: ");
			y = sc.nextDouble();
			System.out.print("Masukan nilai t: ");
			tt = sc.nextDouble();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.print("Exception" + e);
		} finally {
			Persegi persegi = new Persegi();
			Segitiga segitiga = new Segitiga();
			JajaranGenjang jg = new JajaranGenjang();
			PersegiPanjang pp = new PersegiPanjang();
			Trapesium trapesium = new Trapesium();
			Lingkaran l = new Lingkaran();
			if (x == y) {
				cetakBangunDatar(persegi, x, y, tt);
				cetakBangunDatar(jg, x, y, tt);
				cetakBangunDatar(segitiga, x, y, tt);
				cetakBangunDatar(l, x, x, tt);
				cetakBangunDatar(trapesium, x, y, tt);
			} else {
				cetakBangunDatar(jg, x, y, tt);
				cetakBangunDatar(segitiga, x, y, tt);
				cetakBangunDatar(l, x, x, tt);
				cetakBangunDatar(pp, x, y, tt);
				cetakBangunDatar(trapesium, x, y, tt);
			}

		}
	}

	public static void main(String[] args) {
		CetakLuas c = new CetakLuas();
		c.input();
	}

}
