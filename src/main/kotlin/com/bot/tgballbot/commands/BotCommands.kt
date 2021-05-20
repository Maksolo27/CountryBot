package com.bot.tgballbot.commands

import com.bot.tgballbot.domain.Country

interface BotCommands {
    fun getCountryByName(countryName: String): Country

    fun getCountryByPopulation(population: Int): Country

    fun getCountryByGNP(GNP: Int): Country

    fun getCountryByHeadOfState(headOfState: String): Country
}