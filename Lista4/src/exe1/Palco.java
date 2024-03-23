package exe1;

public class Palco {
    private Ator ator = new AtorFeliz();
    public void altera() {
        ator = new AtorTriste();
    }
    public void atuar() {
        ator.ato();
    }

}
