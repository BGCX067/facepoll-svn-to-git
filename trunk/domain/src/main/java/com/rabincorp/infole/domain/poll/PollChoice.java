package com.rabincorp.infole.domain.poll;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Isak Rabin
 */
@Entity(name="poll_options")
public class PollChoice implements Serializable {

    private static final long serialVersionUID = -7014166388665102441L;
    @Id
    private Long id;
    private String title;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
