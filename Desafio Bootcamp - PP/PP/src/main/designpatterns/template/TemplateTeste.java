package main.designpatterns.template;

public class TemplateTeste {
    public static void main(String[] args) {
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamentoCredito();
        processadorPagamento.processarPagamento();

    }
}
