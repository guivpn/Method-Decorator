public class Morango extends BaseDecorator{
    public Morango(Adicional wrappee) {
        super(wrappee);
    }

    public String getDescricao() {
        return wrappee.getDescricao() + ", Morango";
    }

    public double custo(Tamanho tamanho) {
        switch (tamanho) {
            case PEQUENO: return wrappee.custo(tamanho) + 1.00;
            case MEDIO: return wrappee.custo(tamanho) + 1.50;
            case GRANDE: return wrappee.custo(tamanho) + 2.00;
            default: return wrappee.custo(tamanho);
        }
    }
}
