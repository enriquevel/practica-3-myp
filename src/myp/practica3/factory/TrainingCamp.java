package myp.practica3.factory;

/**
 * Clase abstracta que representa a un campo de entrenamiento.
 * Define el comportamiento de los productos concretos. 
 */
public abstract class TrainingCamp {

    /** El nombre del campo de entrenamiento. */
    protected String name;

	/** La descripción del campo de entrenamiento. */
	protected String description;

    /**
     * Construye un campo de entrenamiento con el nombre dado.
     * 
     * @param name el nombre del campo de entrenamiento.
     */
    protected TrainingCamp(String name, String description) {
        this.name = name;
		this.description = description;
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
	 * Devuelve la descripción del campo de entrenamiento.
	 *
	 * @return la descripción del campo de entrenamiento.
	 */
	public String getDescription() {
		return this.description;
	}

    /**
     * Representacion en cadena del campo de entrenamiento.
     * 
     * @return una representacion en cadena del campo de entrenamiento.
     */
    @Override
    public String toString() {
        return this.name + ": " + this.description;
    }
}
