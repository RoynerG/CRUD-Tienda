package catalogo.controller;

import catalogo.model.Producto;
import catalogo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> obtenerProductos(){
        return productoService.obtenerProductos();
    }

    @PostMapping
    public ResponseEntity<String> crearProducto(@ResponseBody Producto producto){
        productoService.crearProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Se ha creado el producto");

    }
}
