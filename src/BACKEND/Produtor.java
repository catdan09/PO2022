package BACKEND;

import java.io.Serializable;
import java.time.LocalDate;

public class Produtor extends Utilizador implements Serializable{
    
    private LocalDate dataNasc;
    private String morada;
    private int nBI;
    
    //Construtor
    public Produtor(String username, String password, String nome, LocalDate dataNasc, String morada, int nBI){
        super(username, password, nome);
        this.dataNasc = dataNasc;
        this.morada = morada;
        this.nBI = nBI;
    }
    
    //Seletores
    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public String getMorada() {
        return morada;
    }

    public int getnBI() {
        return nBI;
    }
    
    //Construtores
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setnBI(int nBI) {
        this.nBI = nBI;
    }
}
