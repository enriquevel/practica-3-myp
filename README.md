# Equipo Tepaches

- Velez Enrique
- Galindo Ruvalcaba Luis Adrian
- Pinzon Chan Jose Carlos

## Modelado y Programación 2026-1 - Practica 02

### Profesora: Rosa Victoria Villa Padilla

**Objetivo:** *El objetivo de esta práctica es implementar adecuadamente los patrones Iterator, Builder y Factory en la resolución del problema propuesto. Su solución debe estar integrada en un solo diagrama de clases así como una sola implementación.*

Se te ha encargado implementar el siguiente problema:

La Academia Ninja de la Aldea de las Ciencias ha tenido una reducción significativa en el número de nuevos estudiantes, es por eso que el líder de la aldea, el Vickage, ha decidido realizar actividades con los prospectos, para inspirar a las nuevas generaciones a convertirse en ninjas.

Los interesados se registran con su nombre, edad, clan de procedencia (Fuchiha, Osomaki, Naca, Mortalika, Akipichi) y un nivel de habilidad (1-3). Estos datos son almacenados en una HashTable.

Por otro lado, para la Academia cuenta con ninjas voluntarios para las actividades. La información requerida de cada uno de ellos es: nombre, edad, clan de procedencia, rango (genin, chunin, jonin) y nivel de habilidad (4-6). Los detalles de cada uno de ellos se encuentran almacenados en una Array.

Para organizar las actividades, se deben formar grupos uno a uno de la siguiente forma:
Se asigna a uno de los ninjas voluntarios como líder del grupo.
Dependiendo del rango del líder del grupo, se le asignará cierta cantidad máxima de aspirantes:
- Genin: 1 aspirante
- Chunin: 2 aspirantes
- Jonin: 3 aspirantes
  
A cada grupo se le asignará un paquete de herramientas ninja, así como un lugar de entrenamiento (más adelante se detallarán dichas asignaciones).

La asignación de grupos se realiza hasta que no haya más aspirantes o hasta que no haya más ninjas voluntarios disponibles, en tal caso, se tendrán que disculpar con los aspirantes sobrantes.

En el mundo Ninja existen distintas herramientas ninja con un peso establecido para cada uno (ustedes lo elegirán), que los líderes de grupo utilizarán durante las actividades. Antes de partir, los grupos deben pasar con el encargado de las entregas de los paquetes de herramientas ninja. Las herramientas existentes son: Kunais, Shurikens, Papeles Bomba, Bombas de Humo y Botiquines. Se tienen paquetes prefabricados:
- Paquete Básico: 1 Kunai, 1 Shuriken, 1 Botiquín
- Paquete Avanzado: 2 Shuriken, 3 Papeles Bomba, 2 Bombas de Humo, 2 Botiquines
- Paquete Táctico: 3 Kunai, 2 Shuriken, 4 Papeles Bomba, 2 Bomba de Humo

Sin embargo, es posible crear un paquete personalizado. Tú serás el encargado de la asignación de paquetes para cada grupo, es decir, tú tomarás la decisión de que paquete prefabricado recibirán, o si recibirán uno personalizado, el cual ayudarás a crear.

Finalmente, para la asignación del campo de entrenamiento, este será diseñado con respecto a la suma de los niveles de habilidad de cada uno de los integrantes del grupo:
- <7: Valle del Dragón
- 8-11: Bosque Sombrío
- +12: Montaña Espiritual

Al terminar toda la asignación de cada grupo, debe verse un resumen con los integrantes, el paquete adquirido, seguido de su peso total, y el campo asignado con una breve descripción de este.
