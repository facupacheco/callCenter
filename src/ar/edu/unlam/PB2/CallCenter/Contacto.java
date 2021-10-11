package ar.edu.unlam.PB2.CallCenter;

public class Contacto {
	private String nombre;
	private String apellido;
	private String telefono;
	private String email;
	private String direccion;
	private Integer codigoPostal;
	private String localidad;
	private Provincia provincia;
	private Boolean cliente = false;
	private Boolean llamarNuevamente = true;
	private String observaciones;
	

	public Contacto(String nombre, String apellido, String telefono, String email, String direccion,
			Integer codigoPostal, String localidad, Provincia provincia) {
		if(validarEmail(email)) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.telefono = telefono;
			this.email = email;
			this.direccion = direccion;
			this.codigoPostal = codigoPostal;
			this.localidad = localidad;
			this.provincia = provincia;
		}			
	}
	
	private Boolean validarEmail(String email) {
		Boolean valido = false;
		Integer cantidadDeArrobas=0;
		char[] cadenaEmail=email.toCharArray();
		for(Integer i=0; i < cadenaEmail.length; i++) {
			if(cadenaEmail[i] == '@') {
				cantidadDeArrobas++;
			}			
		}
		if(cantidadDeArrobas==1 && email.contains(".")) {
			valido=true;
		}
		return valido;		
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		if(validarEmail(email)) {
			this.email = email;			
		}
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getObservaciones() {
		return observaciones;
	}
	
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public Provincia getProvincia() {
		return provincia;
	}


	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}


	public Boolean getCliente() {
		return cliente;
	}


	public void setCliente(Boolean cliente) {
		this.cliente = cliente;
	}


	public Boolean getLlamarNuevamente() {
		return llamarNuevamente;
	}


	public void setLlamarNuevamente(Boolean llamarNuevamente) {
		this.llamarNuevamente = llamarNuevamente;
	}


	
}
