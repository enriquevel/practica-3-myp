package myp.practica3.model;

public enum Rank {

	GENIN,
	CHUNIN,
	JONIN;

	public int getMaxCapacity() {
		return switch (this) {
			case GENIN -> 1;
			case CHUNIN -> 2;
			case JONIN -> 3;
		};
	}

}