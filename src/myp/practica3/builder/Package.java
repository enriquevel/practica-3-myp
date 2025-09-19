package myp.practica3.builder;

import java.util.HashMap;
import java.util.Map;

public class Package {

	private Map<NinjaTool, Integer> tools = new HashMap<>();

	public void addTool(NinjaTool tool, int amount) {
		this.tools.put(tool, this.tools.getOrDefault(tool, 0) + amount);
	}

	public double getTotalWeight() {

	}

}
