package academy.BlocosinicIalizacao;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");

        }

    }
}
