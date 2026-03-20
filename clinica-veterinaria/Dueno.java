
public class Dueno {
	private String nombre;
	private String apellido;
	private String telefono;
	private String email;
	private String cedula;
	//CONSTRUCTOR
	public Dueno(String nombre, String apellido, String telefono, String email, String cedula) {
		super();
		//pasa por las validaciones antes de guardar- dentro de los set
		setNombre(nombre);
		setApellido(apellido);
		setTelefono(telefono);
		setEmail(email);
		setCedula(cedula);
	}
	//METODOS GEY Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {		
		if(nombre!=null && !nombre.equals("")) {
			this.nombre = nombre;
		}else {
			this.nombre = "Desconocido";
		}		
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		if(apellido!=null && !apellido.equals("")) {
			this.apellido = apellido;
		}else {
			this.apellido = "Desconocido";
		}	
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {		
		if(telefono.length()==10) {
			this.telefono = telefono;
		}else {
			this.telefono = "00000000";
		}	
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		if(email!=null && email.contains("@") && email.indexOf("@")<email.lastIndexOf(".")) {
			this.email = email;
		}else {
			this.email = "sin@email.com";
		}		
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		if(cedula!=null && !cedula.equals("")) {
			this.cedula = cedula;
		}else {
			this.cedula = "00000000000";
		}
		
	}
	public String nombreCompleto() {
		return nombre+" "+apellido;
	}
	
	public boolean tieneEmailValido() {
		return true;
	}	

}
