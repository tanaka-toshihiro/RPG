public class RPG{
 public static void main (String[] args){
 	int hp; 
	int mp;
	String name; 
	String skill;
	
	Character Brave= new Character();
	Brave.hp = 500;
	Brave.mp = 500;
	Brave.name = "�E��";
	Brave.skill = "�^���X������";
	
	Character Mage = new Character();
	Mage.hp = 200;
	Mage.mp = 1000;
	Mage.name = "���@�g��";
	Mage.skill = "�t�@�C���[�{�[��";

	Character Satan = new Character();
	Satan.hp = 99999;
	Satan.mp = 99999;
	Satan.name = "����";
	Satan.skill = "�ő�����";

	Brave.introduce();
	Mage.introduce();
	Satan.introduce();	 
 }
}