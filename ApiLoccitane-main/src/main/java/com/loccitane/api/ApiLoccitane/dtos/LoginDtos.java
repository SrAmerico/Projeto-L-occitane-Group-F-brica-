package com.loccitane.api.ApiLoccitane.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginDtos(
        @NotBlank @Email String email,
        @NotBlank String senha
) {}
