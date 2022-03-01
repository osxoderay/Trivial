import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(false);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1() {
        //Arrange
        Game sut = new Game();
        sut.agregar("Maria");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de Maria es 1";

        //Act
        String actual = sut.nuevaPosicionJugador();

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void al_menos_dos_jugadores(){
        Game.esJugable();
        Game juego = new Game();
        juego.agregar("Levi");
        juego.agregar("Gojo");

        int expected = 2;
        int actual = Game.cuantosJugadores();

        Assertions.assertEquals(expected,actual);
    }

    @Test void al_menos_seis_jugadores() {
        Game.esJugable();
        Game juego = new Game();
        juego.agregar("Levi");
        juego.agregar("Gojo");
        juego.agregar("Mikasa");
        juego.agregar("Sukuna");
        juego.agregar("Eren");
        juego.agregar("Armin");

        int expected = 6;
        int actual = Game.cuantosJugadores();

        Assertions.assertEquals(expected,actual);
    }
}
