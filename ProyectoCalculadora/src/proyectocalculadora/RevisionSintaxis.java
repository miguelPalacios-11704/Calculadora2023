package proyectocalculadora;


import proyectocalculadora.ExceptionColeccionVacia;
import proyectocalculadora.PilaA;

/**
 * Clase que revisa la correcta sintaxis de la cadena la cual el usuario proporcionara
 * @author NicolasRobles.RodrigoMilan
 */
public class RevisionSintaxis {
    /**
     * Metodo que revisa el correcto balanceo de tanto parentesis, corchetes y llaves.
     * @param cadARevisar: String
     * @return boolean 
     */ 
    private static boolean revisaParentesisYCorchetes(String cadARevisar) {
        boolean resp = false, bandera = true;
        PilaA<Character> pilaAux = new PilaA();
        int i = 0;

        if (cadARevisar.length() > 0) {
            while (i < cadARevisar.length() && bandera) {
                switch (cadARevisar.charAt(i)) {
                    case '(':
                        pilaAux.push('(');
                        break;
                    case '{':
                        pilaAux.push('{');
                        break;
                    case '[':
                        pilaAux.push('[');
                        break;
                    case ')':
                        try {
                        if (pilaAux.pop() != '(') {
                            bandera = false;
                        }
                    } catch (ExceptionColeccionVacia err) {
                        bandera = false;
                    }
                    break;
                    case '}':
                        try {
                        if (pilaAux.pop() != '{') {
                            bandera = false;
                        }
                    } catch (ExceptionColeccionVacia err) {
                        bandera = false;
                    }
                    break;
                    case ']':
                        try {
                        if (pilaAux.pop() != '[') {
                            bandera = false;
                        }
                    } catch (ExceptionColeccionVacia err) {
                        bandera = false;
                    }
                    break;
                }
                i++;
            }

        }
        if (bandera) {
            resp = pilaAux.isEmpty();
        }
        return resp;
    }
    
    /**
     * Metodo booleano que determina si el char dado como parametro es un operando o no.
     * @param ch
     * @return boolean
     */

    private static boolean operando(char ch) {
        boolean res = false;

        switch (ch) {
            case '+':
                res = true;
                break;
            case '-':
                res = true;
                break;
            case '*':
                res = true;
                break;
            case '/':
                res = true;
                break;
            case '.':
                res = true;
                break;
            default:
                break;
        }
        return res;
    }
    
    /**
     * Metodo booleano que determina si el char dado como parametro es un parantesis, un corchete o una llave.
     * @param ch
     * @return boolean
     */

    private static boolean parentesis(char ch) {
        boolean res = false;

        switch (ch) {
            case '(':
                res = true;
                break;
            case ')':
                res = true;
                break;
            case '[':
                res = true;
                break;
            case ']':
                res = true;
                break;
            case '{':
                res = true;
                break;
            case '}':
                res = true;
                break;

            default:
                break;
        }
        return res;
    }
    
    /**
     * Metodo booleano que revisa si hay dos operandos seguidos.
     * @param cad
     * @return boolean
     */

    private static boolean revisaSignos(String cad) {
        boolean res = true;
        boolean bandera = true;

        int i = 0;
        if (cad.length() > 0) {
            while (cad.length() - 1 >= i && bandera) {

                if (operando(cad.charAt(i))) {
                    if (operando(cad.charAt(i + 1))) {
                        res = false;
                        bandera = false;
                    }
                }
                i++;
            }
        }
        return res;
    }
    
    /**
     * Metodo booleano que revisa que no haya una division con un cero de denominador.
     * @param cad: String - Cadena a revisar
     * @return boolean - verdadero/falso si no hay error/ si hay error
     */

    private static boolean revisarEntreCero(String cad) {
        boolean res = true;
        boolean bandera = true;
        int i = 0;

        if (cad.length() > 0) {
            while (cad.length() > i && bandera) {
                if (cad.charAt(i) == '/') {
                    if (cad.charAt(i + 1) == '0') {
                        res = false;
                        bandera = false;
                    }
                }
                i++;
            }
        }
        return res;
    }
    
    /**
     * Metodo booleano que revisa que todos los metodos anteriores regresen true, y por lo tanto la cadena es funcional.
     * @param cad: String - Cadena a revisar
     * @return boolean - verdadero/falso si no hay error/ si hay error
     */

    public static boolean revisaSintaxis(String cad) {
        boolean resp = true;
        boolean respP = revisaParentesisYCorchetes(cad);
        boolean resp0 = revisarEntreCero(cad);
        boolean respS = revisaSignos(cad);

        if (!respP || !respS || !resp0) {
            resp = false;
        }
        return resp;
    }

    public static void main(String[] args) {
        
        System.out.println(revisaSintaxis("2/0"));
        System.out.println(revisaSintaxis("-6+3"));
        System.out.println(revisaSintaxis("(2+2"));
        System.out.println(revisaSintaxis("(2++2"));
        System.out.println(revisaSintaxis("(2/2)"));
    }
}
