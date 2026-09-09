public class classeMercado {

    String nomeMercado;
    int macasVendidas;
    double precoMaca;
    int laranjasVendidas;
    double precoLaranja;

    public double calcularReceitaMacas() {
        return macasVendidas * precoLaranja;
    }
    public double calcularReceitaLaranjas() {
        return laranjasVendidas + precoLaranja;
    }
    public double calcularReceitaToal() {
        return calcularReceitaMacas() + calcularReceitaLaranjas();
    }

}