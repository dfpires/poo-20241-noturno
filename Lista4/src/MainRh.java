import rh.Assistente;
import rh.Diretor;
import rh.Funcionario;
import rh.Gerente;

import java.util.ArrayList;
import java.util.List;

public class MainRh {
    public static void exibeDados(Funcionario obj){
        System.out.println(obj.toString());
        System.out.println("Salário final " + obj.calculaSalario());
    }
    public static void main(String args[]){
        Assistente as1 =
     new Assistente("Pedro", "Franca", "123", 3000, 8);
        exibeDados(as1);

        Gerente ge1 =
     new Gerente("Paulo", "Franca", "456", 5000, 2000);
       exibeDados(ge1);

        Diretor di1 =
     new Diretor("Sofia", "Franca", "789", 8000, 500);
        exibeDados(di1);

    List<Funcionario> funcs = new ArrayList<Funcionario>();

    funcs.add(as1);
    funcs.add(ge1);
    funcs.add(di1);

    for(Funcionario obj: funcs){
        exibeDados(obj);
    }

    // Funcionario teste = new Funcionario();
    }
}
