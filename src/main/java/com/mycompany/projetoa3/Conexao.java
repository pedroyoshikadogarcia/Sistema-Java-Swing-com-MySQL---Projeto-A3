package com.mycompany.projetoa3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/projetoA3?serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "1234"; 

    public static Connection conectar() {
        try {
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            //System.out.println("Conexão com o banco de dados realizada com sucesso!");
            return conexao;
        } catch (SQLException e) {
          //  System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        conectar();
    }
}
