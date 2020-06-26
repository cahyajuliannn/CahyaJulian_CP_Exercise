package codingPractice3;

public class JajaranGenjang extends BangunDatar {

	@Override
	protected void setP(double p) {
		// TODO Auto-generated method stub
		this.p = p;
	}

	@Override
	protected void setL(double l) {
		// TODO Auto-generated method stub
		this.l = l;
	}

	@Override
	protected void setLuas() {
		// TODO Auto-generated method stub
		this.luas = (p * l);
	}

	@Override
	protected void tampil() {
		// TODO Auto-generated method stub
		System.out.println("Luas Jajaran Genjang adalah " + p + " x " + l + " = " + luas);
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
	protected double getLuas() {
		// TODO Auto-generated method stub
		return luas;
	}

	@Override
	protected void setT(double t) {
		// TODO Auto-generated method stub

	}

	@Override
	protected double getT() {
		// TODO Auto-generated method stub
		return t;
	}

}
