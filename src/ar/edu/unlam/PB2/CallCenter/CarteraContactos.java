package ar.edu.unlam.PB2.CallCenter;

public class CarteraContactos {
	private Contacto[] cartera;
	private Integer cantidadContactos=0;

	public CarteraContactos() {
	}
	
	public void sumarContacto(Contacto contacto) {
		this.cartera[this.cantidadContactos]=contacto;
		this.cantidadContactos++;
	}
	
	public Contacto obtenerContacto() {
		Contacto contacto;
		
		return contacto;
	}
}
