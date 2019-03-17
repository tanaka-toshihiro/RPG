public class RPG{
  public static void main(String[] args){
    Character Brave= new Character();
    Brave.hp = 500;
    Brave.mp = 500;
    Brave.atk = 100;
    Brave.name = "勇者";
    Brave.skill = "シャイニング・ソード";
    
    Character Mage = new Character();
    Mage.hp = 200;
    Mage.mp = 1000;
    Mage.name = "魔法使い";
    Mage.atk = 120;
    Mage.skill = "ファイヤーボール";
    
    Character Satan = new Character();
    Satan.hp = 99999;
    Satan.mp = 99999;
    Satan.atk = 200;
    Satan.name = "魔王";
    Satan.skill = "眷属召喚";
    
    Brave.introduce();
    Mage.introduce();
    Satan.introduce();
    
    System.out.println("---バトル開始！---");

    Brave.attack(Satan);
    Mage.attack(Satan);
    Satan.attack(Brave);
    Satan.attack(Mage);


    SuperBrave SBrave= new SuperBrave();
    SBrave.hp = 99999;
    SBrave.mp = 99999;
    SBrave.atk = 99999;
    SBrave.name = "覚醒勇者";
    SBrave.skill = "真・シャイニング・ソード";

    SBrave.awakening();
    SBrave.introduce();

    SBrave.attack(Satan);

    SuperSatan SSatan = new SuperSatan();
    SSatan.hp = 999999;
    SSatan.mp = 999999;
    SSatan.atk = 999999;
    SSatan.name = "真なる魔王";
    SSatan.skill = "デス";

    SSatan.awakening();
    SSatan.introduce();
    SSatan.attack(SBrave);

    SBrave.newgame();
  }
}
