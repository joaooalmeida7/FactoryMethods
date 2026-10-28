
package Patterns.Factory_Method;

public class FabricaPush extends FabricaNotificacoes {

    @Override
    public IntNotificacoes criarNotificacoes() {
        return new EnvioPush();
    }
}
