package com.zuhlke.openApiDemo.service

import com.zuhlke.openApiDemo.controller.InventoryApiDelegate
import com.zuhlke.openApiDemo.model.InventoryItem
import com.zuhlke.openApiDemo.model.Manufacturer
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.time.OffsetDateTime
import java.util.UUID

@Service
class InventoryService: InventoryApiDelegate {
    override fun searchInventory(searchString: String?, skip: Int?, limit: Int?): ResponseEntity<MutableList<InventoryItem>> {
        val result = mutableListOf(
                InventoryItem().apply {
                    id = UUID.randomUUID()
                    name = "chocolate"
                    releaseDate = OffsetDateTime.now()
                    manufacturer = Manufacturer().apply {
                        name = "HKMC"
                        homePage = "google.com"
                        phone = "12345678"
                    }
                }
        )

        return ResponseEntity.ok(result)
    }
}