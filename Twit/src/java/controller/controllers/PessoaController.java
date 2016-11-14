/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.controllers;

import java.util.List;
import model.Pessoa;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author 151091371
 */
public class PessoaController implements controller.interfaces.iPessoaController{

    @Override
    public List<Pessoa> listarPessoas() {
        List<Pessoa> lista;
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            lista = session.createQuery("from pessoas").list();
            session.close();
            if(lista != null && !lista.isEmpty()){
                return lista;
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    @Override
    public List<Pessoa> listarPessoasByName(String nome) {
       List<Pessoa> lista;
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            lista = session.createQuery("from pessoas").list();
            session.close();
            if(lista != null && !lista.isEmpty()){
                return lista;
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    @Override
    public List<Pessoa> listarPessoasByEndereco(String endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> listarPerfisPublicos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
