package builder;

public class Program {
    public static void main(String[] args) {
        Cont cont =new ContBuilder()
                .setNumeUtilizator("Popescu")
                .setPret(1000).setDurataAbonament(4)
                .setTipAbonament(TipAbonament.EXPERT)
                .buid();

        System.out.println(cont.toString());
    }
}