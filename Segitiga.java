package codingPractice3;

public class Segitiga extends BangunDatar {

	@Override
	protected void setP(double p) {
		// TODO Auto-generated method stub
		this.p = p;
	}

	@Override
	protected void setT(double t) {
		this.t = t;
	}

	@Override
	protected void setL(double l) {
		// TODO Auto-generated method stub
		this.l = l;
	}

	@Override
	protected void setLuas() {
		// TODO Auto-generated method stub
		this.luas = (p * l) / 2;
	}

	@Override
	protected void tampil() {
		// TODO Auto-generated method stub
		System.out.println("Luas Segitiga adalah " + "(" + p + " x " + l + ")" + "/2" + " = " + luas);
	}

	@Override
	protected double getP() {
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	protected double getL() {
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	protected double getT() {
		return t;
	}

	@Override
	protected double getLuas() {
		// TODO Auto-generated method stub
		return luas;
	}

}
