// Main class
public class Main {
    public static void main(String[] args) {
        // tax return and account
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.00);
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.00);

        // Show info
        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                ", saldo disponible: $" + cuenta.getSaldoDisponible());

        // Validate
        boolean esValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?: " + esValido);
    }
}