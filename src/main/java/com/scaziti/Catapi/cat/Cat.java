package com.scaziti.Catapi.cat;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import org.springframework.hateoas.server.core.Relation;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


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
    @NotEmpty
    private String name;
    @NotEmpty
    private Integer age;
    @NotEmpty
    private String gender;
    @NotEmpty
    private String color;
    @NotNull
    private LocalDate birthDate;

}
