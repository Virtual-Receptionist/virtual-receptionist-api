package com.virtualreceptionist.repository

import com.virtualreceptionist.model.Accommodation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccommodationRepository : JpaRepository<Accommodation, String>
