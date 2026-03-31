import java.sql.SQLOutput;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void imprimir(Comando cmd){
        System.out.println(cmd.nombre() +  ":" + cmd.descripcion());
    }
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Hola");
        };

        new Thread(() -> {
            System.out.println("Hola");
        });

        Comando ayuda = new AyudaComando();
        ayuda.nombre();
        ayuda.descripcion();
        imprimir(ayuda);

        //Usando clases anonimas
        Comando opciones = new Comando(){

            @Override
            public String nombre() {
                return "opciones";
            }

            @Override
            public String descripcion() {
                return "muestra las opciones del programa";
            }
        };
        imprimir(opciones);

        //Lambdas
        Predicate<String> esMayusculas = (String str) -> str.toUpperCase().equals(str);
        if(esMayusculas.test("Hola")){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }

}