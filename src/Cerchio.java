public class Cerchio {
	double r;
	double p=3.14;
	double perimetro;
	double area;
	double rr;
	double diametro;
	public Cerchio(double r){
		this.r=r;
		this.diametro=r*2;
	}
	public void risultati() {
		System.out.println("raggio= " + r);
		System.out.println("diametro= "+diametro);
		System.out.println("area= "+area);
		System.out.println("perimetro= "+perimetro);
	}
	public void perimetro(){
		this.perimetro=diametro*p;
	}
	public void area() {
		this.area=Math.sqrt(r)*perimetro;
	}
	
}
