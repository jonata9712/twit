/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.interfaces;

import java.util.List;
import model.Pessoa;

/**
 *
 * @author 151091371
 */
public interface iPessoaController {
    List<Pessoa> listarPessoas();
    List<Pessoa> listarPessoasByName(String nome);
    List<Pessoa> listarPessoasByEndereco(String endereco);
    List<Pessoa> listarPerfisPublicos();
}
