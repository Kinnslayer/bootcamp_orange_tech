package main.designpatterns.template;

class ProcessadorPagamentoCredito extends ProcessadorPagamento {
    
    @Override
    protected void debitar() {
        System.out.println("Debitando...");
    }

    @Override
    protected void notificarAdicional() {
        System.out.println("Notificações adicionais...");
    }

    @Override
    protected void finalizarAdicional() {
        System.out.println("Ultimas finalizações...");
    }
}
