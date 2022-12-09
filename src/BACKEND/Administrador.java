package BACKEND;

import java.io.Serializable;

public class Administrador extends Utilizador implements Serializable{
    
    //Construtor
    public Administrador(String username, String password, String nome){
        super(username, password, nome);
    }
}
