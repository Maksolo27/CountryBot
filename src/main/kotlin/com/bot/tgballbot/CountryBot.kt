package com.bot.tgballbot


import com.bot.tgballbot.commands.BotCommands
import com.bot.tgballbot.domain.Country
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext
import org.telegram.telegrambots.ApiContextInitializer

@SpringBootApplication
class CountryBot

fun main(args: Array<String>) {
    ApiContextInitializer.init()
    runApplication< CountryBot>(*args)
    val ctx: ConfigurableApplicationContext = SpringApplication.run(CountryBot::class.java)
    val service: BotCommands = ctx.getBean(BotCommands::class.java)
    val country: Country =  service.getCountryByGNP(1941)
    print(country.toString())
}
