public class ProdutoUnitario extends Produto{

    public ProdutoUnitario(String codigo, String nome, double valor){
        super(codigo, nome, valor);
    }

    @Override
    public double calcularValor(double qtd){
        return (int)qtd * this.getPreco();
    }
}

