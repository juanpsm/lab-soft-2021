package p8.e3;

public class Corredor implements Runnable {
    private String name;
    private Carrera carrera;
    private String distanciaRecorrida = "";

    public Corredor(String name, Carrera carrera) {
        this.name = name;
        this.carrera = carrera;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "| "+ name + " |";
    }

    @Override
    public void run() {
        Monitor m = Monitor.INSTANCE;
        for (int i = 0; i < carrera.getLongitudCarrera(); i++) {
                distanciaRecorrida += "-";
                m.permiso(this + distanciaRecorrida);
                carrera.setGanador(this.name);
        }
    }
}
