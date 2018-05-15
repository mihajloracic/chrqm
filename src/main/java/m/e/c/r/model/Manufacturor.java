package m.e.c.r.model;


import javax.persistence.*;

@Entity
@Table(name = "manufacturors")
public class Manufacturor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "name_")
    String name;
    public Manufacturor(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
