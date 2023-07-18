package bytebank;

public class TestReferencias2 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Diego");
        cliente1.setDocumento("1152701108");
        cliente1.setTelefono("3215601894");

        Cuenta cuentaDeDiego = new Cuenta(124,178);
        cuentaDeDiego.setTitular(cliente1);
        cuentaDeDiego.setSaldo(100);
        cuentaDeDiego.setAgencia(175);

        System.out.println(cuentaDeDiego.getTitular());


    }
}
