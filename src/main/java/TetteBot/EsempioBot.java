package TetteBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;


public class EsempioBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {


        String chat_id = update.getMessage().getChatId().toString() ;

        messaggioVersoUtente(update , chat_id) ;

        String comando = update.getMessage().getText() ;

       //List<PhotoSize> list = update.getMessage().getPhoto() ;
        // String id = list.get(0).getFileId() ;
//fwe
        File f = new File("C:/Users/anzel/IdeaProjects/TelegramBot/src/main/TelegramBot/titsImages/tette" + numero + ".jpg") ;
        numero++ ;
        if(numero == 6)
            numero = 1 ;
        InputFile inputFile = new InputFile(f) ;

        if(comando.equals("/inviafoto"))
        {
            SendPhoto message = new SendPhoto() ;
            message.setPhoto(inputFile) ;
            message.setChatId(chat_id) ;
            message.setCaption("ZIZZE");

            try {
                this.execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }




    }



    @Override
    public String getBotUsername() {
        return "GiacominoVanHelsing1Bot";
    }

    @Override
    public String getBotToken() {
        return "5411676009:AAET1zAJKOq69M6SD8KDGGYsrPqXusShQSQ";
    }

    private void messaggioVersoUtente(Update update , String chat_id){
        String testo = "Il Messaggio " + update.getMessage().getText() +
                " Il tuo nome : " + update.getMessage().getFrom().getFirstName() +  " " +
                " il tuo cognome : " + update.getMessage().getFrom().getLastName() + " " +
                " il tuo userName : " + update.getMessage().getFrom().getUserName() + " " ;



        SendMessage message = new SendMessage(); // Create a message object object
        message.setChatId(chat_id) ; //bisogna specificare su quale chat
        message.setText("sei scemissimo" + "\n" + testo );//il testo

        SendMessage message2 = new SendMessage(); // Create a message object object
        message2.setChatId(chat_id) ; //bisogna specificare su quale chat
        message2.setText("id della chat : " + chat_id);//il testo
        try {
            execute(message); // Sending our message object to user
            execute(message2); // Sending our message object to user
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    private static int numero = 1 ;
}
