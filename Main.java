public class Main {
    public static void main(String[] args) {
        Ingresso ingresso1 = new IngressoInteira(1, null);
        Ingresso ingresso2 = new IngressoEstudante(2, null);
        Ingresso ingresso3 = new IngressoIdoso(3, null);
        Ingresso ingresso4 = new IngressoPCD(4, null);
        ingresso2.getNr();
    }
}
