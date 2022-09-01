package com.compass.aspp.service;

import com.compass.aspp.domain.Client;
import java.util.List;
import org.springframework.roo.addon.layers.service.RooService;

@RooService(domainTypes = { com.compass.aspp.domain.Client.class })
public interface ClientService {

	public abstract long countAllClients();


	public abstract void deleteClient(Client client);


	public abstract Client findClient(Long id);


	public abstract List<Client> findAllClients();


	public abstract List<Client> findClientEntries(int firstResult, int maxResults);


	public abstract void saveClient(Client client);


	public abstract Client updateClient(Client client);

}
