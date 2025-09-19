package myp.practica3.model;

public class VolunteerNinja extends Ninja {
	protected Rank rank;

	public VolunteerNinja(String name, short age, String clan, short skillLevel, Rank rank) {
		super(name, age, clan, skillLevel);
		this.rank = rank;

		if(skillLevel < 4 || skillLevel > 6)
			throw new IllegalStateException("El nivel de habilidad del voluntario ninja debe de estar entre 4-6"); 
	}

	public Rank getRank() {
		return this.rank;
	}
}