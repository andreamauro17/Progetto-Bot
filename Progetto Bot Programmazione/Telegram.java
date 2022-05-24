package application;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Telegram{
	public static void run() {
		 TelegramBotsApi botsApi;
        try {
            botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new MyBot());
        } catch (TelegramApiException e) {
           
            e.printStackTrace();
        }
	}
	
	public static void end() {
		System.exit(0);
	}
	
}
