package com.YummiGo.Model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.metamodel.mapping.ForeignKeyDescriptor;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItem {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Food food;

    private int quantity;
    private Long totalPrice;

    private List<String> ingredients;
}
