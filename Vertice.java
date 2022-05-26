package proyecto.final1;

public class Vertice {
    protected String nombre;
    protected int numVertice;
    
    public Vertice(String x){
        nombre = x;
        numVertice = -1;
    }
    
    public String nombreVertice(){
        return nombre;
    }
    
    public boolean equals(Vertice n){
        return nombre.equals(n.nombre);
    }
    
    public void asignarVertice(int n){
        numVertice = n;
    }
    
    @Override
    public String toString(){
        return nombre + " (" + numVertice + ")";
    }
}
