package com.compass.aspp.service;

import com.compass.aspp.domain.Client;
import com.compass.aspp.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
    ClientRepository clientRepository;

	public long countAllClients() {
        return clientRepository.count();
    }

	public void deleteClient(Client client) {
        clientRepository.delete(client);
    }

	public Client findClient(Long id) {
        return clientRepository.findOne(id);
    }

	public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

	public List<Client> findClientEntries(int firstResult, int maxResults) {
        return clientRepository.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }

	public void saveClient(Client client) {
        clientRepository.save(client);
    }

	public Client updateClient(Client client) {
        return clientRepository.save(client);
    }
}
