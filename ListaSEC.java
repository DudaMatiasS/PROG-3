import java.util.*;
public class ListaSEC {
    Celula cabeca;
    public ListaSEC(){
        cabeca=new Celula(-1);
        cabeca.prox=cabeca;
    }
    public boolean verificarListaVazia(){
        return (cabeca.prox== cabeca);
    }
    public void inserirNoInicio(Celula c){
        Celula aux = cabeca.prox;
        cabeca.prox = c;
        c.prox = aux;
    }
    public void inserirAoFinal(Celula c){
        if(verificarListaVazia()){ cabeca.prox = c; c.prox = cabeca; }
        else{
            Celula aux = cabeca.prox;
            while(aux.prox != cabeca) { aux = aux.prox; }
            aux.prox = c;
            c.prox = cabeca;
        }
    }
    public void inserirOrdenadamente(Celula c){
        if(verificarListaVazia()){
            inserirNoInicio(c);
        }else{
            Celula aux= cabeca.prox;
            if(c.valor<aux.valor){
                inserirNoInicio(c);
            }else{
                if(aux.prox==cabeca){
                    inserirAoFinal(c);
                }else{
                    Celula aux2=aux.prox;
                    while (c.valor > aux.valor && c.valor > aux2.valor && aux2.prox != cabeca) {
                        aux = aux.prox;
                        aux2 = aux2.prox;
                    }
                    if(c.valor>aux2.valor){
                        aux2.prox=c;
                        c.prox=cabeca;
                    }else{
                        aux.prox=c;
                        c.prox=aux2;
                    }
                }
            }

        }
    }
    public Celula pesquisar(int v){
        if(verificarListaVazia()) return null;
        else{
            Celula aux = cabeca.prox;
            while(aux != cabeca && aux.valor != v)
            {
                aux = aux.prox;
            }
            if(aux == cabeca) return null;
            return aux;
        }
    }
    public boolean removerInicio(){
        if(verificarListaVazia()){ return false; }
        else{
            Celula aux = cabeca.prox;
            cabeca.prox = aux.prox;
            aux.prox = null;
            return true;
        }
    }
    public boolean removerFinal() {
        if (verificarListaVazia()) {
            return false;
        } else {
            Celula aux = cabeca.prox;
            if (aux.prox != cabeca) {
                while ((aux.prox).prox != cabeca) {
                    aux = aux.prox;
                }
                Celula aux2 = aux.prox;
                aux.prox = cabeca;
                aux2.prox = null;
            }
            else {
                cabeca.prox = cabeca;
                aux.prox = null;

            }
            return true;
        }
    }
    public void removerValorEspecifico(int v){
        if(!verificarListaVazia()){
            if(v!=cabeca.valor){
                Celula aux = cabeca.prox;
                if( aux.valor==v){
                    removerInicio();
                }else{
                   
                        Celula anterior=cabeca.prox;
                        while (aux.valor!=v&&aux.prox!=cabeca) {
                            anterior=aux;
                            aux=aux.prox;
                        }
                        if(aux.valor==v){
                            anterior.prox=aux.prox;
                            aux.prox=null;
                        }
                    
                }
            }
        }
    }
    public void imprimirLista()
    {
        Celula aux = cabeca.prox;
        while(aux != cabeca)
        {
            System.out.println("Valor = " + aux.valor);
            aux = aux.prox;
        }
    }
}
