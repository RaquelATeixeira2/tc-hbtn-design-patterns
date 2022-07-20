import java.util.UUID;

public class CalculadorSalarioService {

    private CalculadorSalarioService() {
    }
    
    private static CalculadorSalarioService instance;

    public static CalculadorSalarioService getCalculadorSalarioService(){

        if( instance == null ){

            instance = new CalculadorSalarioService();
        }

        return instance;
    }

    public double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        return salarioBruto - valorDescontos + (valorVendas * (percentualComissao/100));
    }

    public UUID uuid = UUID.randomUUID();

    public static void setInstance(CalculadorSalarioService instance) {
        CalculadorSalarioService.instance = instance;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    

    
}
