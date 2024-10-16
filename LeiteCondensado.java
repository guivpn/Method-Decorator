public class LeiteCondensado extends BaseDecorator{
    public LeiteCondensado(Adicional wrappee) {
        super(wrappee);
    }

    public String getDescricao() {
        return wrappee.getDescricao() + ", Leite Condensado";
    }

    public double custo(Tamanho tamanho) {
        switch (tamanho) {
            case PEQUENO: return wrappee.custo(tamanho) + 1.50;
            case MEDIO: return wrappee.custo(tamanho) + 2.00;
            case GRANDE: return wrappee.custo(tamanho) + 2.50;
            default: return wrappee.custo(tamanho);
        }
    }
}
