package conferencescheduler.conferencescheduler.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

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
