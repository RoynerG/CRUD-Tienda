package catalogo.service;

import catalogo.model.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    private List<Producto> productos = new ArrayList<>();

    @Override
    public List<Producto> obtenerProductos() {
        return productos;
    }

    @Override
    public void crearProducto(Producto producto) {
        productos.add(producto);
    }
}