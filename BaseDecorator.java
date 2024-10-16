public class BaseDecorator implements Adicional{
    protected Adicional wrappee;

    public BaseDecorator(Adicional wrappee) {
        this.wrappee = wrappee;
    }

    public String getDescricao() {
        return wrappee.getDescricao();
    }

    public double custo(Tamanho tamanho) {
        return wrappee.custo(tamanho);
    }
}
