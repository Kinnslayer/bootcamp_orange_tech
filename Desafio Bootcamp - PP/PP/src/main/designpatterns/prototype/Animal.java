package main.designpatterns.prototype;

public class Animal implements Cloneable {

    public String nome = "Cavalo";
    public String porte;
    public String cor;
    public String raca;
    public long valor;


    public Object clone() {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
           e.printStackTrace();
           return null;
        }
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getPorte() {
        return porte;
    }


    public void setPorte(String porte) {
        this.porte = porte;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getRaca() {
        return raca;
    }


    public void setRaca(String raca) {
        this.raca = raca;
    }

    public long getValor() {
        return valor;
    }


    public void setValor(long valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", porte=" + porte + ", cor=" + cor + ", raca=" + raca + "]";
    }







    
}


