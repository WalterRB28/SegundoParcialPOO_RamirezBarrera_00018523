public class PagoPaypal implements  Pago{
    private String name;
    private String password;

    public PagoPaypal(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void Pagar() {
        System.out.println(name + " ha pagado");
    }
}
