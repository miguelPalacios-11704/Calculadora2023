/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocalculadora;

import java.util.ArrayList;

/**
 * Clase que pasa una cadena recibida en infija y la convierte a postfija  
 * @author pedromerino
 */

public class Convertidor {
	
    private String cadenaAConvertir;
    private PilaA<Character> operadores;

    /**
     * Recibe una cadena y asi la clase es capaz de construir un convertidor que pase la cadena a postfija. 
     * Crea tambien una pila donde guardara los operadores de la cadena.
     * @param cadena 
     */
    
    public Convertidor(String cadena) {
        cadenaAConvertir = cadena;
        operadores = new PilaA();
    }
         
    /**
     * Metodo que ordena la cadena recibida en infija y la pasa a postfija. 
     * @return ArrayList() - Regresa una lista ordenada, 
     * con cada elemento de la cadena recibida en donde corresponde (segun se paso a postfija)
     */
    
    public ArrayList <String> convertirInfijaPostfija() {
        ArrayList<String> postfija = new ArrayList();
        PilaA <Character> pila = new PilaA<>();
        StringBuilder numero = new StringBuilder();
        Character punto = '.';
        
        for (int i = 0; i < cadenaAConvertir.length(); i++) {
            Character c = cadenaAConvertir.charAt(i);
            
            if (!Character.isDigit(c) && !c.equals(punto)) //Parentesis de apertura, se agrega a la pila
                if (c == '(') {
                    pila.push(c);
                }
                else 
                    if (c == ')') { //Parentesis de cierre, se sacan los operadores de la pila y se agrega al ArrayList hasta encontrar el parentesis de apertura correspondiente
                        while (!pila.isEmpty() && pila.peek() != '(') {
                            postfija.add(pila.pop().toString());
                        }
                        if (!pila.isEmpty() && pila.peek() == '(') {
                            pila.pop();  // saca el parentesis de apertura de la pila
                        }
                    }
                    else { //Operador, se sacan los operadores de la pila y se anaden a la salida mientras tengan mayor o igual precedencia que el operador actual
                        if((i==0 && c.equals(((Character)'-'))) || (i>0 && ((Character)cadenaAConvertir.charAt(i-1)).equals('*') && c.equals((Character)'-'))
                                || (i>0 && ((Character)cadenaAConvertir.charAt(i-1)).equals('/') && c.equals((Character)'-'))
                                || (i>0 && ((Character)cadenaAConvertir.charAt(i-1)).equals('+') && c.equals((Character)'-'))
                                || (i>0 && ((Character)cadenaAConvertir.charAt(i-1)).equals('(') && c.equals((Character)'-'))
                                || (i>0 && ((Character)cadenaAConvertir.charAt(i-1)).equals('^') && c.equals((Character)'-'))
                                || (i>0 && ((Character)cadenaAConvertir.charAt(i-1)).equals('-') && c.equals((Character)'-'))){//si es un signo negativo y no una resta
                            numero.append(c.toString());
                        }
                        else{
                            while (!pila.isEmpty() && jerarquia(pila.peek()) >= jerarquia(c))
                                postfija.add(pila.pop().toString());
                        pila.push(c);  // anade el operador actual a la pila
                        }
                        
                    }   
            else {//Operando, se agrega al ArrayList
                if(i < cadenaAConvertir.length()-1 && (Character.isDigit(((Character)cadenaAConvertir.charAt(i+1))) || ((Character)cadenaAConvertir.charAt(i+1)).equals(punto)) ){//Si el numero tiene mas de un digito
                    numero.append(c.toString());
                }
                else{
                    numero.append(c.toString());
                    postfija.add(numero.toString());
                    numero.delete(0, numero.length());
                }
                    
                
            }   
        }
        
        //Retira los operadores que faltan de la pila y los agrega 
        while (!pila.isEmpty()) {
            postfija.add(pila.pop().toString());
        }
        
        return postfija;
    }
    
    /**
     * Metodo que le da jerarquia a los operadores, segun las reglas aritmeticas.
     * @param operador: char - Recibe al operador del que se quiere dar jerarquia
     * @return int - Regresa un entero que indica el "nivel" de jerarquia del operador recibido.
     */
    
    private static int jerarquia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    
    public static void main(String[] args) {
        Convertidor prueba1 = new Convertidor("-2.1+2*3/4-5^(6/75)+82");
        System.out.println(prueba1.convertirInfijaPostfija());
    }
	 
}
