package edu.dhairyak.mySplitwise.group;

import edu.dhairyak.mySplitwise.user.User;
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
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private int group_id;

    @Nonnull
    @Column(name = "group_name",nullable = false)
    private String group_name;

    @Column(name = "users")
    private User users;
}
