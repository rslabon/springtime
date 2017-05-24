package myspring.domain;

import lombok.*;

import javax.persistence.Entity;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Book extends AbstractEntity {

    private String title;
}
