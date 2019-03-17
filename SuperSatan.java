class SuperSatan extends Character{
  public void awakening(){
    System.out.println("");
    System.out.println("「・・・これで終わりと思ったか？」");
    System.out.println("");
    System.out.println("-----魔王は真の姿を現した！-----");
    System.out.println("");
   }

  public void introduce(){
    System.out.println( name + "のステータス");
    System.out.println("HP 不明");
    System.out.println("MP 不明");
    System.out.println("ATK 不明");
    System.out.println("特殊技能:"+skill);	
  }

  public void attack(Character chara){
    System.out.println("「絶望するがいい・・・」");
    System.out.println("「"+this.skill+"!」");
    chara.damege(this.atk);
  }

}
