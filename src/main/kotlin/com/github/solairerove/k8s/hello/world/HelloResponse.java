package com.github.solairerove.k8s.hello.world;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

import static lombok.AccessLevel.PRIVATE;

/**
 * Hello world response entity.
 */
@Getter
@RequiredArgsConstructor(access = PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloResponse implements Serializable {

    private static final long serialVersionUID = -7411895544769066684L;

    @JsonProperty(value = "id")
    private final Integer id;

    @JsonProperty(value = "content")
    private final String content;

    /**
     * Static constructor of immutable object.
     *
     * @param id   and atomic id.
     * @param name hello string name
     * @return immutable {@link HelloResponse} model.
     */
    public static HelloResponse aHelloResponse(final Integer id, final String name) {
        return new HelloResponse(id, "Hello " + name);
    }
}
