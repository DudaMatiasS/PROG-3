import java.util.*;
public class ListaSE{
    
    Celula primeiro;
    
    public ListaSE(){
        primeiro= null;
        
    }
    public boolean verificarListaVazia(){
        return(primeiro==null);
    }
    public void inserirNoInicio(Celula c){
        c.prox=primeiro;
        primeiro=c;

    }
    public void inserirNoFinal(Celula c){
        if(verificarListaVazia()){
            primeiro=c;
        }else{
            Celula aux = primeiro;
            while(aux.prox!=null){
                aux = aux.prox;
            }
            aux.prox=c;
        }
    }

    public void inserirOrdenadamente(Celula c){
        if(verificarListaVazia()){
            inserirNoInicio(c);
        }else{
            Celula aux = primeiro;
            if(c.valor<aux.valor){
                inserirNoInicio(c);
            }else {
                if (aux.prox == null) {
                    inserirNoFinal(c);
                } else {
                    Celula aux2 = aux.prox;
                    while (c.valor > aux.valor && c.valor > aux2.valor && aux2.prox != null) {
                        aux = aux.prox;
                        aux2 = aux2.prox;
                    }
                    if(c.valor>aux2.valor){
                        aux2.prox=c;
                    }else{
                        aux.prox = c;
                        c.prox = aux2;
                    }
                }
            }
        }
    }
    public Celula pesquisar(int v){
        if(verificarListaVazia()){
            return null;
        }else{
            Celula aux = primeiro;
            while(aux!=null&&aux.valor!=v){
                aux=aux.prox;

            }
            if(aux.valor==v) {
                return aux;
            }else{
                return null;
            }
        }
    }
    public boolean removerInicio(){
        if(verificarListaVazia()){
            return false;
        }else{
            Celula aux = primeiro;
            if(aux.prox==null){
                primeiro=null;
            }else{
                primeiro=aux.prox;
                aux.prox=null;
            }
            return true;
        }
    }
    public boolean removerFinal(){
        if(verificarListaVazia()){
            return false;
        }else{
            Celula aux = primeiro;
            if(aux.prox==null){
                primeiro=null;
            }else{
                while((aux.prox).prox!=null){
                    aux=aux.prox;
                }
                aux.prox=null;
            }
            return true;
        }
    }
    public void removerValorEspecifico(int v){
        if(!verificarListaVazia()){
            Celula aux = primeiro;
            if(aux.valor==v){
                removerInicio();
            }else{
               
                    Celula anterior =primeiro;
                    while(aux.valor!=v && aux.prox!=null){
                        anterior = aux;
                        aux=aux.prox;
                    }
                    if(aux.valor==v){
                        anterior.prox=aux.prox;
                        aux.prox=null;
                    }
           
            }
        }
    }
    public void imprimirLista(){
        Celula aux = primeiro;
        while(aux!=null){
            System.out.println("Valor = "+aux.valor);
            aux=aux.prox;
        }
    }
}