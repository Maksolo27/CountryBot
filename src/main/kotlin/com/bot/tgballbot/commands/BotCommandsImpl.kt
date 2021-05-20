package com.bot.tgballbot.commands

import com.bot.tgballbot.domain.Country
import com.bot.tgballbot.repository.CountryRepository
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@NoArgsConstructor
class BotCommandsImpl() : BotCommands {

    @Autowired
    private lateinit var repository: CountryRepository

    override fun getCountryByName(countryName: String): Country {
        return repository.getCountryByName(countryName)
    }

    override fun getCountryByPopulation(population: Int): Country {
        return repository.getCountryByPopulation(population)
    }

    override fun getCountryByGNP(GNP: Int): Country {
        return repository.getCountryByGNP(GNP)
    }

    override fun getCountryByHeadOfState(headOfState: String): Country {
        return repository.getCountryByHeadOfState(headOfState)
    }


}