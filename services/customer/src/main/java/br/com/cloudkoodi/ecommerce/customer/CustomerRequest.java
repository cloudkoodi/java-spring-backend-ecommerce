package br.com.cloudkoodi.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "Customer first name is required")
        String firstName,
        @NotNull(message = "Customer last name is required")
        String lastName,
        @NotNull(message = "Customer e-mail is required")
        @Email(message = "Customer e-mail is not a valid Email address")
        String email,
        Address address
) {

}
