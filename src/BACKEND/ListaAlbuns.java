package BACKEND;

import java.util.ArrayList;

public class ListaAlbuns {

    //Declaração do array
    private ArrayList<Album> listaAlbuns;

    //Inicialização do array
    public ListaAlbuns() {
        listaAlbuns = new ArrayList<>();
    }

    //Adicionar album
    public void inserir(Album a) {
        listaAlbuns.add(a);
    }

    //Remover album
    public void remover(Album a) throws Exception {
        try {
            listaAlbuns.remove(a);
        } catch (NullPointerException e) {
            System.out.println("O album introduzido não existe no repositório");
        }
    }

    //Verificar se album existe
    public boolean verificar(int id) {
        for (Album a : listaAlbuns) //Percorrer o array
            if (a.getId() == id) //verificar se o id do argumento corresponde ao id da linha atual do array
                return true;
        return false;
    }

    //Obter lista de albuns
    public ArrayList<Album> verAlbuns() {
        return listaAlbuns;
    }
    
    //Procurar album
    public Album procurarAlbum(int id) {
        for (Album a : listaAlbuns)
            if (a.getId() == id)
                return a;
        return null;
    }

    //Calcular número de albuns
    public int getTotalAlbuns() {
        return listaAlbuns.size();
    }

    //Verificar estado
    public ArrayList<Album> filtrarPorEstado(EstadoProducao estado){
        ArrayList<Album> lista = new ArrayList<>();
        for (Album a : listaAlbuns)
            if(a.getEstadoProducao().equals(estado))
                lista.add(a);
        return lista;
    }
}
