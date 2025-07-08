package com.YummiGo.Model;

import com.YummiGo.Dtos.RestaurantDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String fullName;

    private String email;
    private String password;

    private USER_ROLE role;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnore
    private List<Order> orders=new ArrayList<>();

    @ElementCollection
    private List<RestaurantDto> favourites=new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Address> addresses=new ArrayList<>();
}
