public class Produto {

    private String marca;
    private String modelo;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String marca, String modelo, double preco, int quantidadeEstoqu) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoqu;
    }

    public void adicionarEstoque(int quantidade) {
        if(quantidade > 0) {
            quantidadeEstoque += quantidade;
        }
    }
    public boolean vender(int quantidade) {
        if(quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "produto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
