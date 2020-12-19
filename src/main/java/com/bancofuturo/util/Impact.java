package com.bancofuturo.util;

/**
 * User: sergio <br/>
 * Date: 12/18/20 <br/>
 * Time: 7:08 PM <br/>
 *
 * @author Sergio Cadena
 */
public enum Impact {
    ALTO("Alto", 3),
    MEDIO("Medio", 2),
    BAJO("Bajo", 1);

    final String name;
    final int value;

    Impact(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
