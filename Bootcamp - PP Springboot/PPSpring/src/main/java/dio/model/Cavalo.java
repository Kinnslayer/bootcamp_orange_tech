package dio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cavalo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public String nome = "Cavalo";
    public String porte;
    public String cor;
    public String raca;     
    public long valor;

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
        return "Cavalo [id=" + id + ", nome=" + nome + ", porte=" + porte + ", cor=" + cor + ", raca=" + raca
                + ", valor=" + valor + "]";
    }

    
    
}
