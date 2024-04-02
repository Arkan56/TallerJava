public class IngenieroDeSistemas extends MiembroDeTripulacion{
    private double salarioHoraM;
    private int horasTrab;

    public IngenieroDeSistemas(String nombre, int id, int edad, int nDependientes, char rol, double salarioHoraM,
            int horasTrab) {
        super(nombre, id, edad, nDependientes, rol);
        this.salarioHoraM = salarioHoraM;
        this.horasTrab = horasTrab;
    }

    public double getSalarioHoraM() {
        return salarioHoraM;
    }

    public void setSalarioHoraM(double salarioHoraM) {
        this.salarioHoraM = salarioHoraM;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    @Override
    public String toString() {
        return super.toString() + "IngenieroDeSistemas \nsalarioHoraM = " + salarioHoraM + ", horasTrab = " + horasTrab + "\n";
    }

    @Override
    public double calcularSueldoMensual() {
        return this.salarioHoraM * this.horasTrab;
    }

    @Override
    public String mostrarInformacion() {
        return toString();
    }

    

    
}
