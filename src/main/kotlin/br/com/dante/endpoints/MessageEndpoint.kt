package br.com.dante.endpoints

import br.com.dante.MessageBody
import br.com.dante.MessageServiceGrpcKt
import br.com.dante.services.MessageService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import javax.inject.Singleton

@Singleton
class MessageEndpoint(val messageService: MessageService) : MessageServiceGrpcKt.MessageServiceCoroutineImplBase() {

    override fun messageExchange(requests: Flow<MessageBody>): Flow<MessageBody> {
        return flow {
            requests.collect { msg ->
                val responseMessage = messageService.messageExchange(msg)
                emit(responseMessage)
            }
        }
    }
}