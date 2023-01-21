package main.designpatterns.template;

abstract class Pagamento {
    
    //Template Method
    public void processarPagamento() {
        preparar();
        validar();
        debitar();
        notificar();
        notificarAdicional();
        finalizar();
        finalizarAdicional();

    }

    protected abstract void debitar();

    private void preparar() {
        System.out.println("Reservando sua compra.");
    }

    private void validar() {
        System.out.println("Validando o cadastro.");
    }

    private void notificar() {
        System.out.println("Notificando o usuário.");
    }

    private void finalizar() {
        System.out.println("Finalizando a transação");
    }

    protected void notificarAdicional() {
        
    }

    protected void finalizarAdicional() {
        
    }


}
