package Tema6.POO3;

public interface IAtaqueAvanzado {
    void lanzar();
    double[] coste(); // [0] Esfuerzo físico, [1] Maná
    int[] danioInfligido(); // [0] Daño físico, [1] Daño mágico
}
