public abstract class Empleado {
    private String RFC;
    private String apellidos;
    private String nombres;

    public Empleado(String RFC, String apellidos, String nombres) {
        this.RFC = RFC;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public abstract double calcularIngresos();
    public abstract double calcularBonificacion();
    public abstract double calcularDescuento();
    public abstract double calcularSueldoNeto();

    public void mostrarInformacion() {
        System.out.println("RFC: " + RFC);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Nombres: " + nombres);
    }
    
    class SalarioInsuficienteException extends Exception {
        public SalarioInsuficienteException(String mensaje) {
            super(mensaje);
        }
    }
}
