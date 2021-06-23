package bdd;

public class Triangulo {

    public static String verificaTriangulo(int a, int b, int c) {
        if (ehValido(a, b, c)) {
            return descobreQualTriangulo(a, b, c);
        }
        return "Nao eh um triangulo";
    }

    public static String descobreQualTriangulo(int a, int b, int c) {
        if (ehEquilatero(a, b, c)) {
            return "O triangulo eh equilatero";
        } else if (ehIsosceles(a, b, c)) {
            return "O triangulo eh isosceles";
        } else {
            return "O triangulo eh escaleno";
        }
    }

    private static boolean ehValido(int a, int b, int c) {
        return (a + b > c && b + c > a && a + c > b);
    }

    private static boolean ehEquilatero(int a, int b, int c) {
        return (a == b && b == c);
    }

    private static boolean ehIsosceles(int a, int b, int c) {
        return (a == b || b == c || a == c);
    }

}