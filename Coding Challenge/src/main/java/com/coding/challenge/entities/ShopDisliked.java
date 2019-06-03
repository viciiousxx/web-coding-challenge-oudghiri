package com.coding.challenge.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("D")
public class ShopDisliked extends Shop {

    @Column(name = "expired_timeout")
    private LocalDateTime expiredTime;

    public ShopDisliked(@NotNull String name,@NotNull Coordinate coordinate, @NotNull String adresse, @NotNull String uri, @NotNull boolean liked, LocalDateTime expiredTime) {
        super(name, adresse, uri, liked, coordinate);
        this.expiredTime = expiredTime;
    }

    public ShopDisliked getExpiredTime() {
        this.expiredTime = expiredTime;
        return this;
    }

    public void setExpiredTime(LocalDateTime expiredTime) {
        this.expiredTime = expiredTime;
    }
}
