public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Ejemplo de creación de un empleado vendedor
        Empleado empleado1 = new EmpleadoVendedor("123456789", "Perez", "Juan", 3000, 0.08);
        empleado1.mostrarInformacion();
        System.out.println("Ingresos: $" + empleado1.calcularIngresos());
        System.out.println("Bonificación: $" + empleado1.calcularBonificacion());
        System.out.println("Descuento: $" + empleado1.calcularDescuento());
        System.out.println("Sueldo Neto: $" + empleado1.calcularSueldoNeto());

        // Ejemplo de creación de un empleado permanente
        Empleado empleado2 = new EmpleadoPermanente("987654321", "Gomez", "Maria", 2000, "12345");
        empleado2.mostrarInformacion();
        System.out.println("Ingresos: $" + empleado2.calcularIngresos());
        System.out.println("Bonificación: $" + empleado2.calcularBonificacion());
        System.out.println("Descuento: $" + empleado2.calcularDescuento());
        System.out.println("Sueldo Neto: $" + empleado2.calcularSueldoNeto());
    }
}