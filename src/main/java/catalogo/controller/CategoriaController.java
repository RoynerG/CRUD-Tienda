package catalogo.controller;

import catalogo.model.Categoria;
import catalogo.model.Producto;
import catalogo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<Categoria> obtenerCategorias() {
        return categoriaService.obtenerCategorias();
    }

    @PostMapping
    public ResponseEntity<String> crearCategoria(@ResponseBody Categoria categoria) {
        categoriaService.crearCategoria(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body("Se ha creado la categoria");

    }

}
