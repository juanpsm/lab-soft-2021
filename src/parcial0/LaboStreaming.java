package parcial0;

import java.util.List;
import java.util.Comparator;

public class LaboStreaming {
  private List<Transmision> canales;
  
  public List<Transmision> filtrar(String g, String p, String i, String t){
	  canales.stream()
	  .filter(canal -> canal.getVideojuego().getGenero() == g)
	  .filter(canal -> canal.getVideojuego().getPlataforma() == p)
	  .filter(canal -> canal.getIdioma() == i)
	  .filter(canal -> canal.getAcceso() == t);
	  
	  return canales;
  }
  public List<Transmision> filtrar(String g, String p, String i, String t, Comparator<Transmision> c){
	  return null;
  }



}
