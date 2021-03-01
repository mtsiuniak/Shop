package mykhailo.tsiuniak.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor

@Entity
public class SubCategory {

    @Id
    private Long id;

    private String name;
    private Double rating;


    @OneToMany(mappedBy = "subCategory")
    private List<Product> product = new ArrayList<>();

    @ManyToOne
    private Category category;

}
