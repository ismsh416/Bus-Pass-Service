package com.ijsolutions.Bus_Pass_Service.repository

import com.ijsolutions.Bus_Pass_Service.domain.Pass
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PassRepository extends JpaRepository<Pass, Long>{

}