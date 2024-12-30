package com.ijsolutions.Bus_Pass_Service.service

import com.ijsolutions.Bus_Pass_Service.domain.Pass
import com.ijsolutions.Bus_Pass_Service.model.CustomerResponse
import com.ijsolutions.Bus_Pass_Service.model.PassRequest
import com.ijsolutions.Bus_Pass_Service.model.PassResponse
import com.ijsolutions.Bus_Pass_Service.repository.PassRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@Slf4j
class PassService {

    @Autowired
    PassRepository passRepository

    @Autowired
    CustomerHttpService customerHttpService

    PassResponse createPass(PassRequest passRequest) {
        log.info 'createPass'
        CustomerResponse customerResponse = customerHttpService.getByCustomerId(passRequest.contactNumber).getBody()
        log.info 'customerResponse={}', customerResponse
        PassResponse passResponse

        if(customerResponse.customerId) {
            Pass pass = new Pass()
            pass.customerId = customerResponse.customerId
            pass.expireDate = new Date()
            pass.renewalDate = new Date()
            pass.status = 'ACTIVE'
            pass.passUid = UUID.randomUUID()
            Pass savedPass = passRepository.save(pass)
            passResponse = convertToResp(savedPass)
        }
        passResponse
    }

    private PassResponse convertToResp(Pass pass) {
        PassResponse passResponse = new PassResponse()
        BeanUtils.copyProperties(pass, passResponse)
        passResponse
    }
}
