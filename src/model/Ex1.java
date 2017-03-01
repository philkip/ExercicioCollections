package model;

public class Ex1 
{
	private char carac;
	private int num;
	private String pal;
	private float flo;
	private String frase;
	
	public Ex1(char carac, int num, String pal, float flo, String frase) {
		super();
		this.carac = carac;
		this.num = num;
		this.pal = pal;
		this.flo = flo;
		this.frase = frase;
	}

	public char getCarac() {
		return carac;
	}

	public void setCarac(char carac) {
		this.carac = carac;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPal() {
		return pal;
	}

	public void setPal(String pal) {
		this.pal = pal;
	}

	public float getFlo() {
		return flo;
	}

	public void setFlo(float flo) {
		this.flo = flo;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
		
}
