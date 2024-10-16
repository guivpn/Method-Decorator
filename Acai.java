public class Acai implements Adicional{
    public String getDescricao() {
        return "Açaí";
    }

    public double custo(Tamanho tamanho) {
        switch (tamanho) {
            case PEQUENO: return 5.00;
            case MEDIO: return 7.00;    
            case GRANDE: return 9.00;
            default: return 0;
        }
    }
}
