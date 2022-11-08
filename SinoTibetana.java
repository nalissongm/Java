public class SinoTibetana extends Lingua {

    public SinoTibetana(String nome, int numFalantes) {
        super(nome, numFalantes, "Leste, sul e sudeste da Ásia", "sujeito-objeto-verbo");

        if (nome.equals("Mandarim") || nome.equals("Cantonês") || nome.equals("Chinês")) {
            this.setOrdemPalavras("objeto-verbo-sujeito");
        }
    }

    @Override
    public void getFamiliaInfo() {
        super.getFamiliaInfo();

        System.out.println("Sino-Tibetano é uma família de mais de 400 línguas,"
                + "perdendo apenas para o Indo-Europeu em número de falantes"
                + "nativos. A grande maioria deles são os 1,3 bilhão de"
                + "falantes nativos de línguas chinesas. Outras línguas"
                + "sino-tibetanas com grande número de falantes incluem o"
                + "birmanês (33 milhões) e as línguas tibetanas (6 milhões).");
    }

}
