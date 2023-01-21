package dio.service;

import dio.model.Cavalo;

public interface RegistroService {

    Iterable<Cavalo> buscarTodos();

    Cavalo buscaPorId(Long id);

    void inserir(Cavalo cavalo);

    void atualizar(Long id, Cavalo cavalo);

    void deletar(Long id);
    
}
