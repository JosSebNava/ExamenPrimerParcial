public class EmpleadoPermanente extends Empleado {
    private double sueldoBase;
    private String numeroSeguroSocial;

    public EmpleadoPermanente(String RFC, String apellidos, String nombres, double sueldoBase, String numeroSeguroSocial) {
        super(RFC, apellidos, nombres);
        this.sueldoBase = sueldoBase;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    @Override
    public double calcularIngresos() {
        return sueldoBase;
    }

    @Override
    public double calcularBonificacion() {
        return 0;  // No hay bonificación para empleados permanentes
    }

    @Override
    public double calcularDescuento() {
        return 0.11 * sueldoBase;
    }

    
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    @Override
    public double calcularSueldoNeto() {
        return calcularIngresos() - calcularDescuento();
    }
}