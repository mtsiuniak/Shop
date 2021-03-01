package mykhailo.tsiuniak.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor

@Entity
public class User {

    @Id
    private Long id;

    private String name;
    private String password;

    @OneToOne
    private Cart cart;

    @ManyToMany
    private List<Product> products = new ArrayList<>();
}
