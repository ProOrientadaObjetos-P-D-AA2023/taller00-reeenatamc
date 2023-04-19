public class Demo {
    public static void main(String[] args) {
        String mensaje = "Loja, una ciudad llena de arte y naturaleza con ";
        int valor = 400322;
        System.out.printf("%s%d\n", mensaje, valor);
    }

    public class Mensaje {
        public String obtenerMensaje() {
            return "Loja, una ciudad llena de arte y naturaleza";
        }
    }

    public class Valor {
        public int obtenerValor() {
            return 400322;
        }
    }
}
