package com.ijsolutions.Bus_Pass_Service.service

import com.ijsolutions.Bus_Pass_Service.model.CustomerRequest
import com.ijsolutions.Bus_Pass_Service.model.CustomerResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient('CUSTOMER-SERVICE')
interface CustomerHttpService {
    @PostMapping('/customer')
    ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest request)
    @GetMapping(value = '/customer/{customerId}', produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<CustomerResponse> getByCustomerId(@PathVariable(name = 'customerId') Long customerId)
}
