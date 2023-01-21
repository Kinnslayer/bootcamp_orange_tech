package Classes_Desafio_Poo;

public class Transportador extends Cliente{
    private int cnh;

    public Transportador(String nome, String rg, String endereco, int cnh) {
        super(nome, rg, endereco);
        this.cnh = cnh;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    

}
