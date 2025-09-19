package myp.practica3.builder;

public class DefaultPackageBuilder implements PackageBuilder {

	private final Package pack;

	public DefaultPackageBuilder() {
		this.pack = new Package();
	}

	/**
	 *
	 */
	@Override
	public PackageBuilder addKunai(int amount) {
		this.pack.addTool(NinjaTool.KUNAI, amount);
		return this;
	}

	/**
	 *
	 */
	@Override
	public PackageBuilder addShuriken(int amount) {
		this.pack.addTool(NinjaTool.SHURIKEN, amount);
		return this;
	}

	/**
	 *
	 */
	@Override
	public PackageBuilder addPaperBomb(int amount) {
		this.pack.addTool(NinjaTool.PAPER_BOMB, amount);
		return this;
	}

	/**
	 *
	 */
	@Override
	public PackageBuilder addSmokeBomb(int amount) {
		this.pack.addTool(NinjaTool.SMOKE_BOMB,  amount);
		return this;
	}

	/**
	 *
	 */
	@Override
	public PackageBuilder addAidKit(int amount) {
		this.pack.addTool(NinjaTool.AID_KIT, amount);
		return this;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public Package build() {
		return this.pack;
	}
}
