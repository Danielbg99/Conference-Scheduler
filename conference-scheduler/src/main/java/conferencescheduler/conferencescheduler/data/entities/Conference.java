package conferencescheduler.conferencescheduler.data.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Table(name = "conferences")
public class Conference extends BaseEntity {
    @Column(name = "conference_name")
    private String conferenceName;
    @Column(name = "description")
    private String description;
    @Column(name = "address")
    private String address;
    @Column(name = "time_frame")
    private LocalDateTime timeFrame;
    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinTable(name = "users_conferences",
            joinColumns = @JoinColumn(name = "conference_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_Id", referencedColumnName = "id"))
    private Set<User> users;

    @OneToOne  (mappedBy = "conference", targetEntity = Speaker.class)
    private Speaker speaker;

    @OneToOne(mappedBy = "conference", targetEntity = Hall.class)
    private Hall hall;



    public Conference() {
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(LocalDateTime timeFrame) {
        this.timeFrame = timeFrame;
    }
}
