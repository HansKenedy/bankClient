package com.proyecto01.client.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientModel {
    @JsonIgnore
    private String id;

    @NotBlank(message="Identity Number cannot be null or empty")
    private String identityNumber;

    //NotBlank(message="Name cannot be null or empty")
    private String name;

    //@NotBlank(message="LastName cannot be null or empty")
    private String lastName;

    //@NotBlank(message="BusinessName cannot be null or empty")
    private String businessName;

    @NotBlank(message="Direction cannot be null or empty")
    private String direction;

    @NotBlank(message="Email cannot be null or empty")
    private String email;

    @NotBlank(message="PhoneNumber cannot be null or empty")
    private String phoneNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate registrationDate;

    @NotBlank(message="Type cannot be null or empty")
    private String type;
}
