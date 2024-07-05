import java.util.*;
public class ListaSE{
  
   Celula primeiro;
   
   public ListaSE(){
      primeiro= null;
      
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
   public void inserirNoMeio(Celula c){
      if(verificarListaVazia()){
         inserirNoInicio(c);
      }else{
         Celula aux = primeiro;
         if(aux.prox==null){
            System.out.println("inserir no final");
            inserirNoFinal(c);
         }else{
            if(primeiro.valor>c.valor){
               inserirNoInicio(c);
            }else{
            Celula aux2=primeiro.prox;
           while(c.valor>aux.valor&&c.valor>aux2.valor&&aux2.prox!=null){
            aux=aux.prox;
            aux2=aux2.prox;
                     }


          
           System.out.println(aux.valor+" "+aux2.valor);
           aux.prox=c;
           c.prox=aux2;
          
         }

         }
      }

   }
   public boolean verificarListaVazia(){
      return(primeiro==null);
   }
   public Celula pesquisar(int v){
      if(verificarListaVazia()){
         return null;
      }else{
         Celula aux = primeiro;
         while(aux!=null&&aux.valor!=v){
            aux=aux.prox;

         }
         return aux;
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
   public void removerValorEspecífico(int v){
      if(verificarListaVazia()){
         return;
      }else{
         Celula aux = primeiro;
         if(aux.prox==null && aux.valor==v){
            removerInicio();
         }else{
            if(v==primeiro.valor){
               removerInicio();
            }else{
             Celula anterior =primeiro;
            while(aux.valor!=v){   
               anterior = aux;
               aux=aux.prox;
            }
            anterior.prox=aux.prox;
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