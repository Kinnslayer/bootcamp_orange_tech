package Classes_Desafio_Poo;


public class Cliente {
        private String nome;
        private String rg;
        private String endereco;
        
        protected Cliente(String nome, String rg, String endereco) {
            this.nome = nome;
            this.rg = rg;
            this.endereco = endereco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getRg() {
            return rg;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        
}
