public class Produtos {

    public int id;
    public String refproduto;
    public String produto;
    public String preco;


    public Produtos(int id, String refproduto, String produto, String preco) {

        this.id = id;
        this.refproduto = refproduto;
        this.produto = produto;
        this.preco = preco;

    }

    @Override
    public String toString() {
        return refproduto;

    }
}
