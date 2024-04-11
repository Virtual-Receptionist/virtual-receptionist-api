package com.virtualreceptionist.model

import com.virtualreceptionist.constant.TableSchemaConstants.TABLE_NAME_ACCOMMODATION
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = TABLE_NAME_ACCOMMODATION)
data class Accommodation(

    @Id
    var ntakId: String = "",

    var name: String = "",

    var company: String = "",

    var vatNumber: String = "",

    var contact: String = "",

    var headquarters: String = "",

    var site: String = "",

    var phone: String = "",

    var email: String = "",
)
