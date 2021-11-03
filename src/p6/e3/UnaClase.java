package p6.e3;

@Servidor(direccion = "localhost", archivo = "test.txt", puerto = 8960)
public class UnaClase {
    @Invocar
    public static void metodo1(){
        System.out.println("Hay un requerimiento. Se invoca metodo1");
    }

    @Invocar
    public static void metodo2(){
        System.out.println("Hay otro requerimiento. Se invoca metodo2");
    }

    public static void noInvocado(){
        System.out.println("A mi nadie me llama :(");
    }
}
