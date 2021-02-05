package com.nasmas.vsnback.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "person_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @Column(name = "city")
    private String city;

    @Column(name = "education")
    private String education;

    @Column(name = "site")
    private String site;

    @Column(name = "avatar")
    private String avatar;
}
