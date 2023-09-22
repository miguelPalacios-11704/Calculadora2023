/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocalculadora;

/**
 *
 * @author pedromerino
 */
public class PilaA <T> implements PilaADT<T> {
    private int tope;
    private T[] datos;
    private final int MAX= 20;
    
    public PilaA(){
        datos = (T[]) new Object[MAX];
        tope = -1; //me indica que no hay nada en el arreglo por eso no pongo 0
    }
    public PilaA(int max){
        datos = (T[]) new Object[max];
        tope = -1; //me indica que no hay nada en el arreglo por eso no pongo 0
    }
    //Get
    public int getTope(){
        return tope;
    }
    //Push
    @Override
    public void push(T datoNuevo) {
        if(tope == datos.length -1)//No hay espacio en la pila
            expande();
        tope++;
        datos[tope] = datoNuevo;
    }
    private void expande(){
        T[] masGrande = (T[]) new Object[datos.length * 2];
        
        for(int i = 0; i <= tope; i++)
            masGrande[i] = datos[i];
        datos = masGrande; //aqui le cambiamos la direccion a datos
    }
    //Pop
    @Override
    public T pop() {
        if(this.isEmpty())
            throw new ExceptionColeccionVacia("Error: la pila está vacía");
        
        T resultado = datos[tope];
        datos[tope] = null;
        tope--;
        
        return resultado;
    }
    //isEmpty
    @Override
    public boolean isEmpty() {
        return tope == -1; //si esta vacia regresa true, else false
    }
    //Peek
    @Override
    public T peek() {
        if(this.isEmpty())
            throw new ExceptionColeccionVacia("Error: la pila está vacía");
        return datos[tope];
    }
    //MultiPop - Ejercicio 21-B CE
    public void multiPop(int n){
        if(tope >= n - 1){
            int i;
            for(i = tope; i > tope - n; i--)
                datos[i] = null;
            tope = i;
        }
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();
        int i;
        for(i = tope; i >= 0 ; i--){
            sB.append(datos[i]);
            sB.append("\n");
        }
        return sB.toString();
    }
}
