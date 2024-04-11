package com.virtualreceptionist.controller

import com.virtualreceptionist.model.Accommodation
import com.virtualreceptionist.service.AccommodationService
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val accommodationService: AccommodationService) {

    @QueryMapping(name = "accommodation")
    fun accommodation(): Accommodation {
        return accommodationService.getAccommodation()
    }
}
