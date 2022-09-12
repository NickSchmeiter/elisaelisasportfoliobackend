package art.elisaportfoliobackend.web.api;

import java.awt.*;


public class Painting {
    private long id;
    private String name;
    private String groesse;
    private String material;
    private String description;
    private byte[] picture;

    public Painting(long id, String name, String groesse, String material, String description, byte[] picture) {
        this.id = id;
        this.name = name;
        this.groesse = groesse;
        this.material = material;
        this.description = description;
        this.picture = picture;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroesse() {
        return groesse;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}
