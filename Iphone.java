import java.util.ArrayList;
import java.util.List;

// Classe para representar um iPhone
public class Iphone {
    private Camera camera;
    private MusicPlayer musicPlayer;

    public Iphone() {
        camera = new Camera();
        musicPlayer = new MusicPlayer();
    }

    // Método para tirar uma foto usando a câmera
    public void takePhoto() {
        camera.takePhoto();
    }

    // Método para gravar um vídeo usando a câmera
    public void recordVideo() {
        camera.recordVideo();
    }

    // Método para reproduzir música online
    public void playOnlineMusic(String songUrl) {
        musicPlayer.playOnlineMusic(songUrl);
    }

    // Método para reproduzir música offline
    public void playOfflineMusic(String songPath) {
        musicPlayer.playOfflineMusic(songPath);
    }
}

// Classe para representar a funcionalidade da câmera
class Camera {
    public void takePhoto() {
        System.out.println("Foto tirada");
    }

    public void recordVideo() {
        System.out.println("Vídeo gravado");
    }
}

// Classe para representar a funcionalidade de reprodutor de música
class MusicPlayer {
    private List<String> playlist = new ArrayList<>();

    public void playOnlineMusic(String songUrl) {
        System.out.println("Reproduzindo música online: " + songUrl);
    }

    public void playOfflineMusic(String songPath) {
        System.out.println("Reproduzindo música offline: " + songPath);
    }
}

// Classe de teste
public class Main {
    public static void main(String[] args) {
        Iphone myIphone = new Iphone();

        // Usando a câmera
        myIphone.takePhoto();
        myIphone.recordVideo();

        // Reproduzindo música
        myIphone.playOnlineMusic("https://exemplo.com/musica.mp3");
        myIphone.playOfflineMusic("/caminho/para/musica.mp3");
    }
}