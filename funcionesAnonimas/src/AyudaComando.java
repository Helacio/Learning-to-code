public class AyudaComando implements Comando{

    @Override
    public String nombre() {
        return "ayuda";
    }

    @Override
    public String descripcion() {
        return "muestra los parametros y la forma de usar.";
    }
}
