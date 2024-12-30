package com.ijsolutions.Bus_Pass_Service.controller

import com.ijsolutions.Bus_Pass_Service.model.PassRequest
import com.ijsolutions.Bus_Pass_Service.model.PassResponse
import com.ijsolutions.Bus_Pass_Service.service.PassService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('pass')
class PassController {

    @Autowired
    PassService passService
    @PostMapping
    ResponseEntity<PassResponse> createPass(@RequestBody @Valid PassRequest passRequest) {
        def response = passService.createPass(passRequest)
        new ResponseEntity<>(response, HttpStatus.CREATED)
    }
}
