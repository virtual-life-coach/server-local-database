package vlc.common.connectors;

import vlc.common.to.TelegramMessageTO;
import vlc.common.util.Constants;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Telegram {

    public static boolean sendMessage(String chatId, String message) {
        TelegramMessageTO telegramMessage = new TelegramMessageTO(chatId, message);
        WebTarget resource = ClientBuilder.newClient().target(Constants.TELEGRAM_BOT_ENDPOINT + "send");
        Entity<TelegramMessageTO> entity = Entity.entity(telegramMessage, MediaType.APPLICATION_JSON);
        Invocation.Builder request = resource.request();
        request.accept(MediaType.APPLICATION_JSON);
        Response response = request.post(entity);
        return response.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL;
    }
}
