package dio.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.model.Cavalo;
import dio.model.CavaloRepository;
import dio.service.RegistroService;
import dio.model.Cavalo;
import dio.model.CavaloRepository;
import dio.service.RegistroService;



@Service
public class RegistroServiceImpl implements RegistroService {

	// Singleton: Injetar os componentes do Spring com @Autowired.
	@Autowired
	private CavaloRepository cavaloRepository;
	
	
	// Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	@Override
	public Iterable<Cavalo> buscarTodos() {
		// Buscar todos os Clientes.
		return cavaloRepository.findAll();
	}

	@Override
	public Cavalo buscarPorId(Long id) {
		// Buscar Cliente por ID.
		Optional<Cavalo> cliente = cavaloRepository.findById(id);
		return cavalo.get();
	}

	@Override
	public void deletar(Long id) {
		// Deletar Cavalo por ID.
		cavaloRepository.deleteById(id);
	}

	
}

