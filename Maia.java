public class Maia extends Lingua {

    public Maia(String nome, int numFalantes) {
        super(nome, numFalantes, "América Central", "verbo-objeto-sujeito");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        if (this.getNome().equals("K'iche'")) {
            System.out.printf("Curiosidade: %s é uma língua ergativa.", getNome());
        }
    }

    @Override
    public void getFamiliaInfo() {
        super.getFamiliaInfo();

        System.out.println("As línguas maias são um grupo de línguas faladas pelos"
                + "povos maias. Os maias formam um enorme grupo de"
                + "aproximadamente 7 milhões de pessoas que descendem de uma"
                + "antiga civilização mesoamericana e se espalham pelos países"
                + "modernos de: México, Belize, Guatemala, Honduras e El"
                + "Salvador.");
    }

}
