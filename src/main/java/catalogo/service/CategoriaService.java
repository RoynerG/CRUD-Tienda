package catalogo.service;

import catalogo.model.Categoria;

import java.util.List;

public interface CategoriaService {
    List<Categoria> obtenerCategorias();
    void crearCategoria(Categoria categoria);
}
