package m.e.c.r.model;

import javax.persistence.*;
@Entity
@Table(name = "cpus")
public class Cpu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "model")
    String model;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manufacturor_id", nullable = false)
    Manufacturor manufacturor;
    @Column(name = "cache_")
    float ram;
    @Column(name = "clock")
    float clock;
    @Column(name = "cores")
    int cores;

    @Column(name = "class_")
    int class_;
    public Long getId() {
        return id;
    }

    public int getClass_() {
        return class_;
    }

    public void setClass_(int class_) {
        this.class_ = class_;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Manufacturor getManufacturor() {
        return manufacturor;
    }

    public void setManufacturor(Manufacturor manufacturor) {
        this.manufacturor = manufacturor;
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    public float getClock() {
        return clock;
    }

    public void setClock(float clock) {
        this.clock = clock;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
