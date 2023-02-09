package com.scaziti.Catapi.cat;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import org.springframework.hateoas.server.core.Relation;


@Getter
@ToString(callSuper = true)
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Relation(value = "cat", collectionRelation = "cats")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private String color;
    private LocalDate birthDate;

}
