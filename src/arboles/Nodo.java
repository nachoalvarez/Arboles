package arboles;

public class Nodo<T> {
    
    private Nodo<T> ligaIzq;
    private Nodo<T> ligaDer;
    private T dato;
    
    Nodo(){
        this.ligaIzq = null;
        this.ligaDer = null;
        this.dato = null;
    }
    
    Nodo(T dato){
        this.dato = dato;
        this.ligaIzq = null;
        this.ligaDer = null;
    }

    public Nodo<T> getLigaIzq() {
        return ligaIzq;
    }

    public void setLigaIzq(Nodo<T> ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    public Nodo<T> getLigaDer() {
        return ligaDer;
    }

    public void setLigaDer(Nodo<T> ligaDer) {
        this.ligaDer = ligaDer;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
    
    
}
