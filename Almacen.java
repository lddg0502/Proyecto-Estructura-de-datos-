package proyecto.final1;

public class Almacen {
    private String name;
    private String productos;
    private int cantProductos;

    public Almacen(String name, String productos, int cantProductos) {
        this.name = name;
        this.productos = productos;
        this.cantProductos = cantProductos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }
    
    
}
