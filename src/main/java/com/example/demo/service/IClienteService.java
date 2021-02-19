package com.example.demo.service;

import com.example.demo.model.Cliente;

import java.util.List;
import java.util.Optional;

/**
 * @autor Darío
 */
public interface IClienteService {
    //operaciones que necesitamos par cliente
    List<Cliente> findAll();

    Optional<Cliente> findById(Integer id);

    Cliente create(Cliente cliente);

    Cliente update(Cliente cliente);
    //no retorna un objeto por eso solo void
    void delete(Integer id);

}
