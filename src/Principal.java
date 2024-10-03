import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        CionsultaPelicula cosulta = new CionsultaPelicula();
        System.out.println("Escriba el numero de la pelicula de star wars que quiere consultar");
        try {
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = cosulta.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJSON(pelicula);
        }catch (NumberFormatException e){
            System.out.println("NUmero no encontrado " + e.getMessage());
        }
        catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicacion");
        }

    }
}
