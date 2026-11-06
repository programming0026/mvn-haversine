package com.juniverse.math;

/**
 * Cálculo de la distancia entre dos coordenadas geográficas.
 *
 * @author Java Universe
 */
public interface Distance {

    /**
     * Calcula la distancia entre dos puntos.
     * @param lat1 latitud del primer punto en grados
     * @param lon1 longitud del primer punto en grados
     * @param lat2 latitud del segundo punto en grados
     * @param lon2 longitud del segundo punto en grados
     * @return distancia en kilómetros
     */
    double calculateDistance(double lat1, double lon1, double lat2, double lon2);
}
