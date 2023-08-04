package com.myt.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private long empID;
    private String empFirstName;
    private String empLastName;
    private String empEmail;
}
