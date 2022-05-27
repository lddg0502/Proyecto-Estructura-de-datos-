package proyecto.final1;

public class Grafo {
    protected int numVertices;
    protected Vertice [] verts;
    protected int [][] matAd;
    protected int peso;
    
    public Grafo(int max){
        matAd = new int[max][max];
        verts = new Vertice[max];
        for (int i = 0; i < max; i++){
            for (int j = 0; i < max; i++){
                matAd[i][j] = 0;
                numVertices = 0;
            }      
        }           
    }

    public void agregarVertice(String nombre){
        
    }
}
