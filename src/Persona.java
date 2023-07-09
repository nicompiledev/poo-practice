class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona otraPersona = (Persona) obj;
        return nombre.equals(otraPersona.nombre) && edad == otraPersona.edad;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + edad;
    }
}