
public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();

        formaManager.addForma("Vermelho", "0,0", 10);
        formaManager.addForma("Azul", "1,2", 20);
        formaManager.addForma("Rosa", "2,2", 15);
        formaManager.addForma("Amarelo", "3,4", 25);
        formaManager.addForma("Preto", "4,5", 10);

        formaManager.apresentar();
    }
}
