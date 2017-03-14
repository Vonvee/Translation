/**
 * Created by Vonvee on 08.03.2017.
 */

import com.github.vbauer.yta.model.Direction;
import com.github.vbauer.yta.model.Language;
import com.github.vbauer.yta.model.Translation;
import com.github.vbauer.yta.service.YTranslateApiImpl;
import org.apache.http.client.HttpClient;
import java.util.Scanner;

public class TranslateApp {

    private static final String API_KEY = "trnsl.1.1.20170308T195859Z.630ec489b3aa65ec.c6f6527da8436dffe428d56b8fad3eebf9683e4f";

    public static void main(String[] args) throws Exception {
        YTranslateApiImpl api = new YTranslateApiImpl(API_KEY);
        Scanner in = new Scanner(System.in);
        String wordToTranslate = in.nextLine();

        Translation translation = api.translationApi().translate(
                wordToTranslate,
                Direction.of(Language.RU, Language.EN)
        );
        System.out.print(translation.toString());

    }

}