import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("Inserisci il tuo nome");
        String nome = input.nextLine();

        System.out.println("Inserisci il tuo cognome");
        String cognome = input.nextLine();

        System.out.println("Inserisci il tuo colore preferito");
        String colorePreferito = input.nextLine();

        System.out.println("Inserisci il tuo giorno di nascita in cifre");
        String giornoInserito = input.nextLine();
        int giornoDiNascita = Integer.parseInt(giornoInserito);

        System.out.println("Inserisci il tuo mese di nascita in cifre");
        String meseInserito = input.nextLine();
        int meseDiNascita = Integer.parseInt(meseInserito);

        System.out.println("Inserisci il tuo anno di nascita in cifre");
        String annoInserito = input.nextLine();
        int annoDiNascita = Integer.parseInt(annoInserito);

        System.out.println("La tua nuova password è: " + nome + "-" + cognome + "-"  + colorePreferito + "-" + (giornoDiNascita + meseDiNascita + annoDiNascita));

        input.close();
    }
}
