package pointman.springmvc_jpa.hellojpa.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Team {
    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;
    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();
}
