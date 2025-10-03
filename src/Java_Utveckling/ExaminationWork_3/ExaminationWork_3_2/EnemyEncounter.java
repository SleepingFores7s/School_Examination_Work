package Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2;

public class EnemyEncounter {
    public static void main(String[] arg) {

        new GameStart().gameStart();

    }
}
/**
 * Program funktion:
 *  Programmet är konstruerat för att kunna kämpa emot fiender, och medans man eleminerar flera fiender så börjar
 *  equipment att låsa upp.
 *
 * Jag har gjort ett liknande spel flera år tidigare, och jag tyckte det va roligt att kunna fysiskt see att
 * jag hade blivit bättre på flera olika saker. Jag tyckte att det kändes mycket smidigare nu när
 * jag vet hur jag instansierar klasser, bygger min egen JOptionPane klass för att passa mina behov, och
 * det känns mycket enklare nu när jag känner att jag har en grundläggande kunskap inom hur metoder
 * returnerar olika datatyper, innan så kändes det som att jag gissade mig fram, och nu bara flyter det bara på i stället!
 *
 *
 * Ps. Jag fortsatte att jobba med detta programmet, och gjorde kanske lite väl mycket för en examinering på vecka 4.
 * Jag la i alla fall till att det nu finns Weapons & Armors som låser upp sig när man dödat tillräckligt många monster &
 * att man kan "unequip" sitt weapon/armor (ta bort damage/Health ifrån det i alla fall, och återgå till statsen man har i början).
 * Tänker även göra en Character klass som player/Enemies kan använda Extends ifrån.
 *
 * ৻(  •̀ ᗜ •́  ৻)
 *
 * ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧
 *
 * Arbetsprocess: Jag började med att försöka komma på vilka olika saker som behövdes i
 * mitt huvud, sedan skrev jag ett simpelt program med System.out.println() för att
 * see vart saker behövde hamna och i vilken ordning.
 * Efter det så utvecklade jag programmet vidare med att skapa Player & Enemy klasser så att
 * jag enkelt skulle kunna ställa in Spelarens och Fiendernas stats.
 * Jag använde mig även av JOptionPane mycket, så jag gjorde det till sin egen klass så jag i stället
 * kunde skicka String´s till den, och inte behövde bygga nya JOptionPane() varje gång en ny ruta behövdes.
 * Jag använde mig rikligt av kommentarer/switch och if-satser för att först lägga upp layouten i Combat, för att senare gå in
 * och skriva in argumenten/logiken som behövdes.
 *
 *
 * AI:
 *  Main(EnemyEncounter): Den föreslog att jag sätter in en try-catch i main metoden flr att fånga eventuella fel ifrån programmet.
 *
 *  GameStart: Den föreslog att jag kunde ändra i min Combat klass så den tar Combat(Player player, int enemySelection) så jag kunde skicka min
 *      player instans till Combat i stället för att skapa en ny, vilket jag inte visste att jag kunde göra, så jag fixade det.
 *      Innan så skickade jag (Namn, health, attack, monstersHunted) en och en och satte in dom i ett nytt Player object.
 *
 *  Combat: Den förslog att jag skulle dela upp min gameplay över flera metoder vilket jag vill göra, men det tänker jag göra
 *      på ett senare tillfälle isf. på grund av hur mycket arbete som det "känns" som att det skulle innebära just nu.
 *
 *  Popups: Den gav inte så mycket tips på ändringar förutom att den kan förbättras med återanvändbara metoder, som jag har till viss del.
 *
 *  combatRandomizer: Förslog att jag lägger till kommentarer för vad dom olika metoderna gör, t.ex som flee() //50% chans att fly
 *
 *  Player: Den föreslog att jag sätter healthOriginal till en konstant eller final, men om den inte ändras så går spelet sönder, för att
 *      jag använder den till att återställa spelarens health efter fighten.
 *      Den föreslog även att jag lägger till en isAlive() metod för att enklare kolla om Player lever. (Projekt för framtiden)
 *      Förslog även en toString för att enkelt debugga om allt är korrekt, men det använder jag IntelliJ´s debugger för.
 *
 *  Enemy: Den föreslog att jag skulle göra om en metod som jag (av misstag) hade gjort fel, jag had skrivit public void Enemy() {} vilket
 *      gjorde att den inte räknades som en konstruktor. Fixade till det, samt att den även här föreslog en isAlive() och toString().
 *
 * */