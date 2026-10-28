package Patterns.Factory_Method;

public abstract class FabricaNotificacoes {

    public abstract IntNotificacoes criarNotificacoes();

    public void executarEnvio() {
        IntNotificacoes notificacao = criarNotificacoes();
        notificacao.enviar();
    }
}