package myp.practica3.model;

import java.util.List;
import myp.practica3.builder.Package;
import myp.practica3.factory.TrainingCamp;

/**
 * Clase que representa un grupo de entrenamiento ninja.
 * Un grupo está compuesto por un ninja voluntario que actúa como líder,
 * una lista de ninjas aspirantes que reciben entrenamiento, un paquete de
 * herramientas para las actividades, y un campo de entrenamiento asignado.
 */
public class Group {

	/** El ninja voluntario líder del grupo. */
    private final VolunteerNinja leader;

	/** La lista de aspirantes ninja que forman parte del grupo. */
    private final List<ApplicantNinja> applicants;

	/** El paquete de herramientas ninja del grupo. */
    private final Package pack;

	/** El campo de entrenamiento asignado al grupo. */
    private final TrainingCamp trainingCamp;

	/**
	 * Constructor para crear un nuevo grupo de entrenamiento.
	 *
	 * @param leader   	   el ninja voluntario que será líder
	 * @param applicants   la lista de ninjas aspirantes
	 * @param pack         el paquete de herramientas para el grupo
	 * @param trainingCamp el campo de entrenamiento asignado
	 * @throws NullPointerException si el líder, los aspirantes, el paquete
	 * 			o el campo de entrenamiento son null.
	 * @throws IllegalArgumentException si la lista de aspirantes está vacía
	 */
    public Group(VolunteerNinja leader, List<ApplicantNinja> applicants, Package pack, TrainingCamp trainingCamp) {
		if (leader == null || applicants == null || pack == null || trainingCamp == null)
			throw new NullPointerException("El líder, los aspirantes, " +
					"el paquete y el campo de entrenamiento no pueden ser null.");

		if (applicants.isEmpty())
			throw new IllegalArgumentException("La lista de aspirantes no puede ser vacía.");

        this.leader = leader;
        this.applicants = applicants;
        this.pack = pack;
        this.trainingCamp = trainingCamp;
    }

	/**
	 * Devuelve al ninja voluntario líder del grupo.
	 *
	 * @return el ninja voluntario líder del grupo
	 */
	public VolunteerNinja getVolunteer() {
		return this.leader;
	}

	/**
	 * Devuelve la lista de aspirantes ninja del grupo.
	 *
	 * @return La lista de aspirantes ninja del grupo
	 */
	public List<ApplicantNinja> getApplicants() {
		return this.applicants;
	}

	/**
	 * Devuelve el paquete de herramientas ninja del grupo.
	 *
	 * @return el paquete de herramientas ninja del grupo
	 */
	public Package getPackage() {
		return this.pack;
	}

	/**
	 * Devuelve el campo de entrenamiento del grupo.
	 *
	 * @return el campo de entrenamiento del grupo
	 */
	public TrainingCamp getTrainingCamp() {
		return this.trainingCamp;
	}

}
