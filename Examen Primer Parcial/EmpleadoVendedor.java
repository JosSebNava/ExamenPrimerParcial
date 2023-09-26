public class EmpleadoVendedor extends Empleado {
    private double montoVendido;
    private double tasaComision;

    public EmpleadoVendedor(String RFC, String apellidos, String nombres, double montoVendido, double tasaComision) {
        super(RFC, apellidos, nombres);
        this.montoVendido = montoVendido;
        this.tasaComision = tasaComision;
    }

    @Override
    public double calcularIngresos() {
        return montoVendido * tasaComision;
    }

    @Override
    public double calcularBonificacion() {
        if (montoVendido < 1000) {
            return 0;
        } else if (montoVendido <= 5000) {
            return 0.05 * calcularIngresos();
        } else {
            return 0.10 * calcularIngresos();
        }
    }

    @Override
    public double calcularDescuento() {
        if (calcularIngresos() < 1000) {
            return 0.11 * calcularIngresos();
        } else {
            return 0.15 * calcularIngresos();
        }
    }

    @Override
    public double calcularSueldoNeto() {
        return calcularIngresos() + calcularBonificacion() - calcularDescuento();
    }
}