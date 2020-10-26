package com.sunil.atas.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Hello {

    @JsonProperty("value")
    private String value;
}
