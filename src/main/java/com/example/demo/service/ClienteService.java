package com.example.demo.service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @autor Darío
 */
@Service
public class ClienteService implements IClienteService {
    //inyeccion de dependencias
    @Autowired //estara siempre disponible en el service
    private IClienteRepository clienteRepo;

    @Override
    public List<Cliente> findAll() {
        return clienteRepo.findAll();
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        return clienteRepo.findById(id);
    }

    /**
     * CRUDS
     */
    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepo.save(cliente);
    }


    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public void delete(Integer id) {
        clienteRepo.deleteById(id);
    }
}
