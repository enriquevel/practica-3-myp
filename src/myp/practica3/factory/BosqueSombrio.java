package myp.practica3.factory;

/**
 * Clase que representa a un campo de entrenamiento Bosque Sombrío.
 * Estos son asignados a grupos con una suma de niveles de habilidad de cada integrante entre 8 y 11.
 */

public class BosqueSombrio extends TrainingCamp {

     /**
     * Crea un campo de entrenamiento de tipo Bosque Sombrío.
     */
    public BosqueSombrio() {
        super("Bosque Sombrío", "Un bosque denso y misterioso, lleno de" +
				"obstáculos naturales que ponen a prueba la agilidad y el trabajo en equipo.");
    }
}