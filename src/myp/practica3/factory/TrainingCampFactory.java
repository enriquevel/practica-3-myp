package myp.practica3.factory;

/**
 * Clase abstracta que define el patrón Factory Method para crear campos de
 * entrenamiento.
 * La asignación dependera de la suma de los niveles de habilidad de cada uno de
 * los integrantes del grupo.
 */
public abstract class TrainingCampFactory {

    /**
     * Crea un campo de entrenamiento con respecto a la suma de los niveles de
     * habilidad de cada uno de los integrantes del grupo.
     * 
     * @param skillLevelSum la suma total de los niveles de habilidad de los
     *                        integrantes del grupo.
     * @return un campo de entrenamiento con respecto a la suma de los niveles de
     *         habilidad de los ninjas
     */
    public abstract TrainingCamp createTrainingCamp(int skillLevelSum);

}