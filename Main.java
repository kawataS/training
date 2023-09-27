class Main{
  public static void main(String args[]){
    int A = 0;
    int B = 0;
    String enzanshi;
    int kekka = 0;

    if(args.length != 3){
      errDisp("引数は3個以上入力してください");
    }

    try{
      A = Integer.parseInt(args[0]);
      B = Integer.parseInt(args[2]);
    }catch(NumberFormatException e){
      errDisp("数値でない値が入力されています");
    }

    enzanshi = args[1];
    String enzanshiStr[] = {
      "kake","waru","tasu","hiku"
    };
    boolean errFlag = true;

    for(int i = 0; i < 4; i++){
      if(enzanshi.equals(enzanshiStr[i])){
        errFlag = false;
      }
    }

    if(errFlag == true){
      errDisp("演算子は、kake,waru,tasu,hikuの4つです");
    }

    if(enzanshi.equals("kake")){
      kekka = A * B;
    }else if(enzanshi.equals("tasu")){
      kekka = A + B;
    }else if(enzanshi.equals("hiku")){
      kekka = A - B;
    }else{
      if(B == 0){
        errDisp("0で割ろうとしました");
      }else{
        kekka = A / B;
      }
    }

    System.out.println(
      "入力された式は" + A + "  " + enzanshi + " " + B + "です。"
      );
    System.out.println("計算結果は" + kekka + "です。");

  }

  private static void errDisp(String errStr){
    System.out.println("使い方:java test 数値 演算子 数値");
    System.out.println(errStr);
    System.exit(0);
  }
}