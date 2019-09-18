/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;

/**
 *
 * @author Desenvolvimento
 */
public class Mock {

   private static ArrayList<Produto> lista;

   public static void makeMock(){

      if(lista==null){
         lista = Produto.getLista();

         Produto caneta = new Produto();
         caneta.setDescricao("caneta bic");
         caneta.setPreco(1.5f);
         caneta.setOferta(true);
         lista.add(caneta);

         Produto caderno = new Produto();
         caderno.setDescricao("caderno");
         caderno.setPreco(20.0f);
         caderno.setOferta(true);
         lista.add(caderno);

         Produto caneca = new Produto();
         caneca.setDescricao("caneca massa");
         caneta.setPreco(3.0f);
         caneta.setOferta(false);
         lista.add(caneca);

         Produto lapis = new Produto();
         lapis.setDescricao("lapis de anime");
         lapis.setPreco(1.5f);
         lapis.setOferta(true);
         lista.add(lapis);

         Produto borracha = new Produto();
         borracha.setDescricao("borracha");
         borracha.setPreco(1.5f);
         borracha.setOferta(false);
         lista.add(borracha);



      }


}

}
