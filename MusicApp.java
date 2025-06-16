//Class Song: fields title, artist, and method play()
//Subclasses: PopSong, RockSong, JazzSong override play() with unique print messages
//Demonstrate polymorphic behavior using a playlist of Song[]
//File: MusicApp.java.

class Song{
    public String title;
    public String artist;

    public Song(String title, String artist){
        this.artist = artist;
        this.title = title;
    }
    public void play(){
        System.out.println("Play song....");
    }
}
class PopSong extends Song{
    public PopSong(String title, String artist){
        super(title, artist);
    }
    @Override
    public void play() {
        System.out.println("Play Pop Song...." + title +" by " + artist );
    }
}
class RockSong extends Song{
    public RockSong(String title, String artist){
        super(title, artist);
    }
    @Override
    public void play() {
        System.out.println("Play Rock Song....." + title + " by " + artist );
    }
}
class JazzSong extends Song{
    public JazzSong(String title, String artist){
        super(title, artist);
    }
    @Override
    public void play() {
        System.out.println("Play Jazz Song.." + title + " by "+ artist );
    }
}
public class MusicApp {
    public static void main(String[] args) {
        Song[] songs = new Song[3];

        songs[0] = new PopSong("Blinding Lights", "The Weeknd");
        songs[1] = new RockSong("Smells Like teen Spirit", "Nirvana");
        songs[2] = new JazzSong("Take Five", "The Dava brubeck Quartet");

        System.out.println("Playing song from playlist");
        for(Song song : songs){
            song.play();
        }
    }
}