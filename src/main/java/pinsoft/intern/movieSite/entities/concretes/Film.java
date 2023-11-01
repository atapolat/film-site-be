package pinsoft.intern.movieSite.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "films")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "movieDuration")
    private int movieDuration;

    @Column(name = "visionDate")
    private int visionDate;

    @Column(name = "leadRoles")
    private String leadRoles;

    @Column(name = "producer")
    private String producer;

    @Column(name = "director")
    private String director;

    @Column(name = "moviePoint")
    private int moviePoint;

    @ManyToOne
    @JoinColumn(name = "kind_id")
    private Kind kind;

}
