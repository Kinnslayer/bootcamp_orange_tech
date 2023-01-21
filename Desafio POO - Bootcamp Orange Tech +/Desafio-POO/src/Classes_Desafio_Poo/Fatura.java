package Classes_Desafio_Poo;

public class Fatura {
    private int codigoItem;
    private String descricao;
    private int qtdPorItem;
    private double precoPorItem;
    private double frete;

    protected Fatura(int codigoItem, String descricao, int qtdPorItem, double precoPorItem) {
        this.setCodigo(codigoItem);
        this.setDescricao(descricao);
        this.setQtdPorItem(qtdPorItem);
        this.setPrecoPorItem(precoPorItem);
        this.setFrete(frete);
    }

    public double getTotalFatura(){
        if (precoPorItem > 2000){
            frete = 100;
        }
        else if (precoPorItem >= 1000){
            frete = 70;
        }
        else{
            frete = 20;
        }
        return (qtdPorItem * precoPorItem) + frete;
    }

    public int getCodigo() {
        return codigoItem;
    }
    public void setCodigo(int codigoItem) {
        this.codigoItem = codigoItem;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQtdPorItem() {
        return qtdPorItem;
    }
    public void setQtdPorItem(int qtdPorItem) {
        if (qtdPorItem < 0){
            this.qtdPorItem = 0;
        } else {
            this.qtdPorItem = qtdPorItem;
        }
    }
    public double getPrecoPorItem() {
        return precoPorItem;
    }
    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem < 0){
            this.precoPorItem = 0;
        } else {
            this.precoPorItem = precoPorItem;
        }
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }


}


