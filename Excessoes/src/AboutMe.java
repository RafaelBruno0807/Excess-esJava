import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        try{
        Scanner meuScanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome =  meuScanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobreNome = meuScanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = meuScanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = meuScanner.nextDouble();

        //Mostrar dados
        System.out.println("Olá, meu nome é ".concat(nome).concat(" ").concat(sobreNome));
        System.out.println("Tenho " + idade);
        System.out.println("Minha altura e " + altura);
        
        meuScanner.close();
        } 
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura são numéricos");
        }
    }
}
