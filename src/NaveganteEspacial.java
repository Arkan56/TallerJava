public class NaveganteEspacial extends MiembroDeTripulacion{
    private int salarioAnual;
    private int aniosExp;

    public NaveganteEspacial(String nombre, int id, int edad, int nDependientes, char rol, int salarioAnual,
            int aniosExp) {
        super(nombre, id, edad, nDependientes, rol);
        this.salarioAnual = salarioAnual;
        this.aniosExp = aniosExp;
    }

    public int getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(int salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }



    @Override
    public String toString() {
        return super.toString() + "NaveganteEspacial \nsalarioAnual = " + salarioAnual + ", aniosExp = " + aniosExp + "\n";
    }



    @Override
    public double calcularSueldoMensual() {
        return (this.salarioAnual/12);
    }



    @Override
    public String mostrarInformacion() {
        return toString();
    }

    
    
}
