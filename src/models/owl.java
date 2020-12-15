package models;


import java.io.IOException;


import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class owl extends Wild {
	
	private int poids;
	private String territoire;
	private String sonowl;
	public owl() {
		super();
		
	}
	public owl(boolean veg, String food, int noOfLegs, int poids , String territoire, String sonowl) {
		super(veg, food, noOfLegs);
		this.poids = poids;
		this.territoire = territoire;
		this.sonowl = sonowl;
		
	}
	
	@Override
	public String toString() {
		return "owl : Weight=" + poids + "Kg, territory=" + territoire+ ", "
				+ super.toString();
	}
	public String getSonowl() {
		return sonowl;
	}
	public void setSonowl(String sonowl) {
		this.sonowl = sonowl;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public String getTerritoire() {
		return territoire;
	}
	public void setTerritoire(String territoire) {
		this.territoire = territoire;
	}
	
	
	public void ReadSound(String sonowl) throws UnsupportedAudioFileException, IOException, 
	LineUnavailableException{
		for(int i = 0;i<3;i++) {
			super.ReadSound(sonowl);
		}
	}
	
	
	

}
