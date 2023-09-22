/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocalculadora;

import java.util.ArrayList;

/**
 * Clase que convierte la cadena dada por el usuario de infija a postfija
 * @author pedromerino
 */
public class EvaluadorPostFija {
    /**
     * Metodo que determina si el String dado como parametro es un operando o no.
     * @param String
     * @return boolean
     */
    private static boolean operando(String elemento){
        boolean res = false;
        
        if (elemento.length() == 1) {
            
            switch(elemento.charAt(0)){
            case '+':
                res=true;
                break;
            case '-':
                res=true;
                break;
            case '*':
                res=true;
                break;
            case '/':
                res=true;
                break;
            case '^':
                res=true;
                break;
            default:
                break;
            }
        }
        return res;
        
    }
    
    /**
     * Metodo que evalua y convierte la expresion dada de infija a postfija. Recibe la lista formada previamente.
     * @return double
     * @param expresion - ArrayList()
     */
    public static double evaluadorPostFija(ArrayList<String> expresion) {
        PilaADT pila = new PilaA();
        String stringAux;
        double elemento, a, b, res, resFinal;
        char operando;
        
        for (int i=0; i<expresion.size(); i++) {
            stringAux = expresion.get(i);
            if (!operando(stringAux)) {   
                elemento = Double.parseDouble(stringAux);
                pila.push(elemento);
            }
            else {
                operando = stringAux.charAt(0);
                switch(operando) {
                    case '+': 
                        b = (double)pila.pop();
                        a = (double)pila.pop();
                        res = a + b;
                        pila.push(res);
                        break;
                    case '-': 
                        b = (double)pila.pop();
                        a = (double)pila.pop();
                        res = a - b;
                        pila.push(res);
                        break;
                    case '*':
                        b = (double)pila.pop();
                        a = (double)pila.pop();
                        res = a * b;
                        pila.push(res);
                        break;
                    case '/':
                        b = (double)pila.pop();
                        a = (double)pila.pop();
                        res = a / b;
                        pila.push(res);
                        break;
                    case '^':
                        b = (double)pila.pop();
                        a = (double)pila.pop();
                        res = Math.pow(a, b);
                        pila.push(res);
                        break;
                        }
                    }           
            }
        
        resFinal = (double) pila.pop();
        
        return resFinal;
    }  

    public static void main(String[] args) {
        ArrayList<String> pruebaSum = new ArrayList<String>();
        pruebaSum.add("3");
        pruebaSum.add("2");
        pruebaSum.add("+");
        
        System.out.println(evaluadorPostFija(pruebaSum));
        
        ArrayList<String> pruebaRes = new ArrayList<String>();
        pruebaRes.add("3");
        pruebaRes.add("2");
        pruebaRes.add("-");
        
        System.out.println(evaluadorPostFija(pruebaRes));
        
        ArrayList<String> pruebaMult = new ArrayList<String>();
        pruebaMult.add("3");
        pruebaMult.add("2");
        pruebaMult.add("*");
        
        System.out.println(evaluadorPostFija(pruebaMult));
        
        ArrayList<String> pruebaDiv = new ArrayList<String>();
        pruebaDiv.add("3");
        pruebaDiv.add("2");
        pruebaDiv.add("/");
        
        System.out.println(evaluadorPostFija(pruebaDiv)); 
       
        ArrayList<String> pruebaPow = new ArrayList<String>();
        pruebaPow.add("4");
        pruebaPow.add("2");
        pruebaPow.add("^");
        
        System.out.println(evaluadorPostFija(pruebaPow));
       
       
       ArrayList<String> pruebaSumYRes = new ArrayList<String>();
        pruebaSumYRes.add("3");
        pruebaSumYRes.add("2");
        pruebaSumYRes.add("+");
        pruebaSumYRes.add("1");
        pruebaSumYRes.add("-");

        System.out.println(evaluadorPostFija(pruebaSumYRes));
        
       ArrayList<String> prueba = new ArrayList<String>();
           prueba.add("21");
           prueba.add("2");
           prueba.add("3");
           prueba.add("*");
           prueba.add("4");
           prueba.add("/");
           prueba.add("+");
           prueba.add("5");
           prueba.add("6");
           prueba.add("75");
           prueba.add("/");
           prueba.add("^");
           prueba.add("-");
           prueba.add("82");
           prueba.add("+");

           System.out.println(evaluadorPostFija(prueba));
           
           
    } 
}