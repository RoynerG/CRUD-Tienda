package catalogo.model;

import lombok.Data;

@Data
public class Producto {
    private Long id;
    private String nombre;
    private double precio;
    private Categoria categoria;
    private String sku;
}
