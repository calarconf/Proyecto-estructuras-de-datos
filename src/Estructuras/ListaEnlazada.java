package EstructurasDeDatos;

public class ListaEnlazada {
    Nodo cabeza;
    int size = 0;
    Nodo cola;

    public ListaEnlazada() {
        cabeza = null;
        cola=null;
    }

    public void EliminarPrimerol(){
        cabeza=cabeza.ObtenerSiguiente();
        size--;
    }
    public void Eliminar(int index){
        if(index==0){
            cabeza=cabeza.ObtenerSiguiente();
        }else{
            int contador=0;
            Nodo temporal=cabeza;
            while (contador<index-1){
                temporal=temporal.siguiente.ObtenerSiguiente();
                contador++;
            }
            temporal.next(
                    temporal.ObtenerSiguiente().ObtenerSiguiente());
        }
        size--;
    }
    public boolean EstaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }

    }

    public void addPrimero(Object obj) {
        if (cabeza == null) {
            cabeza = new Nodo(obj);
        } else {
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.next(temp);
            cabeza = nuevo;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public Object obtener(int index) {
        int contador=0;
        Nodo temporal=cabeza;
        while(contador<index){
            temporal=temporal.ObtenerSiguiente();
            contador++;
        }
        return temporal.ObtenerValor();
    }

    public void RemoveLast(){

    }
}
