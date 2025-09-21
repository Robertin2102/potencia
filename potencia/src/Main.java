public class Main {
    public static int potencia(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * potencia(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exp = 3;
        int resultado = potencia(base, exp);
        System.out.println(base + " elevado a " + exp + " = " + resultado);
    }
}