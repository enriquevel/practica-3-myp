package myp.practica3.factory;

/**
 * Clase que representa a un creador concreto de campos de entrenamiento usando el patron Factory Method.
 * Crea un campo de entrenamiento con respecto a la suma de los niveles de habilidad de cada uno de los ninjas del grupo.
 */
public class ConcreteTrainingCampFactory extends TrainingCampFactory {

    /**
     * Crea un campo de entrenamiento con respecto a la suma de los niveles de
     * habilidad de cada uno de los integrantes del grupo.
     * 
     * @param skillLevelSum la suma de los niveles de habilidad de cada uno de los ninjas del grupo.
     * @return un campo de entrenamiento Valle del Dragon si esta suma es <7.
     * @return un campo de entrenamiento Bosque Sombrio si la suma esta entre 8-11.
     * @return un campo de entrenamiento Montaña Espiritual si esta suma es >12.
     * @throws IllegalArgumentException si el total de niveles de habilidad es negativo.
     */
    @Override
    public TrainingCamp createTrainingCamp(int skillLevelSum) {
        if(skillLevelSum < 0) {
            throw new IllegalArgumentException("La suma de los niveles de habilidad no puede ser negativa.");
        }

        if(skillLevelSum < 7) {
            return new ValleDelDragon();
        } else if(skillLevelSum <= 11) {
            return new BosqueSombrio();
        } else {
            return new MontanaEspiritual();
        }
    }
}
