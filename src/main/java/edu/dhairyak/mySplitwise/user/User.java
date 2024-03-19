package edu.dhairyak.mySplitwise.user;

import edu.dhairyak.mySplitwise.group.Group;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int user_id;

    @Nonnull
    @Column(name = "name")
    private String name;

    @Nonnull
    @Column(name = "email")
    private String email;

    private Group group;


}
