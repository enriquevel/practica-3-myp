package myp.practica3.builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que representa un paquete de herramientas ninja.
 * Esta clase es el producto final del patrón Builder implementado
 * por PackageBuilder.
 */
public class Package {

	/** La colección de herramientas ninja dentro del paquete. */
	private Map<NinjaTool, Integer> tools = new HashMap<>();

	/**
	 * Constructor por defecto que inicializa un paquete vacío.
	 */
	public Package() {}

	/**
	 * Agrega una cantidad específica de una herramienta al paquete.
	 * Si la herramienta ya existe en el paquete, se suma la cantidad
	 * a la existente. Si no existe, se agrega con la cantidad especificada.
	 *
	 * @param tool   la herramienta ninja a agregar
	 * @param amount la cantidad de herramientas a agregar
	 * @throws NullPointerException si la herramienta es null
	 * @throws IllegalArgumentException si la cantidad es negativa
	 */
	public void addTool(NinjaTool tool, int amount) {
		if (tool == null)
			throw new NullPointerException("La herramienta no puede ser null.");

		if (amount < 0)
			throw new IllegalArgumentException("La cantidad no puede ser negativa.");

		this.tools.put(tool, this.tools.getOrDefault(tool, 0) + amount);
	}

	/**
	 * Calcula y retorna el peso total del paquete.
	 *
	 * @return el peso total del paquete en gramos
	 */
	public double getTotalWeight() {
		double totalWeight = 0;

		for(Map.Entry<NinjaTool, Integer> entry: this.tools.entrySet()) {
			NinjaTool tool = entry.getKey();
			int amount = entry.getValue();
			totalWeight += tool.getWeight() * amount;
		}
		return totalWeight;
	}

	/**
	 * Indica si el paquete está vacío, es decir, que no tiene herramientas.
	 *
	 * @return <code>true</code> si el paquete está vacío, <code>false</code>
	 * 			en otro caso.
	 */
	public boolean isEmpty() {
		return this.tools.isEmpty();
	}
}
