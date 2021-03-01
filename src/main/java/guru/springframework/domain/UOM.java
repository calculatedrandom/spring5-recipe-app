package guru.springframework.domain;

import javax.persistence.*;

@Entity
public class UOM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String description;
}
