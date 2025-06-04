package teaming.Teaming.Profile.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Getter
@SuperBuilder
@NoArgsConstructor
@Table(name = "posts")
@Setter
@Entity
public class Profiles {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //    @Column(nullable = false)
//    private String title;
    @Column(nullable = false)
    private String circle;
    @Setter
    private String major;
}
