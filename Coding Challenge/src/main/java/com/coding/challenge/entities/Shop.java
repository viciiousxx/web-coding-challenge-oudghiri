package com.coding.challenge.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "",length = 1,discriminatorType = DiscriminatorType.STRING)
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name_shop")
    private String name;

    @NotNull
    @Column(name  = "adresse")
    private String adresse;

    @NotNull
    @Column(name  = "uri")
    private String uri;

    @NotNull
    @Column(name = "liked")
    private boolean liked;

    @NotNull
    @Column(name  = "coordinate_id")
    @OneToOne
    private Coordinate coordinate;

    public Shop(@NotNull String name, @NotNull String adresse, @NotNull String uri, @NotNull boolean liked, @NotNull Coordinate coordinate) {
        this.name = name;
        this.adresse = adresse;
        this.uri = uri;
        this.liked = liked;
        this.coordinate = coordinate;
    }

    public Shop getCoordinate() {
        this.coordinate =  coordinate;
        return this;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Shop isLiked() {
        this.liked = liked;
        return this;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public Shop() {
    }

    public Shop getId() {
        this.id = id;
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Shop getName() {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shop getAdresse() {
        this.adresse = adresse;
        return this;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Shop getUri() {
        this.uri = uri;
        return this;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
