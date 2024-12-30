package com.ijsolutions.Bus_Pass_Service.model

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
@ToString
class PassResponse {
    Long passId
    String passUid
    Date renewalDate
    Date expireDate
    String status
    Long customerId
}
