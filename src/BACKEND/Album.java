package BACKEND;

import java.time.LocalDate;

public class Album {

    private int id;
    private String nome;
    private LocalDate dataEdicao;
    private String tipoMusica;
    private Musica musica;
    private EstadoProducao estadoProducao;

    //Construtor
    public Album(String nome, LocalDate dataEdicao, String tipoMusica, Musica musica) {
        this.id = id;
        this.nome = nome;
        this.dataEdicao = dataEdicao;
        this.tipoMusica = tipoMusica;
        this.musica = musica;
        this.estadoProducao = estadoProducao;
    }

    //Seletores
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataEdicao() {
        return dataEdicao;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public Musica getMusica() {
        return musica;
    }

    public EstadoProducao getEstadoProducao() {
        return estadoProducao;
    }

    //Modificadores
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataEdicao(LocalDate dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public void setEstadoProducao(EstadoProducao estadoProducao) {
        this.estadoProducao = estadoProducao;
    }

}
