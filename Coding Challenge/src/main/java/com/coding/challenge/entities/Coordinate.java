package com.coding.challenge.entities;

import javax.persistence.*;

@Entity
@Table(name = "Coordinate")
public class Coordinate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long positionX;

    private Long positionY;

    public Coordinate(Long positionX, Long positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Coordinate() {
    }

    public Coordinate getId() {
        this.id = id;
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Coordinate getPositionX() {
        this.positionX =  positionX;
        return this;
    }

    public void setPositionX(Long positionX) {
        this.positionX = positionX;
    }

    public Coordinate getPositionY() {
        this.positionY = positionY;
        return this;
    }

    public void setPositionY(Long positionY) {
        this.positionY = positionY;
    }
}
