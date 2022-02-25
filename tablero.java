import java.util.ArrayList;

public class Tablero {
    public String nombreJuego = "";
    public int Espacio = 0;
    public ArrayList<Ficha> jugadores = new ArrayList<Ficha>();
    public int cantidadJugadores = 0;

    

    public Tablero (String nombreJuego, int numEspacios) {
        this.nombreJuego = nombreJuego;
        this.Espacio = numEspacios;
        jugadores.add(new Ficha("Azul", "Azul"));
        jugadores.add(new Ficha("Rojo", "Rojo"));
        cantidadJugadores = 2;
    }
    
    

    public void turno() {
        jugadores.get(0).avanzar (40);
        if (jugadores.get(0).posicion >= Espacio) {
            System.out.println("\nGanó el jugador " + jugadores.get(0).color);
        } else {
            jugadores.add(jugadores.remove(0));
        }
    }
 

 

    public void juego() {
        boolean jugar = true;
        while (jugar) {
            turno();
            if (jugadores.get(0).posicion >= Espacio) {
                jugar = false;
            }
        }
    }
}


             