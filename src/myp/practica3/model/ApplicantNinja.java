package myp.practica3.model;

public class ApplicantNinja extends Ninja {

	public ApplicantNinja(String name, short age, String clan, short skillLevel) {
		super(name, age, clan, skillLevel);

		if(skillLevel < 1 || skillLevel > 3)
			throw new IllegalStateException("El nivel de habilidad del aplicante ninja debe de estar entre 1-3"); 

	}

}