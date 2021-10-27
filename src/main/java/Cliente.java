public class Cliente {
    private Carrinho carrinho;

    public Cliente(){
        this.carrinho = new Carrinho();
    }
    public Carrinho getCarrinho() {
        return carrinho;
    }

    //Para realizar a compra, o cliente escolhe um caixa disponível
    public void realizarCompra(Caixa caixa){
        caixa.iniciarVenda(this);
    }

    public void consultarValor(String codigo){
        Leitor.mostrarValorProduto(codigo);
    }
}
