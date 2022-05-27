package proyecto.final1;

public class Almacen {
    private String name;
    private ListaProductos productos;

    public Almacen(String name, ListaProductos productos) {
        this.name = name;
        this.productos = productos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListaProductos getProductos() {
        return productos;
    }

    public void setProductos(ListaProductos productos) {
        this.productos = productos;
    }
  
}
