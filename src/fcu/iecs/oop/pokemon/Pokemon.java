package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable {
	private String nickName;
	private PokemonType type;
	private int cp;
	public Pokemon(String nickName,PokemonType type,int cp){
		this.nickName=nickName;
		this.type=type;
		this.cp=cp;
	}
	public String getnickName(){
		return nickName;
	}
	public void setnickName(String nickName){
		this.nickName=nickName;
	}
	public PokemonType getType(){
		return type;
	}
	public void setcp(int cp){
		this.cp=cp;
	}
	public int getcp(){
		return cp;
	}
	public void attack() {
	}
	
}
