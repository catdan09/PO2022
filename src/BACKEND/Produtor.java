package BACKEND;

import java.io.Serializable;

public class Produtor extends Utilizador implements Serializable{
    
    //Construtor
    public Produtor(String username, String password, String nome){
        super(username, password, nome);
    }
}
