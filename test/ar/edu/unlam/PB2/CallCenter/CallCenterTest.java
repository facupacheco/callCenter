package ar.edu.unlam.PB2.CallCenter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CallCenterTest {
	@Test
	public void creacionDeContactoConEmailIncorrecto(){
		Contacto contacto = new Contacto("Facundo", "Pacheco", "05491164578238", "Alem 1544", "Alem 1544", 1712, "Caselar", Provincia.BUENOS_AIRES);		
		String valorEsperado=null;
		String valorObtenido=contacto.getNombre();
		assertEquals(valorObtenido,valorEsperado);
	}
	@Test
	public void creacionDeContactoConEmailCorrecto(){
		Contacto contacto = new Contacto("Facundo", "Pacheco", "05491164578238", "facundo@test.com", "Alem 1544", 1712, "Caselar", Provincia.BUENOS_AIRES);		
		String valorEsperado="Facundo";
		String valorObtenido=contacto.getNombre();
		assertEquals(valorObtenido,valorEsperado);
	}
	@Test
	public void validarQueEsteEnClienteNO(){
		Contacto contacto = new Contacto("Facundo", "Pacheco", "05491164578238", "facundo@test.com", "Alem 1544", 1712, "Caselar", Provincia.BUENOS_AIRES);		
		Boolean valorEsperado=false;
		Boolean valorObtenido=contacto.getCliente();
		assertEquals(valorObtenido,valorEsperado);
	}
	
	
}
