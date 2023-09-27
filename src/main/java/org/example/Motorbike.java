package org.example;

import java.util.Objects;

public class Motorbike {
    private String kindOfMotorbike;

    public Motorbike(String kindOfMotorbike) {
        this.kindOfMotorbike = kindOfMotorbike;
    }

    public String getKindOfMotorbike() {
        return kindOfMotorbike;
    }

    public void setKindOfMotorbike(String kindOfMotorbike) {
        this.kindOfMotorbike = kindOfMotorbike;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "kindOfMotorbike='" + kindOfMotorbike + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorbike motorbike = (Motorbike) o;
        return Objects.equals(kindOfMotorbike, motorbike.kindOfMotorbike);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kindOfMotorbike);
    }
}
