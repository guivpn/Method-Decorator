public class TestaDecorator {
    public static void main(String[] args) {
        // Açaí simples
        Adicional acaiSimples = new Acai();
        System.out.println("Descrição: " + acaiSimples.getDescricao());
        System.out.println("Custo Pequeno: R$ " + acaiSimples.custo(Tamanho.PEQUENO));
        System.out.println("Custo Médio: R$ " + acaiSimples.custo(Tamanho.MEDIO));
        System.out.println("Custo Grande: R$ " + acaiSimples.custo(Tamanho.GRANDE));

        // Açaí com Morango
        Adicional acaiComMorango = new Morango(new Acai());
        System.out.println("\nDescrição: " + acaiComMorango.getDescricao());
        System.out.println("Custo Pequeno: R$ " + acaiComMorango.custo(Tamanho.PEQUENO));
        System.out.println("Custo Médio: R$ " + acaiComMorango.custo(Tamanho.MEDIO));
        System.out.println("Custo Grande: R$ " + acaiComMorango.custo(Tamanho.GRANDE));

        // Açaí com Morango, Leite Condensado e Banana
        Adicional acaiCompleto = new LeiteCondensado(new Banana(new Morango(new Acai())));
        System.out.println("\nDescrição: " + acaiCompleto.getDescricao());
        System.out.println("Custo Pequeno: R$ " + acaiCompleto.custo(Tamanho.PEQUENO));
        System.out.println("Custo Médio: R$ " + acaiCompleto.custo(Tamanho.MEDIO));
        System.out.println("Custo Grande: R$ " + acaiCompleto.custo(Tamanho.GRANDE));
    }
}
