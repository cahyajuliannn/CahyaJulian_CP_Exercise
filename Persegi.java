package codingPractice3;

public class Persegi extends BangunDatar {

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
		this.luas = p * l;
	}

	@Override
	protected void tampil() {
		// TODO Auto-generated method stub
		System.out.println("Luas Persegi adalah " + p + " x " + l + " = " + luas);
	}

	@Override
	protected double getP() {
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	protected double getL() {
		// TODO Auto-generated method stub
		return l;
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
