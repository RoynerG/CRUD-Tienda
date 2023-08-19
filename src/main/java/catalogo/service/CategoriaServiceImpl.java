package catalogo.service;

import catalogo.model.Categoria;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    private List<Categoria> categorias = new ArrayList<>();

    @Override
    public List<Categoria> obtenerCategorias() {
        return categorias;
    }

    @Override
    public void crearCategoria(Categoria categoria) {
        categorias.add(categoria);
    }
}