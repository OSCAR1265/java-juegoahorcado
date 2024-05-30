import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        // Palabra Secreta

        String palabrasecreta = "inteligencia";
        
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraadivinada = false;

        char [] letrasadivinadas = new char [palabrasecreta.length()];
        int i = 0;
        System.out.println(letrasadivinadas);

        // Bucle de Control 
        for(i = 0; i < palabrasecreta.length(); i++) {
            letrasadivinadas[i] = '_';
        }

        // Bucle de Control
        while (!palabraadivinada && intentos < intentosMaximos)   {
            
            System.out.println("Palabra a Adivinar: " + String.valueOf(letrasadivinadas) + "( " +palabrasecreta.length()+ " palabras)");

            System.out.println("Introduce una letra por favor" );
            
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int k = 0; k < palabrasecreta.length(); k++ ){

                if (palabrasecreta.charAt(k)== letra){
                    letrasadivinadas[k] = letra;
                    letraCorrecta = true;
                }

            }

            if (!letraCorrecta ){
                intentos++;
                System.out.println("! Incorrecta ! te quedan " + (intentosMaximos - intentos) + " intentos");
            }

            if(String.valueOf(letrasadivinadas).equals(palabrasecreta)){
                palabraadivinada = true;
                System.out.println("Felicidades ha adivinida la palabra secreta " + palabrasecreta);
            }


        }

        if (!palabraadivinada){

            System.out.println("! Que pena te has quedado sin intentos ! GAME OVER" );
        }

        scanner.close();

    }
}
