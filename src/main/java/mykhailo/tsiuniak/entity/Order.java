package mykhailo.tsiuniak.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor

@Entity
public class Order {

    @Id
    private Long id;

    private Integer count;

    @ManyToMany
    private List<Product> productss = new ArrayList<>();
}
