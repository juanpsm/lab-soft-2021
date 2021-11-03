package p8.e3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Carrera {
    int longitudCarrera = 100;
    String ganador = "";
    private List<Corredor> corredores = new ArrayList<>();
    private ExecutorService exec = Executors.newFixedThreadPool(5); // con solo 3 threads en el pool, correran 3 y cuando van terminando empiezan a correr los que faltan
    
    public Carrera() throws InterruptedException {
        inicializar();
        largada();
        System.out.println("GANADOR:" + ganador);
        
    }
    
    public int getLongitudCarrera() {
    	return this.longitudCarrera;
    }
    public synchronized void setGanador(String name) {
		if (this.ganador.equals(""))
			this.ganador=name;
	}
    private void inicializar() {
        for (int i = 0; i < 5; i++) {
            Corredor r = new Corredor("runner"+i, this);
            corredores.add(r);
        }
    }

    private void largada() throws InterruptedException {
        for (int i = 0; i < corredores.size(); i++) {
            exec.execute(corredores.get(i));
        }
        exec.shutdown();
        exec.awaitTermination(100000, TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) throws InterruptedException {
        new Carrera();
    }
}