package myp.practica3.storage;

import java.util.Iterator;
import myp.practica3.iterator.VolunteerIterator;
import myp.practica3.model.VolunteerNinja;

public class VolunteerPool implements Iterable<VolunteerNinja> {

	private VolunteerNinja[] volunteers;
	private int size;
	private static final int INITIAL_CAPACITY = 10;

	public VolunteerPool() {
		this.volunteers = new VolunteerNinja[INITIAL_CAPACITY];
		this.size = 0;
	}

	/**
	 * @return 
	 */
	@Override
	public Iterator<VolunteerNinja> iterator() {
		return new VolunteerIterator(this.volunteers, this.size);
	}

	public void addVolunteer(VolunteerNinja volunteer) {

	}
}