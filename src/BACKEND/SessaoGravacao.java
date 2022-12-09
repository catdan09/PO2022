package BACKEND;

import java.time.LocalDate;

public class SessaoGravacao {

    private Album album;
    private Requisicao requisicao;
    private LocalDate dataFinalGravacao;

    //Construtor
    public SessaoGravacao(Album album, Requisicao requisicao, LocalDate dataFinalGravacao) {
        this.album = album;
        this.requisicao = requisicao;
        this.dataFinalGravacao = dataFinalGravacao;
    }

    //Seletores
    public Album getAlbum() {
        return album;
    }

    public Requisicao getRequisicao() {
        return requisicao;
    }

    public LocalDate getDataFinalGravacao() {
        return dataFinalGravacao;
    }

    //Modificadores
    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setRequisicao(Requisicao requisicao) {
        this.requisicao = requisicao;
    }

    public void setDataFinalGravacao(LocalDate dataFinalGravacao) {
        this.dataFinalGravacao = dataFinalGravacao;
    }

}
