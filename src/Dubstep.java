/**************************MY SOLUTION******************************/
public class Dubstep {
    public static String SongDecoder (String song) {
        while(song.indexOf("WUB") == 0){
            song = song.replaceFirst("WUB", "");
        }

        while(song.indexOf("WUB") > -1){
            if(song.substring(song.indexOf("WUB")-1, song.indexOf("WUB")).equals(" ")) {
                song = song.replaceFirst("WUB", "");
            }
            else {
                song = song.replaceFirst("WUB", " ");
            }
        }

        song = song.trim();

        return song;
    }
}

/************************BEST SOLUTION******************************/
public class Dubstep {
    public static String SongDecoder (String song)
    {
        return song.replaceAll("(WUB)+", " ").trim();
    }
}

public class Dubstep {
    public static String SongDecoder (String song)
    {
        song = song.replaceAll("WUB"," ");
        return song.trim().replaceAll(" +", " ");
    }
}
/*******************************************************************/