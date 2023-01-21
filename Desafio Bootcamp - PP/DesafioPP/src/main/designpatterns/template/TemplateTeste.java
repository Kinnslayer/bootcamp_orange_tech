package main.designpatterns.template;

public class TemplateTeste {
    public static void main(String[] args) {
        Pagamento processadorPagamento = new PagamentoCredito();
        processadorPagamento.processarPagamento();

    }
}
