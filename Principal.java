import java.util.*;

class Principal {
    public static void main(String[] args) {
    //    ListaSE listaSe = new ListaSE();
    //    Celula c1 = new Celula(5);
    //    listaSe.inserirNoInicio(c1);
    //    c1 = new Celula(10);
    //    listaSe.inserirNoFinal(c1);
//        c1 = new Celula(20);
//        listaSe.inserirNoFinal(c1);
//        c1 = new Celula(30);
//        listaSe.inserirNoFinal(c1);
//        c1 = new Celula(40);
//        listaSe.inserirNoFinal(c1);
//        c1 = new Celula(75);
//        listaSe.inserirOrdenadamente(c1);
//        c1 = new Celula(0);
//        listaSe.inserirOrdenadamente(c1);
//        c1 = new Celula(2);
//        listaSe.inserirOrdenadamente(c1);
//        c1 = new Celula(60);
//        listaSe.inserirOrdenadamente(c1);
//        c1 = new Celula(55);
//        listaSe.inserirOrdenadamente(c1);
//        c1 = new Celula(25);
//        listaSe.inserirOrdenadamente(c1);
//
// //
//        listaSe.removerValorEspecifico(5);
//        listaSe.imprimirLista();

        ListaSEC listaSec = new ListaSEC();

        Celula n = new Celula(5);
        listaSec.inserirNoInicio(n);
        n = new Celula(10);
        listaSec.inserirAoFinal(n);
        n = new Celula(20);
        listaSec.inserirAoFinal(n);

        n = new Celula(120);
        listaSec.inserirAoFinal(n);
        n = new Celula(75);
        listaSec.inserirOrdenadamente(n);
        n = new Celula(2);
        listaSec.inserirOrdenadamente(n);
        n = new Celula(60);
        listaSec.inserirOrdenadamente(n);
        n = new Celula(55);
        listaSec.inserirOrdenadamente(n);
        n = new Celula(25);
        listaSec.inserirOrdenadamente(n);
        n = new Celula(0);
        listaSec.inserirOrdenadamente(n);

        listaSec.removerValorEspecifico(0);
        listaSec.imprimirLista();


    }
}