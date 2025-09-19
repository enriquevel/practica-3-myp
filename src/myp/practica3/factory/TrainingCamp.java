package myp.practica3.factory;

/**
 * Clase abstracta que representa a un campo de entrenamiento.
 * Define el comportamiento de los productos concretos. 
 */
public abstract class TrainingCamp {

    /** El nombre del campo de entrenamiento. */
    protected String name;

    /**
     * Construye un campo de entrenamiento con el nombre dado.
     * 
     * @param name el nombre del campo de entrenamiento.
     */
    protected TrainingCamp(String name) {
        this.name = name;
    }
    
    /**
     * Devuelve el nombre del campo de entrenamiento.
     * 
     * @return el nombre del campo de entrenamiento.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Representacion en cadena del campo de entrenamiento.
     * 
     * @return una representacion en cadena del campo de entrenamiento.
     */
    @Override
    public String toString() {
        return this.name;
    }
}
