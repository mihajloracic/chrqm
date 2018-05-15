package m.e.c.r.model;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "name_")
    String nameVal;
    @Column(name = "mgc")
    int minimalGpuClass;
    @Column(name = "rgc")
    int recommendedGpuClass;
    @Column(name = "mcc")
    int minimalCpuClass;
    @Column(name = "rcc")
    int recommnedCpuClass;
    @Column(name = "mr")
    int minRam;
    @Column(name = "rr")
    int recommendedRam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameVal() {
        return nameVal;
    }

    public void setNameVal(String nameVal) {
        this.nameVal = nameVal;
    }

    public int getMinimalGpuClass() {
        return minimalGpuClass;
    }

    public void setMinimalGpuClass(int minimalGpuClass) {
        this.minimalGpuClass = minimalGpuClass;
    }

    public int getRecommendedGpuClass() {
        return recommendedGpuClass;
    }

    public void setRecommendedGpuClass(int recommendedGpuClass) {
        this.recommendedGpuClass = recommendedGpuClass;
    }

    public int getMinimalCpuClass() {
        return minimalCpuClass;
    }

    public void setMinimalCpuClass(int minimalCpuClass) {
        this.minimalCpuClass = minimalCpuClass;
    }

    public int getRecommnedCpuClass() {
        return recommnedCpuClass;
    }

    public void setRecommnedCpuClass(int recommnedCpuClass) {
        this.recommnedCpuClass = recommnedCpuClass;
    }

    public int getMinRam() {
        return minRam;
    }

    public void setMinRam(int minRam) {
        this.minRam = minRam;
    }

    public int getRecommendedRam() {
        return recommendedRam;
    }

    public void setRecommendedRam(int recommendedRam) {
        this.recommendedRam = recommendedRam;
    }
}
