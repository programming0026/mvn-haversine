package com.juniverse.math;

import net.sf.geographiclib.Geodesic;
import net.sf.geographiclib.GeodesicData;

/**
 * Distancia sobre el elipsoide WGS84 con el algoritmo de Karney (GeographicLib); más precisa que Haversine.
 *
 * @author Java Universe
 */
public class GeodesicCalculator implements Distance {

    /**
     * Distancia geodésica sobre WGS84.
     * @return distancia en kilómetros
     */
    @Override
    public double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        GeodesicData result = Geodesic.WGS84.Inverse(lat1, lon1, lat2, lon2);

        return result.s12 * 0.001;
    }
}
