package br.com.dante.services

import br.com.dante.MessageBody
import java.util.*
import javax.inject.Singleton

@Singleton
class MessageService {

    fun messageExchange(request: MessageBody) : MessageBody {
        val messageBody = MessageBody.newBuilder()
            .setId(request.id.plus(1))
            .setMessage("Recebido com sucesso: ${request.uuid}")
            .setFrom("Server")
            .setTo("Client")
            .setUuid(UUID.randomUUID().toString())
            .build();
        return messageBody;
    }

}