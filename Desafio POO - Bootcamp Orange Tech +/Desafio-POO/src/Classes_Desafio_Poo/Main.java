package Classes_Desafio_Poo;


public class Main {
        public static void main(String[] args) {

            Cliente cliente = new Cliente("Carlos Silveira", "434678555-0", "Rua do Bootcamp, 51");
            Fatura fatura = new Fatura(1, "Monitor Gamer", 1, 2300);
            Transportador transportador = new Transportador("Samuel Oliveira", "837462315-8", 
            "Rua das Entregas, 123", 537482348);

            System.out.println("Nome do cliente: " + cliente.getNome());
            System.out.println("Documento do cliente: " + cliente.getRg());
            System.out.println("Endereço do cliente: " + cliente.getEndereco());
            System.out.println("Código do item: " + fatura.getCodigo());
            System.out.println("Descrição do produto: " + fatura.getDescricao());
            System.out.println("Quantidade: " + fatura.getQtdPorItem());
            System.out.println("Valor do produto: " + fatura.getPrecoPorItem());
            System.out.println("Valor do produto com frete: " + fatura.getTotalFatura());
            System.out.println("Nome do transportador: " + transportador.getNome());
            System.out.println("Documento do transportador: " + transportador.getRg());
            System.out.println("Endereço do transportador: " + transportador.getEndereco());
            System.out.println("CNH do transportador: " + transportador.getCnh());

            

        }
}
