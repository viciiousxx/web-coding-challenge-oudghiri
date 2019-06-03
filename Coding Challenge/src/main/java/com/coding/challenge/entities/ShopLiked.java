package com.coding.challenge.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("L")
public class ShopLiked extends Shop {

    public ShopLiked(@NotNull String name, @NotNull String adresse, @NotNull String uri, @NotNull boolean liked) {
        super(name, adresse, uri, liked);
    }
}