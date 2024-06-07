package com;

public class Computadoras {
	
		private String Marca;
		private String color;
		private int Procesador;
		private int	memoriaRam;
		private String tipoDisco;
		
		public Computadoras () {}

		public Computadoras(String marca, String color, int procesador, int memoriaRam, String tipoDisco) {
			super();
			Marca = marca;
			this.color = color;
			Procesador = procesador;
			this.memoriaRam = memoriaRam;
			this.tipoDisco = tipoDisco;
		}

		public String getMarca() {
			return Marca;
		}

		public void setMarca(String marca) {
			Marca = marca;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getProcesador() {
			return Procesador;
		}

		public void setProcesador(int procesador) {
			Procesador = procesador;
		}

		public int getMemoriaRam() {
			return memoriaRam;
		}

		public void setMemoriaRam(int memoriaRam) {
			this.memoriaRam = memoriaRam;
		}

		public String getTipoDisco() {
			return tipoDisco;
		}

		public void setTipoDisco(String tipoDisco) {
			this.tipoDisco = tipoDisco;
		}

		@Override
		public String toString() {
			return "Computadoras [Marca=" + Marca + ", color=" + color + ", Procesador=" + Procesador + ", memoriaRam="
					+ memoriaRam + ", tipoDisco=" + tipoDisco + "]";
		}
		
		
}
