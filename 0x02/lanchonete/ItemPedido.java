public class ItemPedido {
    private TipoItemPedido tipo;
    private String nome;

    public ItemPedido() {
    }

    public ItemPedido(TipoItemPedido tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }
    
    public TipoItemPedido getTipo() {
        return tipo;
    }
    public void setTipo(TipoItemPedido tipo) {
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ItemPedido [nome=" + nome + ", tipo=" + tipo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemPedido other = (ItemPedido) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (tipo != other.tipo)
            return false;
        return true;
    }
}