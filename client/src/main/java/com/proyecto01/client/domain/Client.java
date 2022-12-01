package com.proyecto01.client.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@ToString
@EqualsAndHashCode(of = {"identityNumber"})
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "client")
public class Client {

    @Id
    private String id;

    @NotNull
    @Indexed(unique = true)
    private String identityNumber;

    @Null
    private String name;

    @Null
    private String lastName;

    @Null
    private String businessName;

    @Null
    private String direction;

    @NotNull
    @Indexed(unique = true)
    private String email;

    @NotNull
    @Indexed(unique = true)
    private String phoneNumber;

    @NotNull
    private LocalDate registrationDate;

    @NotNull
    private String type;
}
