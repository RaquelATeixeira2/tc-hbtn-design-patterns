import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        StringBuilder itensForaDaCaixa = new StringBuilder("\tFora da Caixa:\n");
        StringBuilder itensDentroDaCaixa = new StringBuilder("\tDentro da Caixa:\n");

        getItensForaCaixa().stream().sorted(new ItemPedido()).forEach(itemPedido -> itensForaDaCaixa.append(String.format("\t\t- %s %s\n", itemPedido.getTipo(), itemPedido.getNome())));
        getItensDentroCaixa().stream().sorted(new ItemPedido()).forEach(itemPedido -> itensDentroDaCaixa.append(String.format("\t\t- %s %s\n", itemPedido.getTipo(), itemPedido.getNome())));

        return itensForaDaCaixa + itensDentroDaCaixa.toString();
    }
}