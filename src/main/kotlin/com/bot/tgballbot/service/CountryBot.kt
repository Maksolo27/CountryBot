import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow
import java.io.File
import java.io.InputStream

@Service
class CountryBot : TelegramLongPollingBot() {

        private val botName: String = "MaksFootbolBot"
        private val token: String = readToken()

        override fun getBotUsername(): String = botName

        override fun getBotToken(): String = token

        private fun readToken(): String {
            val inputStream: InputStream = File("C:\\Users\\maxim\\IdeaProjects\\tokenfoot").inputStream()
            val inputString = inputStream.bufferedReader().use { it.readText() }
            return inputString
        }

        override fun onUpdateReceived(update: Update) {
            if (update.hasMessage()) {
                val message = update.message
                val chatId = message.chatId
                val responseText = if (message.hasText()) {
                    val messageText = message.text
                    when {
                        messageText == "/start" -> "Привет"
                        messageText.startsWith("Кнопка ") -> "Вы нажали кнопку"
                        else -> "Вы написали: *$messageText*"
                    }
                } else {
                    "Я понимаю только текст"
                }
                sendNotification(chatId, responseText)
            }
        }

        private fun sendNotification(chatId: Long, responseText: String) {
            val responseMessage = SendMessage(chatId, responseText)
            responseMessage.setParseMode("Markdown")
            responseMessage.replyMarkup = getReplyMarkup(
                listOf(
                    listOf("Countries by GNP", "Countries by Population"),
                    listOf("Кнопка 3", "Кнопка 4")
                )
            )
            execute(responseMessage)
        }

        private fun getReplyMarkup(allButtons: List<List<String>>): ReplyKeyboardMarkup {
            val markup = ReplyKeyboardMarkup()
            markup.keyboard = allButtons.map { rowButtons ->
                val row = KeyboardRow()
                rowButtons.forEach { rowButton -> row.add(rowButton) }
                row
            }
            return markup
        }
    }