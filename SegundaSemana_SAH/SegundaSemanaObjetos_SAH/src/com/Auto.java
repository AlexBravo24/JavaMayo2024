package com;

public class Auto {
	
	 private String marca;
	 private String version;
	 private int a�o;
	 private String color;

	    public Auto() {}
	    
	    public Auto(String marca, String version, int a�o, String color) {
	        this.marca = marca;
	        this.version = version;
	        this.a�o = a�o;
	        this.color = color;
	        
	    }
	    
	    
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return version;
		}

		public void setModelo(String version) {
			this.version = version;
		}

		public int getA�o() {
			return a�o;
		}

		public void setA�o(int a�o) {
			this.a�o = a�o;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Auto [marca=" + marca + ", version=" + version + ", a�o=" + a�o + ", color=" + color + "]";
		}


	    }

	

