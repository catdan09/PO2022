package BACKEND;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListaUtilizadores {
    
    HashMap<String, Object> listaUtilizadores;

    public ListaUtilizadores() {
        this.listaUtilizadores = new HashMap<>();
    }
    
    //Adicionar utilizador
        public void inserir(Object u, String username){
        listaUtilizadores.put(username ,u);
    }
    
    //Remover utilizador
    public void remover(Utilizador u) throws Exception{
        try {
            listaUtilizadores.remove(u.getUsername());
        } catch (NullPointerException e){
            System.out.println("O utilizador introduzido não existe no repositório");
        }
    }
    
    //Verificar se existe utilizador
    public boolean verificar(String username) {
       return listaUtilizadores.containsKey(username);
    }
    
    //getbyusername (devolver o utilizador ao pesquisar por username
    public Object procurarUsername(String username){
        return listaUtilizadores.get(username);
    }
    
    //getbyname (devolver o utilizador ao pesquisar por name
    public Object procurarName(String name){
        return listaUtilizadores.get(name);
    }
    
    //Lista utilizadores tipo Produtor
    public ArrayList<Produtor> getProdutores(){
	ArrayList<Produtor> lista = new ArrayList<>();
	for(Map.Entry<String, Object> set: listaUtilizadores.entrySet()){
	    if(set.getValue() instanceof Produtor)
		lista.add((Produtor)set.getValue());
	}
	return lista;
    }
    
    //Lista utilizadores tipo Administrador
    public ArrayList<Administrador> getAdms(){
	ArrayList<Administrador> lista = new ArrayList<>();
	for(Map.Entry<String, Object> set: listaUtilizadores.entrySet()){
	    if(set.getValue() instanceof Administrador)
		lista.add((Administrador)set.getValue());
	}
	return lista;
    }
    
    //Lista utilizadores tipo Músico
    public ArrayList<Musico> getMusicos(){
	ArrayList<Musico> lista = new ArrayList<>();
	for(Map.Entry<String, Object> set: listaUtilizadores.entrySet()){
	    if(set.getValue() instanceof Musico)
		lista.add((Musico)set.getValue());
	}
	return lista;
    }
}
