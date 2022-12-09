/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

import java.util.Map;


/**
 *
 * @author simao
 */
public class Teste {
    public static void main(String[] args) throws Exception{
	ListaUtilizadores lista = new ListaUtilizadores();
	Produtor p1 = new Produtor("simao", "1234", "simao");
	Produtor p2 = new Produtor("simao1", "1234", "simao1");
	Administrador adm = new Administrador("cat", "1234", "cat");
	lista.inserir(p1, p1.getUsername());
	lista.inserir(adm, adm.getUsername());
	lista.inserir(p2, p2.getUsername());
	lista.remover(adm);
	for(Map.Entry<String, Object> set: lista.listaUtilizadores.entrySet())
	    System.out.println(set.getKey() + "\t" + set.getValue().getClass().getSimpleName());
    }
}
