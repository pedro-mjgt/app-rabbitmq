package pe.edu.cibertec.app_rabbitmq.enqueue.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitConsumer {

    @RabbitListener(queues = "pedido_queue")
    public void consumirMensaje(String mensaje) {
        log.info("Mensaje recibido: " + mensaje + ". Inicio de operacion");
    }

}
