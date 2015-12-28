package com.rabincorp.infole.domain.user;

import com.rabincorp.infole.domain.poll.PollQuestion;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author irabin
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1555069844644333380L;

    @Id
    private Long id;
    
    @OneToMany(mappedBy = "owner")
    private List<PollQuestion> pollQuestions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PollQuestion> getPollQuestions() {
        return pollQuestions;
    }

    public void setPollQuestions(List<PollQuestion> pollQuestions) {
        this.pollQuestions = pollQuestions;
    }
    
    
}
