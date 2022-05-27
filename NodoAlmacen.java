package proyecto.final1;

public class NodoAlmacen {
    private Almacen almacen;
    private NodoAlmacen siguiente;
    
    public NodoAlmacen(Almacen almacen){
        this.almacen = null;
        this.siguiente = null;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    
    public NodoAlmacen getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAlmacen siguiente) {
        this.siguiente = siguiente;
    }
}
