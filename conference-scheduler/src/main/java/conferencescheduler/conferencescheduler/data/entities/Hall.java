package conferencescheduler.conferencescheduler.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "halls")
public class Hall extends BaseEntity{
    @Column(name = "hall_name")
    private String hallName;
    @Column(name = "capacity")
    private Integer capacity;

    @OneToOne(optional = false)
    @JoinColumn(name = "conference_id", referencedColumnName = "id")
    private Conference conference;

    @OneToOne
    @JoinColumn(name = "session_id", referencedColumnName = "id")
    private Session session;

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
