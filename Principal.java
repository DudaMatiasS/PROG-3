import java.util.*;

class Principal {
  public static void main(String[] args) {
      ListaSE listaSe = new ListaSE();
      Celula c1 = new Celula(5);
      listaSe.inserirNoInicio(c1);
      c1 = new Celula(10);
      listaSe.inserirNoFinal(c1);
      c1 = new Celula(20);
      listaSe.inserirNoFinal(c1);
      c1 = new Celula(30);
      listaSe.inserirNoFinal(c1);
      c1 = new Celula(40);
      listaSe.inserirNoFinal(c1);

      // c1 = new Celula(0);
      // listaSe.inserirNoMeio(c1);
      c1 = new Celula(55);
      listaSe.inserirNoMeio(c1);
      // listaSe.inserirNoFinal(c1);
       

      // listaSe.removerValorEspecífico(30);
      listaSe.imprimirLista();
     
      
   }
}