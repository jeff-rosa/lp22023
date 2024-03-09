/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.model;


import java.sql.SQLException;
import projetovendas.interfaces.IOperacao;

import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Estado implements IOperacao {

    private String nome;
    private String SiglaEstado;
    
    private Statement mysqStatement = null;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSiglaEstado() {
        return SiglaEstado;
    }

    public void setSiglaEstado(String SiglaEstado) {
        this.SiglaEstado = SiglaEstado;
    }

    @Override
    public void cadastrar() {
         String insert  = "insert into estado(nomeEstado, siglaEstado) "
                + "values('"+getNome()+"','"+getSiglaEstado()+"')";
         System.out.println(" "+insert);
         mysqStatement = ConexaoDB.getStatement();
         
        try {
            mysqStatement.executeUpdate(insert);
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
         
       
    }

    @Override
    public boolean alterar() {
        return false;
    }

    @Override
    public boolean excluir() {
        return false;
    }

    @Override
    public void cancelar() {

    }

    @Override
    public String toString() {
        return "estado{" + "nome=" + nome + ", SiglaEstado=" + SiglaEstado + '}';
    }
    
    

}
