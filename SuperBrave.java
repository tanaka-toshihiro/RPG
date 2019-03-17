class SuperBrave extends Character{
  public void awakening(){
    System.out.println("");
    System.out.println("「許さないぞ！魔王！！！」");
    System.out.println("");
    System.out.println("-----勇者は覚醒した！-----");
    System.out.println("");
   }
  
  public void attack(Character chara){
    System.out.println("これで終わらせてやる！！！くらえ・・・");
    System.out.println("「"+this.skill+"!」");
    chara.damege(this.atk);
  }
  
  public void damege(int damege){
    System.out.println(this.name+"は"+damege+"のダメージを受けた！");
    this.hp -= damege;
    System.out.println(this.name+"のHP "+this.hp);
    
    if(this.hp<=0){
      System.out.println(this.name+"は倒れた・・・");
      System.out.println("その後、世界は魔王によって支配された・・・");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("あきらめる");
      System.out.println("もう一度戦う←");
    }
  }
  
  public void newgame(){
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("勇 者 はコ ン テ ィ ニ ュ ー を 選 択 し た ");
  }
}
