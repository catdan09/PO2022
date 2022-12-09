package BACKEND;

import java.time.LocalTime;

public class Musica {
    
    private String titulo;
    private LocalTime duracao;
    private Musico musico;
    
    //Cosntrutor
    public Musica(String titulo, LocalTime duracao, Musico musico) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.musico = musico;
    }
        
    //Seletores
    public String getTitulo() {
        return titulo;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public Musico getMusico() {
        return musico;
    }
    
    //Modificadores
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public void setMusico(Musico musico) {
        this.musico = musico;
    }

}
