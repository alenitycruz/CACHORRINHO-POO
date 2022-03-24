package comportamento;

public class Principal {
    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        Lobo l = new Lobo();

        c.setPeso(10.5f);
        c.setIdade(7);
        c.setMembros(4);
        c.setCorPelo("Bege");
        System.out.println("A cor do pelo do cachorrinho é "+c.getCorPelo());
        System.out.println("O lobinho faz:");
        l.emitirSom();
        System.out.println("Ananda falou para oi para o cachorrinho e ele: ");
        c.reagir("Ola");
        c.reagir(7,10.5f);
        c.reagir(true);
    }
}
