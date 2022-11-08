public class Main {
    public static void main(String[] args) {
        Romanica espanhol = new Romanica("Test", 122, "América do Sul", "sujeito-verbo-objeto");
        Maia kiche = new Maia("K'iche'", 222);
        SinoTibetana mandarim = new SinoTibetana("Mandarim", 920000000);
        SinoTibetana birmanes = new SinoTibetana("Birmanês", 33000000);

        espanhol.getInfo();
        kiche.getInfo();
        mandarim.getInfo();
        birmanes.getInfo();

        espanhol.getFamiliaInfo();
        kiche.getFamiliaInfo();
        mandarim.getFamiliaInfo();
    }

}
