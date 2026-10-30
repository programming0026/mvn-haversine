package com.juniverse.math;

/**
 * Compara Haversine y Karney con las distancias Ciudad de México – Guadalajara y Ciudad de México – Nueva York.
 *
 * @author ajuar
 */
public class Main {

    /**
     * Punto de entrada.
     * @param args no se usan
     */
    public static void main(String[] args) {
        Distance haversine = new HaversineCalculator();
        Distance karney = new GeodesicCalculator();

        // Coordenadas de ejemplo: Ciudad de México y Guadalajara
        double lat1 = 19.4326; // Ciudad de México
        double lon1 = -99.1332;
        double lat2 = 20.6597; // Guadalajara
        double lon2 = -103.3496;

        double distance = haversine.calculateDistance(lat1, lon1, lat2, lon2);

        System.out.printf("Distancia entre Ciudad de Mexico y Guadalajara:\n");
        System.out.printf("%.2f kilometros%n", distance);

        lat1 = 19.4326;
        lon1 = -99.1332;
        lat2 = 40.7128;
        lon2 = -74.0060;

        distance = haversine.calculateDistance(lat1, lon1, lat2, lon2);
        System.out.printf("Distancia entre Ciudad de Mexico y Nueva York:\n");
        System.out.printf("%.2f kilometros%n", distance);

        lat1 = 19.4326;
        lon1 = -99.1332;
        lat2 = 40.7128;
        lon2 = -74.0060;

        distance = karney.calculateDistance(lat1, lon1, lat2, lon2);
        System.out.printf("Distancia entre Ciudad de Mexico y Nueva York:\n");
        System.out.printf("%.2f kilometros%n", distance);

        lat1 = 19.4326; // Ciudad de México
        lon1 = -99.1332;
        lat2 = 20.6597; // Guadalajara
        lon2 = -103.3496;

        distance = karney.calculateDistance(lat1, lon1, lat2, lon2);

        System.out.printf("Distancia entre Ciudad de Mexico y Guadalajara:\n");
        System.out.printf("%.2f kilometros%n", distance);
    }
}
