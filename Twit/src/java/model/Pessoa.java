/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 151091371
 */
@Entity
@Table(name="pessoas")
public class Pessoa {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="nome")
    private String nome;
    @Column(name="sexo")
    private boolean sexo;
    @Column(name="data_nasc")
    private Date dataNascimento;
    @Column(name="telefone")
    private String telefone;
    @Column(name="endereco")
    private String endereco;
    @Column(name="perfil_publico")
    private boolean perfilPublico;

    public Pessoa(String nome, boolean sexo, Date dataNascimento, String telefone) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}
