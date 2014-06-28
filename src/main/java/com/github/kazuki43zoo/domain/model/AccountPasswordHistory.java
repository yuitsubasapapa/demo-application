package com.github.kazuki43zoo.domain.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.joda.time.DateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountPasswordHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    private String accountUuid;
    private String password;
    private DateTime createdAt;

}