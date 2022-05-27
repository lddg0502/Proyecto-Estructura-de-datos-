package proyecto.final1;

public class NodoProducto {
    private Productos productos;
    private NodoProducto siguiente;

    public NodoProducto(Productos productos) {
        this.productos = productos;
        this.siguiente = null;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public NodoProducto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProducto siguiente) {
        this.siguiente = siguiente;
    }
    
}
