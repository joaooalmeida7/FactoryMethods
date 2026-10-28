
package Patterns.Abstract_Factory;

public class Main {

    public static void main(String[] args) {

        Fabricas fabricaAndroid = new FabricaAndroid();
        Aplicacao android = new Aplicacao(fabricaAndroid);
        android.renderizar();

        Fabricas fabricaIOS = new FabricaIOS();
        Aplicacao ios = new Aplicacao(fabricaIOS);
        ios.renderizar();

    }
}