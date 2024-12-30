package com.ijsolutions.Bus_Pass_Service.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.SequenceGenerator

@Entity
class Pass {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pass_seq")
    @SequenceGenerator(name = "pass_seq", sequenceName = "pass_seq", allocationSize = 1)
    Long passId
    String passUid
    Date renewalDate
    Date expireDate
    String status
    Long customerId
}
