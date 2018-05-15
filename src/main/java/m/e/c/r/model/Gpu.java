package m.e.c.r.model;
import javax.persistence.*;
@Entity
@Table(name = "gpus")
public class Gpu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "model")
    String model;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manufacturor_id", nullable = false)
    Manufacturor manufacturor;
    @Column(name = "ram")
    int ram;
    @Column(name = "clock")
    float clock;
    @Column(name = "cuda_cores")
    int cudaCores;

    @Column(name = "class_")
    int class_;
    public Gpu() {
    }

    public Manufacturor getManufacturor() {
        return manufacturor;
    }

    public void setManufacturor(Manufacturor manufacturor) {
        this.manufacturor = manufacturor;
    }

    public int getClass_() {
        return class_;
    }

    public void setClass_(int class_) {
        this.class_ = class_;
    }

    public Long getId() {
        return id;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getClock() {
        return clock;
    }

    public void setClock(float clock) {
        this.clock = clock;
    }

    public int getCudaCores() {
        return cudaCores;
    }

    public void setCudaCores(int cudaCores) {
        this.cudaCores = cudaCores;
    }
}
