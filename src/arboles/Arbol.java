package arboles;

public class Arbol<T> {
    
    private Nodo<T> raiz;
    
    Arbol(){
        this.raiz = null;
    }
    
    Arbol(T raiz){
        this.raiz = new Nodo<>(raiz);
    }
    
    public void add(T dato){
        Nodo q = new Nodo<>(dato);
        if (q.getDato().equals(raiz.getDato())){
            
        }
    }
    
    private void addRight(T dato){
        Nodo t = raiz;
        Nodo q = new Nodo<>(dato);
        t.setLigaIzq(q);
    }
    
    private void addLeft(T dato){
        Nodo t = raiz;
        Nodo q = new Nodo<>(dato);
        t.setLigaDer(q);
    }
    
}
