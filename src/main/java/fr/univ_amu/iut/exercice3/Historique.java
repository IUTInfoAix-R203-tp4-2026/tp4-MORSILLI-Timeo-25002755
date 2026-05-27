package fr.univ_amu.iut.exercice3;

import java.util.ArrayList;
import java.util.List;

public class Historique {

    private final List<String> historique = new ArrayList<>();

    public void enregistrer(String element) {
        historique.add(element);
    }

    public List<String> asList() {
        return historique;
    }

    public String afficher() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Historique ---\n");
        for (String h : historique) {
            sb.append("- ").append(h).append("\n");
        }
        return sb.toString();
    }
}
