package dio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

import dio.model.Cavalo;
import dio.service.RegistroService;


@RestController
@RequestMapping("cavalos")
public class RegistroRestController {

    @Autowired
    private RegistroService registroService;
    
    @GetMapping
    public ResponseEntity<Iterable<Cavalo>> buscarTodos() {
        return ResponseEntity.ok(registroService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cavalo> buscarPorId(@PathVariable long id) {
        return ResponseEntity.ok(registroService.buscaPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cavalo> inserir(@RequestBody Cavalo cavalo) {
        registroService.inserir(cavalo);
        return ResponseEntity.ok(cavalo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cavalo> atualizar(@PathVariable Long id, @RequestBody Cavalo cavalo) {
        registroService.atualizar(id,cavalo);
        return ResponseEntity.ok(cavalo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        registroService.deletar(id);
        return ResponseEntity.ok().build();
    }

   
}   