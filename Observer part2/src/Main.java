import com.example.newsbroker.NewsAgency;
import com.example.newsbroker.NewsChannel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        // instantiate the news agencies
        var apa = new NewsAgency("APA");
        var reuters = new NewsAgency("reuters");

        // instantiate the news channels
        var orf = new NewsChannel("orf.at");
        var nzz = new NewsChannel("nzz.ch");
        var nytimes = new NewsChannel("nytimes.com");


        // subscribe to APA
        apa.subscribe(orf);
        apa.subscribe(nzz);

        // subscribe to Reuters
        reuters.subscribe(nytimes);
        reuters.subscribe(nzz);


        // broadcast news
        apa.broadcast("Auf der Suche nach der nächsten Regierung");
        reuters.broadcast("Harris campaign raises $55 mln over two weekend events, campaign official says");

    }


}