class SuperSatan extends Character{
  public void awakening(){
    System.out.println("");
    System.out.println("�u�E�E�E����ŏI���Ǝv�������H�v");
    System.out.println("");
    System.out.println("-----�����͐^�̎p���������I-----");
    System.out.println("");
   }

  public void introduce(){
    System.out.println( name + "�̃X�e�[�^�X");
    System.out.println("HP �s��");
    System.out.println("MP �s��");
    System.out.println("ATK �s��");
    System.out.println("����Z�\:"+skill);	
  }

  public void attack(Character chara){
    System.out.println("�u��]���邪�����E�E�E�v");
    System.out.println("�u"+this.skill+"!�v");
    chara.damege(this.atk);
  }

}
