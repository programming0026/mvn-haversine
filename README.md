# Distancia entre coordenadas (Haversine y Karney)

Calcula la distancia entre dos puntos de la Tierra con dos métodos y permite comparar su precisión.

## Características

- **Haversine**: modelo esférico (radio 6371 km), rápido y suficiente para la mayoría de usos.
- **Karney** (biblioteca GeographicLib): modelo elipsoidal WGS84, de precisión milimétrica.
- Interfaz común `Distance` para intercambiar el cálculo.

## Requisitos

- JDK 21 y Maven 3.9 o superior.

## Compilar y ejecutar

```bash
mvn compile exec:java
```

## Notas

- Las coordenadas se expresan en grados decimales y el resultado en kilómetros.

## JAR ejecutable (fat jar)

```bash
mvn clean package
java -jar target/mvn-haversine-1.0-SNAPSHOT-launcher.jar
```

El archivo `-launcher.jar` incluye todas las dependencias.

## Licencia

Código de ejemplo de uso libre con fines educativos.
