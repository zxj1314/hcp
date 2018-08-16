package com.hdvon.rcp.domain.sample;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by Toby on 2017/6/26.
 */
@Getter
@Setter
@ToString
@Builder
public class City implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String state;

    private String country;
}
