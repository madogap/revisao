package apps;
public class MsnMessenger extends ServiceMessengerInstantania{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Msn");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Msn");
  salvarHistoricoMensagem();
    }

}
