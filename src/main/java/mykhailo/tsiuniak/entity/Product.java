package mykhailo.tsiuniak.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor

@Entity
public class Product {

    @Id
    private Long id;

    private String name;
    private Long price;
    private String description;

    @ManyToOne
    private SubCategory subCategory;

    @ManyToMany(mappedBy ="products")
    private List<User> users = new ArrayList<>();

    @ManyToMany(mappedBy = "productss")
    private List<Order> orders = new ArrayList<>();



}
