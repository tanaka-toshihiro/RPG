class SuperBrave extends Character{
  public void awakening(){
    System.out.println("");
    System.out.println("�u�����Ȃ����I�����I�I�I�v");
    System.out.println("");
    System.out.println("-----�E�҂͊o�������I-----");
    System.out.println("");
   }
  
  public void attack(Character chara){
    System.out.println("����ŏI��点�Ă��I�I�I���炦�E�E�E");
    System.out.println("�u"+this.skill+"!�v");
    chara.damege(this.atk);
  }
  
  public void damege(int damege){
    System.out.println(this.name+"��"+damege+"�̃_���[�W���󂯂��I");
    this.hp -= damege;
    System.out.println(this.name+"��HP "+this.hp);
    
    if(this.hp<=0){
      System.out.println(this.name+"�͓|�ꂽ�E�E�E");
      System.out.println("���̌�A���E�͖����ɂ���Ďx�z���ꂽ�E�E�E");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("������߂�");
      System.out.println("������x�키��");
    }
  }

  public void newgame(){
      System.out.println("");
      System.out.println("");
      System.out.println("");
    System.out.println("�E �� �̓R �� �e �B �j �� �[ �� �I �� �� �� ");
 }
}
