public class Main {
    public static void main(String[] args) {
        PagoPaypal paypal = new PagoPaypal("Walter", "123");
        n1co n1coPago = new n1co(paypal.getName());
        paypal.Pagar();
        n1coPago.Pagar();
    }
}
