public class Usuario {
    
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        //Status da TV
        System.out.println("TV Ligada? " + smartTv.ligada); 
        System.out.println("Canal Atual? " + smartTv.canal); 
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.ligar(); //Ligando TV
        System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);
        smartTv.desligar(); //Desligando TV
        System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);

        smartTv.aumentar();//Aumentando volume
        smartTv.aumentar();
        smartTv.aumentar();
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.abaixar();//Abaixando volume
        System.out.println("Volume Atual? " + smartTv.volume);


        smartTv.aumentarCanal();//Aumentando Canail
        System.out.println("Novo Status - Canal: " + smartTv.canal);

        smartTv.mudarCanal(20);//O usuário escolheu o canal 20
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
