package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalResponse(@JsonPropertyDescription("This is the city name") String answer,
                                 @JsonPropertyDescription("This is the city population") String population,
                                 @JsonPropertyDescription("This is the city's region") String region,
                                 @JsonPropertyDescription("This is the currency used in the city") String currency) {
}
