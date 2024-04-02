public abstract class MiembroDeTripulacion {
    private String nombre;
    private int id;
    private int edad;
    private int nDependientes;
    private char rol;


    public MiembroDeTripulacion(String nombre, int id, int edad, int nDependientes, char rol) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.nDependientes = nDependientes;
        this.rol = rol;
    }

    public abstract double calcularSueldoMensual();
    public abstract String mostrarInformacion();
    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public int getnDependientes() {
        return nDependientes;
    }


    public void setnDependientes(int nDependientes) {
        this.nDependientes = nDependientes;
    }


    public char getRol() {
        return rol;
    }


    public void setRol(char rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", id = " + id + ", edad = " + edad + ", nDependientes = "
                + nDependientes + ", rol = " + rol + "\n";
    }

    

    
}
