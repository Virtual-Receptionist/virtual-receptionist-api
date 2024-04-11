package com.virtualreceptionist.service

import com.virtualreceptionist.model.Accommodation
import com.virtualreceptionist.repository.AccommodationRepository
import org.springframework.stereotype.Service

@Service
class AccommodationService(private val accommodationRepository: AccommodationRepository) {

    fun getAccommodation(): Accommodation {
        return accommodationRepository.findAll().first()
    }
}
