public class ProdutoQuilo extends Produto{
    private double quatidadeQuilos;

    public ProdutoQuilo(String codigo, String nome, double preco, double quatidadeQuilos){
        super(codigo, nome, preco);
        this.quatidadeQuilos = quatidadeQuilos;
    }

    public double getQuatidadeQuilos(){
        return quatidadeQuilos;
    }
    public void setQuatidadeQuilos(double quatidadeQuilos){
        if(quatidadeQuilos < 0){
            this.quatidadeQuilos = 0;
        }
        else{
            this.quatidadeQuilos = quatidadeQuilos;
        }
    }

    @Override
    public double calcularValor(double quilos){
        return quilos * this.getPreco();
    }
}
