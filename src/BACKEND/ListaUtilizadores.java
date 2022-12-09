package BACKEND;

import java.util.HashMap;

public class ListaUtilizadores {
    
    private HashMap<String, Utilizador> listaUtilizadores;

    public ListaUtilizadores() {
        this.listaUtilizadores = new HashMap<>();
    }
    
    //Adicionar utilizador
        public void inserir(Utilizador u){
        listaUtilizadores.put(u.getUsername(),u);
    }
    
    //Remover utilizador
    public void remover(Utilizador u) throws Exception{
        try {
            listaUtilizadores.remove(u);
        } catch (NullPointerException e){
            System.out.println("O utilizador introduzido não existe no repositório");
        }
    }
    
    //Verificar se existe utilizador
    public boolean verificar(String username) {
       return listaUtilizadores.containsKey(username);
    }
    
    //getbyusername (devolver o utilizador ao pesquisar por username
    public Utilizador procurarUsername(String username){
        return listaUtilizadores.get(username);
    }
    
    //getbyname (devolver o utilizador ao pesquisar por name
    public Utilizador procurarName(String name){
        return listaUtilizadores.get(name);
    }
    
    //Lista utilizadores tipo Produtor
    
    
    //Lista utilizadores tipo Administrador
    
    
    //Lista utilizadores tipo Músico
}
