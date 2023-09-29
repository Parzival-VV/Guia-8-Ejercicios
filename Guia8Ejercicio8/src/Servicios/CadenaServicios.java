
package Servicios;
import java.util.Scanner;
import Entidades.Cadena;
/**
 *
 * @author Rafael
 */
public class CadenaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Cadena C1 = new Cadena();
    
//    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
    public void mostrarVocales(Cadena C1){
        int vocales = 0;
        
        for (int i = 0; i < C1.getLength(); i++) {
            switch(C1.getFrase().charAt(i)){
                case 'A':
                case 'a':
                    vocales ++;
                    break;
                case 'E':
                case 'e':
                    vocales ++;
                    break;
                case 'I':
                case 'i':
                    vocales ++;
                    break;
                case 'O':
                case 'o':
                    vocales ++;
                    break;
                case 'U':
                case 'u':
                    vocales ++;
                default:
                    break;
            }
            
        }
        System.out.println("\n" + "La cantidad de vocales incluidas en su frase o palabra son: " + vocales);
    }
    
//    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
        public void invertirFrase(Cadena C1) {
        String fraseAlReves = "";
        String fraseOriginal = C1.getFrase();

        for (int i = C1.getLength() - 1; i >= 0; i--) {
            char letra = fraseOriginal.charAt(i);
            fraseAlReves += letra;
        }
        System.out.println("\n" + fraseAlReves + "\n");
    }
    
//        c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
        public void vecesRepetido(Cadena C1){
            
            String caracter;
            int cont = 0;
            
            System.out.println("\n" + "Ingrese un caracter a buscar en la frase: ");
            caracter = leer.next();
            String frase = C1.getFrase();
            
            char charFrase[] = frase.toCharArray();
            
            for (int i = 0; i < C1.getLength(); i++) {
                if(charFrase[i] == caracter.charAt(0) ){
                    cont ++;
                }
            }
            System.out.println("\n" + "El caracter " + caracter + " se repite: " + cont + " veces." + "\n");
        }
        
//        e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
        public void compararLongitud(Cadena C1){
            String frase = C1.getFrase();
            
            System.out.println("\n" + "Ingrese una frase a comparar: ");
            String nuevaFrase = leer.next();
            
        if(nuevaFrase.compareTo(frase) == 0) {
                System.out.println("\n" + "Las frases tienen la misma longitud. " + nuevaFrase.compareTo(frase)+ "\n");
        }else if(nuevaFrase.compareTo(frase) > 0){
                System.out.println("\n" + "La frase original tiene mayor longitud que la ultima ingresada. " + nuevaFrase.compareTo(frase)+ "\n");
        }else{
                System.out.println("\n" + "La longitud de la segunda frase ingresada es mayor que la original " + nuevaFrase.compareTo(frase) + "\n");
              
        }   
        }
//        f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
        public void unirFrase(Cadena C1){
           
            System.out.println("\n" + "Ingrese una nueva frase: ");
            String nuevaFrase = leer.next();
            System.out.println("\n" + C1.getFrase().concat(nuevaFrase) + "\n");
        }
//       g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante. 
        public void remplazar(Cadena C1){
            
            System.out.println("\n" + "Ingrese un caracter que remplace las letras a de la frase original: ");
            String caracter = leer.next();
            
            System.out.println("Su frase codificada: " + "\n"
                    + C1.getFrase().replace("a", caracter) + "\n");
        }
        
        //h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
        public boolean contiene(Cadena C1, String letra){
            boolean match = false;
    
            if(C1.getFrase().contains(letra)){
                match = true;
            }
            return match;
        }
}
//contains(CharSequence s) Retorna true si la cadena contiene la
//secuencia tipo char del parámetro.