package com.netec.pocs.clients.srv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.netec.pocs.clients.dto.ClientDTO;

public class ClientService {

	static HashMap<Long, ClientDTO> clientMap = getClientMap();

	public ClientService() {
		super();
		if (clientMap == null) {
			clientMap = new HashMap<Long, ClientDTO>();
			ClientDTO c1 = new ClientDTO(1, "Alberto", "Alonso");
			ClientDTO c2 = new ClientDTO(2, "Beatriz", "Barrera");
			ClientDTO c3 = new ClientDTO(3, "Carlos", "Castañeda");
			ClientDTO c4 = new ClientDTO(4, "Daniela", "Duarte");
			ClientDTO c5 = new ClientDTO(5, "Eduardo", "Estrada");
			ClientDTO c6 = new ClientDTO(6, "Fernanda", "Fuentes");
			ClientDTO c7 = new ClientDTO(7, "Gerardo", "González");
			ClientDTO c8 = new ClientDTO(8, "Héctor", "Herrera");
			ClientDTO c9 = new ClientDTO(9, "Isabela", "Ibáñez");
			ClientDTO c10 = new ClientDTO(10, "Jorge", "Jiménez");
			ClientDTO c11 = new ClientDTO(11, "Karla", "Kuri");
			ClientDTO c12 = new ClientDTO(12, "Luis", "López");
			ClientDTO c13 = new ClientDTO(13, "Mariana", "Montes");
			ClientDTO c14 = new ClientDTO(14, "Natalia", "Navarro");
			ClientDTO c15 = new ClientDTO(15, "Octavio", "Ortega");
			ClientDTO c16 = new ClientDTO(16, "Patricia", "Pérez");
			ClientDTO c17 = new ClientDTO(17, "Querétaro", "Quintana");
			ClientDTO c18 = new ClientDTO(18, "Ricardo", "Ramírez");
			ClientDTO c19 = new ClientDTO(19, "Sofía", "Sánchez");
			ClientDTO c20 = new ClientDTO(20, "Tomás", "Torres");
			ClientDTO c21 = new ClientDTO(21, "Ulises", "Uribe");
			ClientDTO c22 = new ClientDTO(22, "Valeria", "Vargas");
			ClientDTO c23 = new ClientDTO(23, "Walter", "Wong");
			ClientDTO c24 = new ClientDTO(24, "Ximena", "Xochimilco");
			ClientDTO c25 = new ClientDTO(25, "Yahir", "Yáñez");
			ClientDTO c26 = new ClientDTO(26, "Zulema", "Zamora");

			clientMap.put(1L, c1);
			clientMap.put(2L, c2);
			clientMap.put(3L, c3);
			clientMap.put(4L, c4);
			clientMap.put(5L, c5);
			clientMap.put(6L, c6);
			clientMap.put(7L, c7);
			clientMap.put(8L, c8);
			clientMap.put(9L, c9);
			clientMap.put(10L, c10);
			clientMap.put(11L, c11);
			clientMap.put(12L, c12);
			clientMap.put(13L, c13);
			clientMap.put(14L, c14);
			clientMap.put(15L, c15);
			clientMap.put(16L, c16);
			clientMap.put(17L, c17);
			clientMap.put(18L, c18);
			clientMap.put(19L, c19);
			clientMap.put(20L, c20);
			clientMap.put(21L, c21);
			clientMap.put(22L, c22);
			clientMap.put(23L, c23);
			clientMap.put(24L, c24);
			clientMap.put(25L, c25);
			clientMap.put(26L, c26);
		}
	}

	public List<ClientDTO> getClients() {
		return new ArrayList<ClientDTO>(clientMap.values());
	}

	public ClientDTO getClient(long id) {
		return clientMap.get(id);
	}

	public ClientDTO addClient(ClientDTO client) {
		client.setIdClient(getMaxId() + 1);
		clientMap.put(client.getIdClient(), client);
		return client;
	}

	public ClientDTO updateClient(ClientDTO client) {
		if (client.getIdClient() <= 0)
			return null;
		clientMap.put(client.getIdClient(), client);
		return client;

	}

	public void deleteClient(Long id) {
		clientMap.remove(id);
	}

	public static HashMap<Long, ClientDTO> getClientMap() {
		return clientMap;
	}

	public static Long getMaxId() {
		Long max = 0L;
		for (Long id : clientMap.keySet()) {
			if (max <= id)
				max = id;

		}
		return max;
	}
}
