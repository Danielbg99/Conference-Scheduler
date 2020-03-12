package conferencescheduler.conferencescheduler.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "sessions")
public class Session extends BaseEntity{
    @Column(name = "session_name")
    private String sessionName;
    @Column(name = "description")
    private String description;
    @Column(name = "time_frame")
    private LocalDateTime timeFrame;

    public Session() {
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(LocalDateTime timeFrame) {
        this.timeFrame = timeFrame;
    }
}
