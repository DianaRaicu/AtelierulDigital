package tema.proiect.factory;

public class ArtClass {

    public Art getArt(String artType){
        if(artType==null){
            return null;
        }
        if(artType.equalsIgnoreCase("Photograph")){
            return new Photograph();
        }
        if(artType.equalsIgnoreCase("Paint")){
            return new Paint();
        }
        if(artType.equalsIgnoreCase("Sculpt")){
            return new Sculpt();
        }
        if(artType.equalsIgnoreCase("Write")){
            return new Write();
        }
        if(artType.equalsIgnoreCase("Sing")){
            return new Sing();
        }
        return null;
    }
}
