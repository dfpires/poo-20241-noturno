//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno obj = new Aluno();
        obj.setCodigo(10);
        obj.setCodigo(-10);
        obj.setNota(5);
        obj.setNota(15);
        obj.setNome("Fulano");

        System.out.println("Código " + obj.getCodigo() +
                " Nota " + obj.getNota());

        Aluno obj2 = new Aluno(-10, 40, "Beltrano");


    }
}