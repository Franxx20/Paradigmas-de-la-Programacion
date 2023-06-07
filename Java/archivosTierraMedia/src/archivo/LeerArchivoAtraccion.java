package archivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class LeerArchivoAtraccion {
    public Map<String, Atraccion> leerArchivoAtracciones() {

        Map<String, Atraccion> mapaAtracciones = new HashMap<>();
        List<Atraccion> listaAtraccion = new ArrayList<>();
        File file = null;

        try {
            file = new File("atracciones.txt");
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }

        try (Scanner scanner = new Scanner(file)) {
            scanner.useLocale(Locale.ENGLISH);

            while (scanner.hasNext()) {
                String nombre = scanner.next().replace('-', ' ');
                mapaAtracciones.put(nombre, new Atraccion(nombre, scanner.nextInt(), scanner.nextDouble(), scanner.nextInt(), TipoAtraccion.valueOf(scanner.next())));

                listaAtraccion.add(new Atraccion(nombre, scanner.nextInt(), scanner.nextDouble(), scanner.nextInt(), TipoAtraccion.valueOf(scanner.next())));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Map<String,Atraccion> mapaAtraccion2 = listaAtraccion.stream().collect(Collectors.toMap(Atraccion::getNombre,Atraccion::getAtraccion));

        return mapaAtracciones;
    }


}
