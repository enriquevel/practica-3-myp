package myp.practica3.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import myp.practica3.model.VolunteerNinja;

public class VolunteerIterator implements Iterator<VolunteerNinja> {

	private VolunteerNinja[] volunteers;
	private int size;
	private int index;

	public VolunteerIterator(VolunteerNinja[] volunteers, int size) {
		this.volunteers = volunteers;
		this.size = size;
		this.index = 0;
	}

	/**
	 * @return 
	 */
	@Override
	public boolean hasNext() {
		return this.index < this.size;
	}

	/**
	 * @return 
	 */
	@Override
	public VolunteerNinja next() {
		if (this.index >= this.size)
			throw new NoSuchElementException("No hay más voluntarios por iterar.");

		return this.volunteers[this.index++];
	}
}
