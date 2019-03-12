class Character{
  public int hp;
  public int mp;
  public int atk;
  public String name; 		
  public String skill; 

  public void introduce(){
    System.out.println( name + "のステータス");
    System.out.println("HP "+ hp);
    System.out.println("MP "+ mp);
    System.out.println("ATK "+ atk);
    System.out.println("特殊技能:"+skill);	
  }

  public void attack(Character chara){
    System.out.println(this.name+"の攻撃！"+"「"+this.skill+"!」");
    chara.damege(this.atk);
  }

  public void damege(int damege){
    System.out.println(this.name+"は"+damege+"のダメージを受けた！");
    this.hp -= damege;
    System.out.println(this.name+"のHP "+this.hp);
    if(this.hp<=0){
    System.out.println(this.name+"は倒れた・・・");
    }
  }
}
