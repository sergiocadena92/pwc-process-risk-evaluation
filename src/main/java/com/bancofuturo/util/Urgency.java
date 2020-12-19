package com.bancofuturo.util;

import java.util.EnumSet;

/**
 * User: sergio <br/>
 * Date: 12/18/20 <br/>
 * Time: 7:12 PM <br/>
 *
 * @author Sergio Cadena
 */
public enum Urgency {
    MUY_ALTA("Muy Alta", Range.of(31, 100)),
    ALTA("Alta", Range.of(21, 30)),
    MEDIA("Media", Range.of(10, 20)),
    BAJA("Baja", Range.of(0, 9));

    final String name;
    final Range range;

    Urgency(String name, Range range) {
        this.name = name;
        this.range = range;
    }

    public String getName() {
        return this.name;
    }

    public static Urgency getUrgency(int urgency) {
        return EnumSet.allOf(Urgency.class)
                .stream()
                .filter(urgencyEnum -> (urgency >= urgencyEnum.range.low && urgency <= urgencyEnum.range.high))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("El valor de urgencia no esta dentro de los rangos validos"));
    }

    static class Range {
        int low;
        int high;

        public Range(int low, int high) {
            this.low = low;
            this.high = high;
        }

        static Range of(int low, int high) {
            return new Range(low, high);
        }
    }
}
