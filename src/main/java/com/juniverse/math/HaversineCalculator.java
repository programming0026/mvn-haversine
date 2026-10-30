package com.juniverse.math;

/**
 * Distancia sobre una esfera de 6371 km con la fórmula de Haversine. Error típico de hasta ~0.5 %.
 *
 * @author ajuar
 */
public class HaversineCalculator implements Distance {

    // Radio de la Tierra en kilómetros
    private static final double EARTH_RADIUS_KM = 6371.0;

    /**
     * Calcula la distancia entre dos puntos geográficos usando la fórmula de
     * Haversine
     *
     * @param lat1 Latitud del primer punto en grados
     * @param lon1 Longitud del primer punto en grados
     * @param lat2 Latitud del segundo punto en grados
     * @param lon2 Longitud del segundo punto en grados
     * @return Distancia en kilómetros
     */
    @Override
    public double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        // Convertir grados a radianes
        double lat1Rad = Math.toRadians(lat1);
        double lon1Rad = Math.toRadians(lon1);
        double lat2Rad = Math.toRadians(lat2);
        double lon2Rad = Math.toRadians(lon2);

        // Diferencias
        double deltaLat = lat2Rad - lat1Rad;
        double deltaLon = lon2Rad - lon1Rad;

        // Aplicar la fórmula de Haversine
        double a = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2)
                + Math.cos(lat1Rad) * Math.cos(lat2Rad)
                * Math.sin(deltaLon / 2) * Math.sin(deltaLon / 2);

        a = Math.min(1.0, a); // por redondeo puede pasar de 1 en puntos antípodas y sqrt(1 - a) daría NaN
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Calcular la distancia
        double distance = EARTH_RADIUS_KM * c;

        return distance;
    }
}
