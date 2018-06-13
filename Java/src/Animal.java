import java.awt.*;

class Bear extends Critter  {

    private boolean polar;
    private String slash = "/";

    public Bear(boolean polar){
        this.polar = polar;
    }

    public Color getColor(){
        if(polar){
            return Color.WHITE;
        }
        else
            return Color.BLACK;
    }

    public String toString(){
        if(slash.equals("/"))
            return "//";
        else
            return "/";
    }

    public Action getMove(CritterInfo info){

        if(info.frontThreat())
            return Action.INFECT;

    }

}
