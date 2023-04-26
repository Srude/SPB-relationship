package com.spb.relationship.data.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "product")
public class ProductEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;
    @Column(nullable = false)
    private Integer stock;


    @OneToOne(mappedBy = "product")
    @ToString.Exclude
    private ProductDetail productDetail;


    @ManyToOne
    @JoinColumn(name = "provider_id")
    @ToString.Exclude
    private ProviderEntity provider;

    @ManyToMany
    @ToString.Exclude
    private List<ProducerEntity> producers = new ArrayList<>();

    public void addProducer(ProducerEntity producer) {
        this.producers.add(producer);
    }

}

