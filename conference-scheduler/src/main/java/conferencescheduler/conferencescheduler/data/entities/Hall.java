package conferencescheduler.conferencescheduler.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "halls")
public class Hall extends BaseEntity{
    @Column(name = "hall_name")
    private String hallName;
    @Column(name = "capacity")
    private Integer capacity;

    public Hall() {
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
