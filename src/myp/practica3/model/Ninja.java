package myp.practica3.model;

public abstract class Ninja {

	protected String name;
	protected short age;
	protected String clan;
	protected short skillLevel;

	protected Ninja(String name, short age, String clan, short skillLevel) {
		this.name = name;
		this.age = age;
		this.clan = clan;
		this.skillLevel = skillLevel;
	}

	public short getSkillLevel() {
		return this.skillLevel;
	}



}