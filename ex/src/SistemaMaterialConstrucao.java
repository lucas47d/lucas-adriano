import java.util.List;

public class SistemaMaterialConstrucao {
    public static void main(String[] args) {
        MateriaisConstrucao loja = new MateriaisConstrucao();

        Produto p1 = new Produto("all","Tubo PVC",50.0,20);
        Produto p2 = new Produto("all","Torneira",80.0,10);
        Produto p3 = new Produto("Votoran","Cimento",40.0,30);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);

        p1.adicionarEstoque(5);

        p1.vender(3);

        System.out.println("Produto mais caro da marca all");
        System.out.println(loja.produtoMaisCaro("all"));

        System.out.println("\nProdutos da marca all entre R$ 40 e R$ 70:");

        List<Produto> encontrados = loja.produtosPorMarcaEPreco("all",20,70);

        for(Produto produto : encontrados) {
            System.out.println(produto);
        }
    }
}
