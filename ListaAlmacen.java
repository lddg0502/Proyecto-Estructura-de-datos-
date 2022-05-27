package proyecto.final1;

public class ListaAlmacen {
    private Almacen almacen;
    private NodoAlmacen inicio;
    private int lenght;

    public ListaAlmacen() {
        this.inicio = null;
        this.almacen = null;
        this.lenght = 0;
    }

    public NodoAlmacen getInicio() {
        return inicio;
    }

    public void setInicio(NodoAlmacen inicio) {
        this.inicio = inicio;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    
    public void agregarInicio(Almacen almacen){
        NodoAlmacen nodo = new NodoAlmacen(almacen);
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
