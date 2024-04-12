package ar.edu.utn.frba.dds;

public class Prenda {
    private Tipo tipo;
    private Categoria categoria;
    private String material;
    private String colorPrimario;
    private String colorSecundario;

    public Prenda(Tipo tipo, Categoria categoria, String material, String colorPrimario, String colorSecundario) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;

        if(tipo == null){
            throw new IllegalArgumentException("El tipo no puede ser nulo");
        }
        if(categoria == null){
            throw new IllegalArgumentException("La categoria no puede ser nula");
        }
        if(material == null){
            throw new IllegalArgumentException("El material no puede ser nulo");
        }
        if(colorPrimario == null){
            throw new IllegalArgumentException("El color primario no puede ser nulo");
        }
        if(!(this.tipo.getCategoria() == categoria)){
            throw new IllegalArgumentException("La categoria no corresponde al tipo de prenda.");
        }
    }

}
