public abstract class Lingua {
    private String nome;
    private int numFalantes;
    private String regiao;
    private String ordemPalavras;

    public Lingua(String nome, int numFalantes, String regiao, String ordemPalavras) {
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regiao = regiao;
        this.ordemPalavras = ordemPalavras;
    }

    public void getInfo() {
        System.out.printf(
                "%s é falada por %d pessoas que estão, majoritariamente, localizadas em: %s. A língua segue a ordem: %s.",
                this.nome, this.numFalantes, this.regiao, this.ordemPalavras);
    }

    public void getFamiliaInfo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumFalantes() {
        return numFalantes;
    }

    public void setNumFalantes(int numFalantes) {
        this.numFalantes = numFalantes;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getOrdemPalavras() {
        return ordemPalavras;
    }

    public void setOrdemPalavras(String ordemPalavras) {
        this.ordemPalavras = ordemPalavras;
    }
}
