package BACKEND;

import java.io.Serializable;
import java.time.LocalDate;

public class Musico extends Utilizador implements Serializable{
    
    private LocalDate dataNasc;
    private String morada;
    private int nBI;
    private Instrumento instrumento;
    
    //Construtor
    public Musico(String username, String password, String nome, LocalDate dataNasc, String morada, int nBI, Instrumento instrumento) {
        super(username, password, nome);
        this.dataNasc = dataNasc;
        this.morada = morada;
        this.nBI = nBI;
        this.instrumento = instrumento;
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

    public Instrumento getInstrumento() {
        return instrumento;
    }
    
    //Modificadores
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setnBI(int nBI) {
        this.nBI = nBI;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
    
}
