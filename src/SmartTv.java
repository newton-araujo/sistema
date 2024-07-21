public class SmartTv {
    boolean ligada = false;
    int volume = 1;
    int canal = 20;
    
    //Ligar TV
    public void ligar(){
        ligada = true;
    }
    //Desligar TV
    public void desligar(){
        ligada = false;
    }
    
    //Aumentar volume
    public void aumentar(){
        volume++;
    }

    //Abaixar volume
    public void abaixar(){
         volume--;
    }

    //aumentar Canal
    public void aumentarCanal(){
        canal++;
    }

    //Diminuir Canal
    public void diminuir(){
        canal--;
    }

    //Mudar canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
