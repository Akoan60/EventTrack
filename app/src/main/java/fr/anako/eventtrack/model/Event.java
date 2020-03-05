package fr.anako.eventtrack.model;

/**
 * Classe modèle pour les évènements a afficher dans l'application
 * @author Anako
 */

public class Event {

    private String mName;
    private String mDescription;

    public Event(String name, String description) {
        mName = name;
        mDescription = description;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
