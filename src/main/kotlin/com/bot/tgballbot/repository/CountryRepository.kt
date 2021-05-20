package com.bot.tgballbot.repository

import com.bot.tgballbot.domain.Country
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CountryRepository : JpaRepository<Country, Long>, CrudRepository<Country, Long> {

    fun getCountryByGNP(GNP: Int): Country

    fun getCountryByName(name: String): Country

    fun getCountryByPopulation(population: Int): Country

    fun getCountryByHeadOfState(headOfState: String): Country
}