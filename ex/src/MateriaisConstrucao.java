import java.util.ArrayList;
import java.util.List;

public class MateriaisConstrucao {
    private List<Produto> produtos= new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public Produto produtoMaisCaro(String marca) {
        Produto maisCaro = null;

        for(Produto produto : produtos) {
            if(produto.getMarca().equalsIgnoreCase(marca)) {
                if(maisCaro == null || produto.getPreco() > maisCaro.getPreco()) {
                    maisCaro = produto;
                }
            }
        }
        return maisCaro;
    }
    public List<Produto> produtosPorMarcaEPreco(String marca, double x, double y) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto produto : produtos) {
            if(produto.getMarca().equalsIgnoreCase(marca) && produto.getPreco() >= x && produto.getPreco() <= 7) {
    resultado.add(produto);
            }
        }
        return resultado;
    }
}
