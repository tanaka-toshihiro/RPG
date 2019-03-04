public class RPG{
 public static void main (String[] args){
 	int hp; 
	int mp;
	String name; 
	String skill;
	
	Character Brave= new Character();
	Brave.hp = 500;
	Brave.mp = 500;
	Brave.name = "勇者";
	Brave.skill = "タンスを漁る";
	
	Character Mage = new Character();
	Mage.hp = 200;
	Mage.mp = 1000;
	Mage.name = "魔法使い";
	Mage.skill = "ファイヤーボール";

	Character Satan = new Character();
	Satan.hp = 99999;
	Satan.mp = 99999;
	Satan.name = "魔王";
	Satan.skill = "眷属召喚";

	Brave.introduce();
	Mage.introduce();
	Satan.introduce();	 
 }
}