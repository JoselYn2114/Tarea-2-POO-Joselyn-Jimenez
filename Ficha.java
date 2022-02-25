public class Ficha { //clase ficha
	
	public String color;
	public int posicion;
	public String nombre;

	Dado dado = new Dado (6);

	public Ficha (String color, String posicion) {
		this.color = color;
		this.posicion = 0;
		this.nombre = ""; 
	}

	public void avanzar (int caras) {

		int pasos = this.dado.lanzar ();  
		this.posicion += pasos;
		System.out.println (this.color + "Tiró" + pasos);
		System.out.println ("\nEl jugador "+ this.color + " Está en la posición " + this.posicion);
	}

}




