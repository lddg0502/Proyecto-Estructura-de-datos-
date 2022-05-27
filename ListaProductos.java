package proyecto.final1;

public class ListaProductos {
    private Productos productos;
    private NodoProducto inicio;
    private int lenght;

    public ListaProductos(Productos productos, NodoProducto inicio, int lenght) {
        this.productos = null;
        this.inicio = null;
        this.lenght = 0;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public NodoProducto getInicio() {
        return inicio;
    }

    public void setInicio(NodoProducto inicio) {
        this.inicio = inicio;
    }
    
    public void agregarProductos(Productos productos){
        NodoProducto nodo = new NodoProducto(productos);
        if (estaVacio()){
            this.inicio = nodo;
        } else{
            nodo.setSiguiente(this.inicio);
            this.inicio = nodo;
        }
        this.lenght++;
    }
    
    public boolean estaVacio(){
        return this.inicio == null;
    }
}
