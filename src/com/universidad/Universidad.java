package com.universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<Programa> programas;

    public Universidad() {
        this.programas = new ArrayList<>();
    }

    public List<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(List<Programa> programas) {
        this.programas = programas;
    }
}
