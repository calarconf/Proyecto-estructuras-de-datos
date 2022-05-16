package EstructurasDeDatos;

public class Nodo {
    Object valor;
    Nodo siguiente;

    public Nodo(Object valor){
        this.valor=valor;
    }
    public void next(Nodo n){
        siguiente=n;
    }
    public Nodo ObtenerSiguiente()
    {
        return siguiente;
    }
    public Object ObtenerValor(){
        return valor;
    }
}
