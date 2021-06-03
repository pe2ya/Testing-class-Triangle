
public class Trojuhelnik {
	

	private double a = 0, b = 0, c = 0, P = 0, pp = 0, S = 0;

	public Trojuhelnik(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;	
		this.spoctitP();
		this.spoctitPp();
		this.spoctitS();
		
	}
	

	private double spoctitP() {
		this.P = this.a + this.b + this.c;
		return P;
	}
	private double spoctitPp() {
		this.pp = this.P/2;
		return pp;
	}
	private double spoctitS() {
		this.S= (Math.sqrt(this.pp * (this.pp - this.a) * (this.pp - this.b) * (this.pp - this.c)));
		return S;
	}
	
	public boolean muzeExistovat() {
		if(a + b > c) {
			if(a <= 0 || b <= 0 || c <= 0 ) {
				return false;
			}
			else {
				return true;
			}
		
		}
		else {
			return false;
		}
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getP() {
		return P;
	}
	public void setP(double p) {
		P = p;
	}
	public double getPp() {
		return pp;
	}
	public void setPp(double pp) {
		this.pp = pp;
	}
	public double getS() {
		return S;
	}
	public void setS(double s) {
		S = s;
	}
	@Override
	public String toString() {
		return "Troj [a=" + a + ", b=" + b + ", c=" + c + ", P=" + P + ", pp=" + pp + ", S=" + S + ", muze Existovat="
				+ muzeExistovat() + "]";
	}
	
	
}
	

