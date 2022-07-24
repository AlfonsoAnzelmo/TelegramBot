import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.AnswerInlineQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.inlinequery.InlineQuery;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResult;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultPhoto;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class EsempioBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

        if(update.hasInlineQuery())
        {
            InlineQuery inlineQuery = update.getInlineQuery() ;

            List<InlineQueryResult> list = new ArrayList<>() ;

            InlineQueryResultPhoto inlineQueryResultPhoto1 = new InlineQueryResultPhoto() ;
            inlineQueryResultPhoto1.setId("1");
            inlineQueryResultPhoto1.setCaption("asinino");
            inlineQueryResultPhoto1.setPhotoHeight(200);
            inlineQueryResultPhoto1.setPhotoWidth(100);
            inlineQueryResultPhoto1.setPhotoUrl("https://i1.wp.com/gianfrancoamato.it/wp-content/uploads/2017/06/asino-3.jpg") ;
            inlineQueryResultPhoto1.setThumbUrl("https://i1.wp.com/gianfrancoamato.it/wp-content/uploads/2017/06/asino-3.jpg") ;

            InlineQueryResultPhoto inlineQueryResultPhoto2 = new InlineQueryResultPhoto() ;
            inlineQueryResultPhoto2.setId("2");
            inlineQueryResultPhoto2.setCaption("asinello");
            inlineQueryResultPhoto2.setPhotoHeight(200);
            inlineQueryResultPhoto2.setPhotoWidth(300);
            inlineQueryResultPhoto2.setPhotoUrl("https://pbs.twimg.com/media/B7uJQ-cCUAAi9PP.jpg") ;
            inlineQueryResultPhoto2.setThumbUrl("https://pbs.twimg.com/media/B7uJQ-cCUAAi9PP.jpg") ;

            InlineQueryResultPhoto inlineQueryResultPhoto3 = new InlineQueryResultPhoto() ;
            inlineQueryResultPhoto3.setId("3");
            inlineQueryResultPhoto3.setCaption("ani-nulloXD");
            inlineQueryResultPhoto3.setPhotoHeight(100);
            inlineQueryResultPhoto3.setPhotoWidth(100);
            inlineQueryResultPhoto3.setPhotoUrl("https://i.pinimg.com/474x/cc/9e/74/cc9e74d25e1db2d2758f5e4d8a092a29.jpg") ;
            inlineQueryResultPhoto3.setThumbUrl("https://i.pinimg.com/474x/cc/9e/74/cc9e74d25e1db2d2758f5e4d8a092a29.jpg") ;

            InlineQueryResultPhoto inlineQueryResultPhoto4 = new InlineQueryResultPhoto() ;
            inlineQueryResultPhoto4.setId("4");
            inlineQueryResultPhoto4.setCaption("ansisno");
            inlineQueryResultPhoto4.setPhotoHeight(300);
            inlineQueryResultPhoto4.setPhotoWidth(300);
            inlineQueryResultPhoto4.setPhotoUrl("https://www.corriere.it/methode_image/2021/09/27/Sport/Foto%20Sport/asinonapoli.JPG") ;
            inlineQueryResultPhoto4.setThumbUrl("https://www.corriere.it/methode_image/2021/09/27/Sport/Foto%20Sport/asinonapoli.JPG") ;

            list.add(inlineQueryResultPhoto1) ;
            list.add(inlineQueryResultPhoto2) ;
            list.add(inlineQueryResultPhoto3) ;
            list.add(inlineQueryResultPhoto4) ;

            AnswerInlineQuery answerInlineQuery = new AnswerInlineQuery() ;
            answerInlineQuery.setInlineQueryId(inlineQuery.getId()) ;
            answerInlineQuery.setResults(list);

            try {
                execute(answerInlineQuery) ;
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

}




