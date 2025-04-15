import java.util.Scanner;

public class PasswordGenerator {


    public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Inserisci il tuo nome");
        String nome = scanner.nextLine();
        nome = Character.toUpperCase(nome.charAt(0)) + nome.substring(1).toLowerCase();

        System.out.println("Inserisci il tuo cognome");
        String cognome = scanner.nextLine();
        cognome = Character.toUpperCase(cognome.charAt(0)) + cognome.substring(1).toLowerCase();

        System.out.println("Inserisci il tuo colore preferito");
        String colorePreferito = scanner.nextLine();

        System.out.println("Inserisci il tuo giorno di nascita");
        String giorno = scanner.nextLine();
        
        System.out.println("Inserisci il tuo mese di nascita");
        String mese = scanner.nextLine();
    
        System.out.println("Inserisci il tuo anno di nascita");
        String anno = scanner.nextLine();
    
        int sommaNascita = Integer.parseInt(giorno) + Integer.parseInt(mese) + Integer.parseInt(anno);

        String risultato = String.format("%s-%s-%s-%d", nome, cognome, colorePreferito, sommaNascita);

        System.out.println("La tua nuova password è: ");
        System.out.println(risultato);
        
        scanner.close();
    }
        
        }


    

