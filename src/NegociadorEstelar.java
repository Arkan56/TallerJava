public class NegociadorEstelar extends MiembroDeTripulacion{
    private double salarioBase;
    private double comision;
    private double ventas;

    public NegociadorEstelar(String nombre, int id, int edad, int nDependientes, char rol, double salarioBase,
            double comision, double ventas) {
        super(nombre, id, edad, nDependientes, rol);
        this.salarioBase = salarioBase;
        this.comision = comision;
        this.ventas = ventas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return super.toString() + "NegociadorEstelar \nsalarioBase = " + salarioBase + ", comision = " + comision + ", ventas = "  + ventas + "\n";
    }

    @Override
    public double calcularSueldoMensual() {
        return (this.salarioBase / 12) + (this.ventas * this.comision);
    }

    @Override
    public String mostrarInformacion() {
        return super.toString() + toString();
    }

    
    
    
}
