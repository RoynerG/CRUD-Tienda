package catalogo.service;

import catalogo.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> obtenerProductos();
    void crearProducto(Producto producto);

}
