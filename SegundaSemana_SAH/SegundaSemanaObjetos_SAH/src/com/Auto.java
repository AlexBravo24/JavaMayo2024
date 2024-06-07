package com;

public class Auto {
	
	 private String marca;
	 private String version;
	 private int año;
	 private String color;

	    public Auto() {}
	    
	    public Auto(String marca, String version, int año, String color) {
	        this.marca = marca;
	        this.version = version;
	        this.año = año;
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

		public int getAño() {
			return año;
		}

		public void setAño(int año) {
			this.año = año;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Auto [marca=" + marca + ", version=" + version + ", año=" + año + ", color=" + color + "]";
		}


	    }

	

