package com.ijsolutions.Bus_Pass_Service.model

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import lombok.Data

@EqualsAndHashCode
@ToString
@Data
class CustomerResponse {
    Long customerId
    String firstName
    String lastName
    Long contactNumber
}
