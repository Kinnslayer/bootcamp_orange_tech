public class UsuarioTv {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status : TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status : TV está ligada? " + smartTv.ligada);    

        smartTv.ligar();
        System.out.println("Novo status : TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
    }
}