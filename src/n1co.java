public class n1co implements Pago{
    private String name;

    public n1co(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Pagar() {
        System.out.println(name + ":" + "n1co ha pagado" );
    }
}
