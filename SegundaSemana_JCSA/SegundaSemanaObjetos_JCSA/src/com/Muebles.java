package com;

public class Muebles {
	private String mueble;
	private String color;
	private String tamano;
	private String	material;
	
	public Muebles () {}

	public Muebles(String mueble, String color, String tamano, String material) {
		super();
		this.mueble = mueble;
		this.color = color;
		this.tamano = tamano;
		this.material = material;
	}

	public String getMueble() {
		return mueble;
	}

	public void setMueble(String mueble) {
		this.mueble = mueble;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Muebles [mueble=" + mueble + ", color=" + color + ", tamano=" + tamano + ", material=" + material + "]";
	}
	
	
	

}
