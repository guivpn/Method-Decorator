public class Banana extends BaseDecorator{
    public Banana(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Banana";
    }

    @Override
    public double custo(Tamanho tamanho) {
        switch (tamanho) {
            case PEQUENO: return wrappee.custo(tamanho) + 1.00;
            case MEDIO: return wrappee.custo(tamanho) + 1.50;
            case GRANDE: return wrappee.custo(tamanho) + 2.00;
            default: return wrappee.custo(tamanho);
        }
    }
}
