public class Romanica extends Lingua {
    public Romanica(String nome, int numFalantes, String regiao, String ordemPalavras) {
        super(nome, numFalantes, regiao, ordemPalavras);
    }

    @Override
    public void getFamiliaInfo() {
        super.getFamiliaInfo();

        System.out.println(
                "As línguas românicas, também conhecidas como línguas "
                        + "neolatinas, latinas, ou colectivamente como romance ou "
                        + "romanço, são idiomas que integram o vasto conjunto das "
                        + "línguas indo-europeias que se originaram da evolução do "
                        + "latim, principalmente do latim vulgar, falado pelas classes "
                        + "mais populares.");
    }
}
