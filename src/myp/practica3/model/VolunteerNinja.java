package myp.practica3.model;

public class VolunteerNinja extends Ninja {
	protected Rank rank;

	public VolunteerNinja(String name, short age, String clan, short skillLevel, Rank rank) {
		super(name, age, clan, skillLevel);
		this.rank = rank;
	}

	public Rank getRank() {
		return this.rank;
	}
}