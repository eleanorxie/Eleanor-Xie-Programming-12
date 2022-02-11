import java.util.ArrayList;

public class Planet {
    private ArrayList<Moon> moons = new ArrayList<Moon>();
    private int orbitTime;
    private String designation;

    public Planet(){

    }

    public Planet (int orbitT, String desig){
        orbitTime = orbitT;
        designation = desig;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void addMoon(Moon addOneMoon){
        moons.add(addOneMoon);
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }

    public boolean equals (Object obj){
        if(obj instanceof Planet){
            Planet aPlanet = (Planet) obj;
            return(this.designation.equals(aPlanet.getDesignation())
                    && this.orbitTime == (aPlanet.getOrbitTime()));
        }
        return false;
    }

    public String toString(){
        return "orbit time: " + orbitTime + "\n"
                + "designation: " + designation;
    }
}