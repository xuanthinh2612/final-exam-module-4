package codegymmodul4.finalexam.model;



import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 250)
    private String cityName;

    @NotNull
    @Min(1)
    private Double area;

    @NotNull
    @Min(1)
    private Long population;

    @NotNull
    @Min(1)
    private Double jdp;
    @NotNull
    @Size(min = 10, max = 1000)
    private String description;

    @ManyToOne
    private National national;

    public National getNational() {
        return national;
    }

    public void setNational(National national) {
        this.national = national;
    }

    public Province() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Double getJdp() {
        return jdp;
    }

    public void setJdp(Double jdp) {
        this.jdp = jdp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
