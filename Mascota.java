public class Mascota {
    private String nombre;
	private String especie;
	private String raza;
	private int edad;
	private double peso;
	
	public Mascota () {}

	public Mascota(String nombre, String especie, String raza, int edad, double peso) {
	    setNombre(nombre);
	    setEspecie(especie);
	    setRaza(raza);
	    setEdad(edad);
	    setPeso(peso);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }
    }

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            this.especie = "Desconocida";
        } else {
            this.especie = especie;
        }
    }

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
        if (raza == null || raza.trim().isEmpty()) {
            this.raza = "Mestizo";
        } else {
            this.raza = raza;
        }
    }

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
        if (edad < 0) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
        if (peso <= 0) {
            this.peso = 0.1;
        } else {
            this.peso = peso;
        }
    }

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", edad=" + edad + ", peso="
				+ peso + "]";
	}
	
	public boolean esAdulto() {
		if(edad >= 3) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean estaEnPesoNormal(double pesoMin, double pesoMax) {
		if(peso >= pesoMin && peso <= pesoMax) {
			return true;
		}else {
			return false;
		}
	}
}
