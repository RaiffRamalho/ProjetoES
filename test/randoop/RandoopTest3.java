package randoop;

import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test1");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getName();
    java.lang.String var5 = var2.getName();
    classes.Gamer var8 = new classes.Gamer("hi!", 100);
    int var9 = var8.getScore();
    int var10 = var8.getScore();
    int var11 = var2.compareTo(var8);
    java.lang.String var12 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var3.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test2");


    classes.Gamer var2 = new classes.Gamer("1\u00BA -  - 0", 96);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test3");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var3 = new classes.Persistencia("");
    classes.Ranking var4 = new classes.Ranking();
    java.util.List var5 = var4.getRank();
    var3.persistirDados(var4);
    classes.Ranking var7 = new classes.Ranking();
    java.util.List var8 = var7.getRank();
    classes.Ranking var9 = var3.lerDados(var7);
    classes.Ranking var10 = new classes.Ranking();
    java.util.List var11 = var10.getRank();
    java.lang.String var12 = var10.toString();
    java.lang.String var13 = var10.toString();
    var3.persistirDados(var10);
    classes.Ranking var15 = var1.lerDados(var10);
    java.lang.String var16 = var15.toString();
    boolean var19 = var15.CheckRanking("hi!", (java.lang.Integer)(-1));
    java.lang.String var20 = var15.toString();
    boolean var23 = var15.CheckRanking("Nome: 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1| Pontuacao: 2", (java.lang.Integer)(-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "1\u00BA - hi! - -1"+ "'", var20.equals("1\u00BA - hi! - -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test4");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getScore();
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.toString();
    classes.Gamer var11 = new classes.Gamer("hi!", 10);
    classes.Gamer var14 = new classes.Gamer("hi!", 100);
    java.lang.String var15 = var14.getName();
    java.lang.String var16 = var14.toString();
    int var17 = var11.compareTo(var14);
    java.lang.String var18 = var14.getName();
    int var19 = var14.getScore();
    int var20 = var14.getScore();
    int var21 = var14.getScore();
    int var22 = var2.compareTo(var14);
    int var23 = var2.getScore();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var4.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var6.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var7.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var8.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var16.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test5");


    classes.Gamer var2 = new classes.Gamer("1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0", (-99));
    classes.Gamer var5 = new classes.Gamer("hi!", 100);
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var5.toString();
    int var8 = var5.getScore();
    java.lang.String var9 = var5.getName();
    java.lang.String var10 = var5.getName();
    classes.Gamer var13 = new classes.Gamer("hi!", 100);
    java.lang.String var14 = var13.toString();
    int var15 = var13.getScore();
    java.lang.String var16 = var13.getName();
    classes.Gamer var19 = new classes.Gamer("hi!", 100);
    java.lang.String var20 = var19.toString();
    int var21 = var19.getScore();
    classes.Gamer var24 = new classes.Gamer("hi!", 100);
    int var25 = var19.compareTo(var24);
    int var26 = var13.compareTo(var19);
    int var27 = var5.compareTo(var13);
    int var28 = var5.getScore();
    int var29 = var2.compareTo(var5);
    java.lang.String var30 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var7.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var14.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var20.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 199);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0"+ "'", var30.equals("1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test6");


    classes.Gamer var2 = new classes.Gamer("1\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 102\u00BA - hi! - 10", (-201));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test7");


    classes.Persistencia var1 = new classes.Persistencia("");
    classes.Ranking var2 = new classes.Ranking();
    java.util.List var3 = var2.getRank();
    var1.persistirDados(var2);
    classes.Ranking var5 = new classes.Ranking();
    java.util.List var6 = var5.getRank();
    classes.Ranking var7 = var1.lerDados(var5);
    boolean var10 = var5.CheckRanking("Nome: 1\u00BA -  - -1| Pontuacao: 100", (java.lang.Integer)(-1));
    java.lang.String var11 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "1\u00BA - Nome: 1\u00BA -  - -1| Pontuacao: 100 - -1"+ "'", var11.equals("1\u00BA - Nome: 1\u00BA -  - -1| Pontuacao: 100 - -1"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test8");


    classes.Persistencia var1 = new classes.Persistencia("hi!");
    classes.Ranking var2 = new classes.Ranking();
    boolean var5 = var2.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var8 = var2.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var9 = var1.lerDados(var2);
    classes.Ranking var10 = new classes.Ranking();
    java.util.List var11 = var10.getRank();
    java.lang.String var12 = var10.toString();
    var1.persistirDados(var10);
    classes.Persistencia var15 = new classes.Persistencia("hi!");
    classes.Ranking var16 = new classes.Ranking();
    boolean var19 = var16.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var22 = var16.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var23 = var15.lerDados(var16);
    boolean var26 = var16.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)(-1));
    java.util.List var27 = var16.getRank();
    java.lang.String var28 = var16.toString();
    var1.persistirDados(var16);
    java.lang.String var30 = var16.toString();
    java.util.List var31 = var16.getRank();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -13\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - -1"+ "'", var28.equals("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -13\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -13\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - -1"+ "'", var30.equals("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -13\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test9");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var3 = new classes.Persistencia("");
    classes.Ranking var4 = new classes.Ranking();
    java.util.List var5 = var4.getRank();
    var3.persistirDados(var4);
    classes.Ranking var7 = new classes.Ranking();
    java.util.List var8 = var7.getRank();
    classes.Ranking var9 = var3.lerDados(var7);
    classes.Ranking var10 = new classes.Ranking();
    java.util.List var11 = var10.getRank();
    java.lang.String var12 = var10.toString();
    java.lang.String var13 = var10.toString();
    var3.persistirDados(var10);
    classes.Ranking var15 = var1.lerDados(var10);
    classes.Persistencia var17 = new classes.Persistencia("");
    classes.Ranking var18 = new classes.Ranking();
    boolean var21 = var18.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    java.util.List var22 = var18.getRank();
    java.util.List var23 = var18.getRank();
    var17.persistirDados(var18);
    var1.persistirDados(var18);
    classes.Persistencia var27 = new classes.Persistencia("");
    classes.Ranking var28 = new classes.Ranking();
    boolean var31 = var28.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    java.util.List var32 = var28.getRank();
    java.util.List var33 = var28.getRank();
    var27.persistirDados(var28);
    classes.Persistencia var36 = new classes.Persistencia("");
    classes.Ranking var37 = new classes.Ranking();
    java.util.List var38 = var37.getRank();
    var36.persistirDados(var37);
    classes.Ranking var40 = new classes.Ranking();
    var36.persistirDados(var40);
    classes.Ranking var42 = new classes.Ranking();
    java.util.List var43 = var42.getRank();
    java.lang.String var44 = var42.toString();
    var36.persistirDados(var42);
    classes.Ranking var46 = var27.lerDados(var42);
    boolean var49 = var46.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-90));
    classes.Ranking var50 = var1.lerDados(var46);
    boolean var53 = var46.CheckRanking("Nome: | Pontuacao: 2", (java.lang.Integer)2);
    boolean var56 = var46.CheckRanking("1\u00BA - Nome: 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1| Pontuacao: 2 - -101", (java.lang.Integer)(-12));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test10");


    classes.Operator var3 = new classes.Operator((-99), 1, 1);
    int var4 = var3.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test11");


    classes.Persistencia var1 = new classes.Persistencia("Nome: 1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0| Pontuacao: 0");

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test12");


    classes.Operator var3 = new classes.Operator(102, (-9), 1088);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test13");


    classes.Operator var3 = new classes.Operator((-100), 11, (-178));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test14");


    classes.Gamer var2 = new classes.Gamer("1\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -13\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - -1 - -2", (-2));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test15");


    classes.Persistencia var1 = new classes.Persistencia("hi!");
    classes.Ranking var2 = new classes.Ranking();
    boolean var5 = var2.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var8 = var2.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var9 = var1.lerDados(var2);
    classes.Ranking var10 = new classes.Ranking();
    java.lang.String var11 = var10.toString();
    java.util.List var12 = var10.getRank();
    var1.persistirDados(var10);
    classes.Ranking var14 = new classes.Ranking();
    boolean var17 = var14.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var20 = var14.CheckRanking("hi!", (java.lang.Integer)(-1));
    java.util.List var21 = var14.getRank();
    var1.persistirDados(var14);
    classes.Persistencia var24 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var26 = new classes.Persistencia("hi!");
    classes.Ranking var27 = new classes.Ranking();
    boolean var30 = var27.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var33 = var27.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var34 = var26.lerDados(var27);
    classes.Ranking var35 = new classes.Ranking();
    java.util.List var36 = var35.getRank();
    java.lang.String var37 = var35.toString();
    var26.persistirDados(var35);
    classes.Ranking var39 = new classes.Ranking();
    java.util.List var40 = var39.getRank();
    classes.Ranking var41 = var26.lerDados(var39);
    var24.persistirDados(var41);
    classes.Persistencia var44 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var46 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var48 = new classes.Persistencia("");
    classes.Ranking var49 = new classes.Ranking();
    java.util.List var50 = var49.getRank();
    var48.persistirDados(var49);
    classes.Ranking var52 = new classes.Ranking();
    java.util.List var53 = var52.getRank();
    classes.Ranking var54 = var48.lerDados(var52);
    classes.Ranking var55 = new classes.Ranking();
    java.util.List var56 = var55.getRank();
    java.lang.String var57 = var55.toString();
    java.lang.String var58 = var55.toString();
    var48.persistirDados(var55);
    classes.Ranking var60 = var46.lerDados(var55);
    java.lang.String var61 = var60.toString();
    classes.Ranking var62 = var44.lerDados(var60);
    classes.Ranking var63 = var24.lerDados(var62);
    var1.persistirDados(var63);
    boolean var67 = var63.CheckRanking("Nome: hi!| Pontuacao: 100", (java.lang.Integer)98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ""+ "'", var58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test16");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Ranking var2 = new classes.Ranking();
    java.util.List var3 = var2.getRank();
    classes.Ranking var4 = var1.lerDados(var2);
    classes.Persistencia var6 = new classes.Persistencia("hi!");
    classes.Ranking var7 = new classes.Ranking();
    boolean var10 = var7.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var13 = var7.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var14 = var6.lerDados(var7);
    classes.Ranking var15 = new classes.Ranking();
    java.util.List var16 = var15.getRank();
    java.lang.String var17 = var15.toString();
    var6.persistirDados(var15);
    classes.Ranking var19 = new classes.Ranking();
    java.util.List var20 = var19.getRank();
    classes.Ranking var21 = var6.lerDados(var19);
    var1.persistirDados(var19);
    classes.Persistencia var24 = new classes.Persistencia("hi!");
    classes.Ranking var25 = new classes.Ranking();
    boolean var28 = var25.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var31 = var25.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var32 = var24.lerDados(var25);
    classes.Ranking var33 = var1.lerDados(var32);
    classes.Ranking var34 = new classes.Ranking();
    boolean var37 = var34.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var40 = var34.CheckRanking("Nome: hi!| Pontuacao: 100", (java.lang.Integer)100);
    java.lang.String var41 = var34.toString();
    classes.Ranking var42 = var1.lerDados(var34);
    classes.Persistencia var44 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var46 = new classes.Persistencia("");
    classes.Ranking var47 = new classes.Ranking();
    java.util.List var48 = var47.getRank();
    var46.persistirDados(var47);
    classes.Ranking var50 = new classes.Ranking();
    java.util.List var51 = var50.getRank();
    classes.Ranking var52 = var46.lerDados(var50);
    classes.Ranking var53 = new classes.Ranking();
    java.util.List var54 = var53.getRank();
    java.lang.String var55 = var53.toString();
    java.lang.String var56 = var53.toString();
    var46.persistirDados(var53);
    classes.Ranking var58 = var44.lerDados(var53);
    boolean var61 = var53.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    boolean var64 = var53.CheckRanking("", (java.lang.Integer)10);
    var1.persistirDados(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "1\u00BA - hi! - 02\u00BA - Nome: hi!| Pontuacao: 100 - 100"+ "'", var41.equals("1\u00BA - hi! - 02\u00BA - Nome: hi!| Pontuacao: 100 - 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test17");


    classes.Ranking var0 = new classes.Ranking();
    java.lang.String var1 = var0.toString();
    java.util.List var2 = var0.getRank();
    boolean var5 = var0.CheckRanking("Nome: hi!| Pontuacao: 100", (java.lang.Integer)100);
    java.util.List var6 = var0.getRank();
    boolean var9 = var0.CheckRanking("1\u00BA - 1\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 10 - 98", (java.lang.Integer)(-90));
    boolean var12 = var0.CheckRanking("Nome: Nome: hi!| Pontuacao: 100| Pontuacao: 98", (java.lang.Integer)(-78));
    boolean var15 = var0.CheckRanking("Nome: 1\u00BA - 1\u00BA -  - 2 - 11| Pontuacao: 98", (java.lang.Integer)(-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test18");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var3 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var5 = new classes.Persistencia("");
    classes.Ranking var6 = new classes.Ranking();
    java.util.List var7 = var6.getRank();
    var5.persistirDados(var6);
    classes.Ranking var9 = new classes.Ranking();
    java.util.List var10 = var9.getRank();
    classes.Ranking var11 = var5.lerDados(var9);
    classes.Ranking var12 = new classes.Ranking();
    java.util.List var13 = var12.getRank();
    java.lang.String var14 = var12.toString();
    java.lang.String var15 = var12.toString();
    var5.persistirDados(var12);
    classes.Ranking var17 = var3.lerDados(var12);
    java.lang.String var18 = var17.toString();
    classes.Ranking var19 = var1.lerDados(var17);
    classes.Persistencia var21 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var23 = new classes.Persistencia("");
    classes.Ranking var24 = new classes.Ranking();
    java.util.List var25 = var24.getRank();
    var23.persistirDados(var24);
    classes.Ranking var27 = new classes.Ranking();
    java.util.List var28 = var27.getRank();
    classes.Ranking var29 = var23.lerDados(var27);
    classes.Ranking var30 = new classes.Ranking();
    java.util.List var31 = var30.getRank();
    java.lang.String var32 = var30.toString();
    java.lang.String var33 = var30.toString();
    var23.persistirDados(var30);
    classes.Ranking var35 = var21.lerDados(var30);
    classes.Ranking var36 = new classes.Ranking();
    java.lang.String var37 = var36.toString();
    java.util.List var38 = var36.getRank();
    classes.Ranking var39 = var21.lerDados(var36);
    classes.Ranking var40 = var1.lerDados(var36);
    classes.Persistencia var42 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Ranking var43 = new classes.Ranking();
    java.util.List var44 = var43.getRank();
    classes.Ranking var45 = var42.lerDados(var43);
    classes.Persistencia var47 = new classes.Persistencia("hi!");
    classes.Ranking var48 = new classes.Ranking();
    boolean var51 = var48.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var54 = var48.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var55 = var47.lerDados(var48);
    classes.Ranking var56 = new classes.Ranking();
    java.util.List var57 = var56.getRank();
    java.lang.String var58 = var56.toString();
    var47.persistirDados(var56);
    classes.Ranking var60 = new classes.Ranking();
    java.util.List var61 = var60.getRank();
    classes.Ranking var62 = var47.lerDados(var60);
    var42.persistirDados(var60);
    classes.Persistencia var65 = new classes.Persistencia("");
    classes.Ranking var66 = new classes.Ranking();
    java.util.List var67 = var66.getRank();
    var65.persistirDados(var66);
    java.lang.String var69 = var66.toString();
    java.lang.String var70 = var66.toString();
    classes.Ranking var71 = var42.lerDados(var66);
    boolean var74 = var71.CheckRanking("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)98);
    java.util.List var75 = var71.getRank();
    var1.persistirDados(var71);
    classes.Persistencia var78 = new classes.Persistencia("Nome: hi!| Pontuacao: 100");
    classes.Persistencia var80 = new classes.Persistencia("");
    classes.Ranking var81 = new classes.Ranking();
    java.util.List var82 = var81.getRank();
    var80.persistirDados(var81);
    classes.Ranking var84 = new classes.Ranking();
    java.util.List var85 = var84.getRank();
    classes.Ranking var86 = var80.lerDados(var84);
    var78.persistirDados(var86);
    java.lang.String var88 = var86.toString();
    classes.Ranking var89 = var1.lerDados(var86);
    boolean var92 = var89.CheckRanking("Nome: | Pontuacao: -1", (java.lang.Integer)98);
    java.lang.String var93 = var89.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ""+ "'", var58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + ""+ "'", var69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + ""+ "'", var88.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "1\u00BA - Nome: | Pontuacao: -1 - 98"+ "'", var93.equals("1\u00BA - Nome: | Pontuacao: -1 - 98"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test19");


    classes.Gamer var2 = new classes.Gamer("Nome: Nome: hi!| Pontuacao: 100| Pontuacao: 99", (-12));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test20");


    classes.Gamer var2 = new classes.Gamer("hi!", 10);
    classes.Gamer var5 = new classes.Gamer("hi!", 100);
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var5.toString();
    int var8 = var2.compareTo(var5);
    java.lang.String var9 = var5.getName();
    java.lang.String var10 = var5.toString();
    java.lang.String var11 = var5.toString();
    int var12 = var5.getScore();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var7.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var10.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var11.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test21");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getScore();
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    classes.Gamer var10 = new classes.Gamer("hi!", 100);
    java.lang.String var11 = var10.toString();
    int var12 = var10.getScore();
    classes.Gamer var15 = new classes.Gamer("hi!", 100);
    int var16 = var10.compareTo(var15);
    java.lang.String var17 = var15.toString();
    java.lang.String var18 = var15.toString();
    java.lang.String var19 = var15.toString();
    int var20 = var2.compareTo(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var3.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var4.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var6.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var7.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var11.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var17.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var18.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var19.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test22");


    classes.Gamer var2 = new classes.Gamer("hi!", 0);
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getName();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getScore();
    int var7 = var2.getScore();
    classes.Gamer var10 = new classes.Gamer("1\u00BA -  - -1", 88);
    java.lang.String var11 = var10.toString();
    int var12 = var2.compareTo(var10);
    java.lang.String var13 = var2.toString();
    java.lang.String var14 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Nome: hi!| Pontuacao: 0"+ "'", var5.equals("Nome: hi!| Pontuacao: 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Nome: 1\u00BA -  - -1| Pontuacao: 88"+ "'", var11.equals("Nome: 1\u00BA -  - -1| Pontuacao: 88"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Nome: hi!| Pontuacao: 0"+ "'", var13.equals("Nome: hi!| Pontuacao: 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test23");


    classes.Gamer var2 = new classes.Gamer("1\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -13\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - -1 - 10", (-201));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test24");


    classes.Persistencia var1 = new classes.Persistencia("Nome: 1\u00BA - hi! - 02\u00BA - hi! - -1| Pontuacao: 100");
    classes.Persistencia var3 = new classes.Persistencia("");
    classes.Ranking var4 = new classes.Ranking();
    java.util.List var5 = var4.getRank();
    var3.persistirDados(var4);
    classes.Ranking var7 = new classes.Ranking();
    java.util.List var8 = var7.getRank();
    classes.Ranking var9 = var3.lerDados(var7);
    classes.Ranking var10 = new classes.Ranking();
    java.util.List var11 = var10.getRank();
    java.lang.String var12 = var10.toString();
    java.lang.String var13 = var10.toString();
    var3.persistirDados(var10);
    java.util.List var15 = var10.getRank();
    classes.Ranking var16 = var1.lerDados(var10);
    classes.Persistencia var18 = new classes.Persistencia("1\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - 2");
    classes.Persistencia var20 = new classes.Persistencia("");
    classes.Ranking var21 = new classes.Ranking();
    java.util.List var22 = var21.getRank();
    var20.persistirDados(var21);
    classes.Ranking var24 = new classes.Ranking();
    java.util.List var25 = var24.getRank();
    classes.Ranking var26 = var20.lerDados(var24);
    classes.Persistencia var28 = new classes.Persistencia("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1");
    classes.Persistencia var30 = new classes.Persistencia("");
    classes.Ranking var31 = new classes.Ranking();
    java.util.List var32 = var31.getRank();
    var30.persistirDados(var31);
    classes.Ranking var34 = new classes.Ranking();
    var30.persistirDados(var34);
    classes.Persistencia var37 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var39 = new classes.Persistencia("");
    classes.Ranking var40 = new classes.Ranking();
    java.util.List var41 = var40.getRank();
    var39.persistirDados(var40);
    classes.Ranking var43 = new classes.Ranking();
    java.util.List var44 = var43.getRank();
    classes.Ranking var45 = var39.lerDados(var43);
    classes.Ranking var46 = new classes.Ranking();
    java.util.List var47 = var46.getRank();
    java.lang.String var48 = var46.toString();
    java.lang.String var49 = var46.toString();
    var39.persistirDados(var46);
    classes.Ranking var51 = var37.lerDados(var46);
    java.lang.String var52 = var46.toString();
    var30.persistirDados(var46);
    classes.Ranking var54 = var28.lerDados(var46);
    var20.persistirDados(var46);
    classes.Persistencia var57 = new classes.Persistencia("hi!");
    classes.Ranking var58 = new classes.Ranking();
    boolean var61 = var58.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var64 = var58.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var65 = var57.lerDados(var58);
    classes.Ranking var66 = new classes.Ranking();
    java.util.List var67 = var66.getRank();
    java.lang.String var68 = var66.toString();
    var57.persistirDados(var66);
    classes.Ranking var70 = var20.lerDados(var66);
    boolean var73 = var70.CheckRanking("1\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 10", (java.lang.Integer)88);
    classes.Ranking var74 = var18.lerDados(var70);
    classes.Ranking var75 = var1.lerDados(var70);
    classes.Ranking var76 = new classes.Ranking();
    boolean var79 = var76.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    var1.persistirDados(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test25");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA - 1\u00BA - hi! - 02\u00BA - Nome: hi!| Pontuacao: 100 - 100 - 90");
    classes.Persistencia var3 = new classes.Persistencia("hi!");
    classes.Persistencia var5 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var7 = new classes.Persistencia("");
    classes.Ranking var8 = new classes.Ranking();
    java.util.List var9 = var8.getRank();
    var7.persistirDados(var8);
    classes.Ranking var11 = new classes.Ranking();
    java.util.List var12 = var11.getRank();
    classes.Ranking var13 = var7.lerDados(var11);
    classes.Ranking var14 = new classes.Ranking();
    java.util.List var15 = var14.getRank();
    java.lang.String var16 = var14.toString();
    java.lang.String var17 = var14.toString();
    var7.persistirDados(var14);
    classes.Ranking var19 = var5.lerDados(var14);
    classes.Ranking var20 = new classes.Ranking();
    boolean var23 = var20.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    var5.persistirDados(var20);
    classes.Persistencia var26 = new classes.Persistencia("hi!");
    classes.Ranking var27 = new classes.Ranking();
    boolean var30 = var27.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var33 = var27.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var34 = var26.lerDados(var27);
    classes.Ranking var35 = var5.lerDados(var27);
    java.util.List var36 = var35.getRank();
    var3.persistirDados(var35);
    var1.persistirDados(var35);
    java.util.List var39 = var35.getRank();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test26");


    classes.Gamer var2 = new classes.Gamer("hi!", 10);
    classes.Gamer var5 = new classes.Gamer("hi!", 100);
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var5.toString();
    int var8 = var2.compareTo(var5);
    java.lang.String var9 = var5.getName();
    int var10 = var5.getScore();
    int var11 = var5.getScore();
    java.lang.String var12 = var5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var7.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test27");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getScore();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.toString();
    classes.Gamer var11 = new classes.Gamer("1\u00BA - hi! - 02\u00BA - Nome: hi!| Pontuacao: 100 - 100", 99);
    int var12 = var2.compareTo(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var3.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var4.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var8.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test28");


    classes.Gamer var2 = new classes.Gamer("Nome: 1\u00BA -  - -1| Pontuacao: 88", (-1079));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test29");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA - 1\u00BA -  - -1 - -12\u00BA - 1\u00BA -  - 2 - 1");
    classes.Persistencia var3 = new classes.Persistencia("hi!");
    classes.Ranking var4 = new classes.Ranking();
    boolean var7 = var4.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var10 = var4.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var11 = var3.lerDados(var4);
    classes.Persistencia var13 = new classes.Persistencia("hi!");
    classes.Ranking var14 = new classes.Ranking();
    boolean var17 = var14.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var20 = var14.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var21 = var13.lerDados(var14);
    classes.Ranking var22 = new classes.Ranking();
    java.lang.String var23 = var22.toString();
    java.util.List var24 = var22.getRank();
    var13.persistirDados(var22);
    classes.Persistencia var27 = new classes.Persistencia("Nome: hi!| Pontuacao: 100");
    classes.Persistencia var29 = new classes.Persistencia("");
    classes.Ranking var30 = new classes.Ranking();
    java.util.List var31 = var30.getRank();
    var29.persistirDados(var30);
    classes.Ranking var33 = new classes.Ranking();
    java.util.List var34 = var33.getRank();
    classes.Ranking var35 = var29.lerDados(var33);
    var27.persistirDados(var35);
    java.lang.String var37 = var35.toString();
    classes.Ranking var38 = var13.lerDados(var35);
    classes.Persistencia var40 = new classes.Persistencia("hi!");
    classes.Persistencia var42 = new classes.Persistencia("hi!");
    classes.Ranking var43 = new classes.Ranking();
    boolean var46 = var43.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var49 = var43.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var50 = var42.lerDados(var43);
    var40.persistirDados(var43);
    classes.Ranking var52 = var13.lerDados(var43);
    classes.Ranking var53 = var3.lerDados(var43);
    classes.Ranking var54 = var1.lerDados(var43);
    java.util.List var55 = var43.getRank();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test30");


    classes.Persistencia var1 = new classes.Persistencia("");
    classes.Ranking var2 = new classes.Ranking();
    java.util.List var3 = var2.getRank();
    var1.persistirDados(var2);
    classes.Persistencia var6 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var8 = new classes.Persistencia("hi!");
    classes.Ranking var9 = new classes.Ranking();
    boolean var12 = var9.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var15 = var9.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var16 = var8.lerDados(var9);
    classes.Ranking var17 = new classes.Ranking();
    java.util.List var18 = var17.getRank();
    java.lang.String var19 = var17.toString();
    var8.persistirDados(var17);
    classes.Ranking var21 = new classes.Ranking();
    java.util.List var22 = var21.getRank();
    classes.Ranking var23 = var8.lerDados(var21);
    var6.persistirDados(var23);
    var1.persistirDados(var23);
    classes.Ranking var26 = new classes.Ranking();
    boolean var29 = var26.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var32 = var26.CheckRanking("Nome: hi!| Pontuacao: 100", (java.lang.Integer)100);
    java.util.List var33 = var26.getRank();
    var1.persistirDados(var26);
    classes.Persistencia var36 = new classes.Persistencia("1\u00BA - hi! - 02\u00BA - hi! - -1");
    classes.Persistencia var38 = new classes.Persistencia("");
    classes.Ranking var39 = new classes.Ranking();
    java.util.List var40 = var39.getRank();
    var38.persistirDados(var39);
    classes.Ranking var42 = new classes.Ranking();
    var38.persistirDados(var42);
    classes.Ranking var44 = var36.lerDados(var42);
    classes.Persistencia var46 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var48 = new classes.Persistencia("");
    classes.Ranking var49 = new classes.Ranking();
    java.util.List var50 = var49.getRank();
    var48.persistirDados(var49);
    classes.Ranking var52 = new classes.Ranking();
    java.util.List var53 = var52.getRank();
    classes.Ranking var54 = var48.lerDados(var52);
    classes.Ranking var55 = new classes.Ranking();
    java.util.List var56 = var55.getRank();
    java.lang.String var57 = var55.toString();
    java.lang.String var58 = var55.toString();
    var48.persistirDados(var55);
    classes.Ranking var60 = var46.lerDados(var55);
    java.util.List var61 = var55.getRank();
    classes.Ranking var62 = var36.lerDados(var55);
    boolean var65 = var62.CheckRanking("1\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - -90", (java.lang.Integer)(-989));
    var1.persistirDados(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ""+ "'", var58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test31");


    classes.Gamer var2 = new classes.Gamer("Nome: | Pontuacao: 1", (-3));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test32");


    classes.Operator var3 = new classes.Operator(109, (-1079), 190);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test33");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA - Nome: hi!| Pontuacao: 100 - 100");
    classes.Ranking var2 = new classes.Ranking();
    java.util.List var3 = var2.getRank();
    java.lang.String var4 = var2.toString();
    java.util.List var5 = var2.getRank();
    java.util.List var6 = var2.getRank();
    var1.persistirDados(var2);
    boolean var10 = var2.CheckRanking("1\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - -99", (java.lang.Integer)8910);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test34");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.toString();
    classes.Gamer var7 = new classes.Gamer("hi!", 100);
    java.lang.String var8 = var7.getName();
    java.lang.String var9 = var7.toString();
    int var10 = var7.getScore();
    int var11 = var2.compareTo(var7);
    classes.Gamer var14 = new classes.Gamer("hi!", 100);
    java.lang.String var15 = var14.toString();
    int var16 = var14.getScore();
    java.lang.String var17 = var14.getName();
    classes.Gamer var20 = new classes.Gamer("hi!", 100);
    java.lang.String var21 = var20.toString();
    int var22 = var20.getScore();
    classes.Gamer var25 = new classes.Gamer("hi!", 100);
    int var26 = var20.compareTo(var25);
    int var27 = var14.compareTo(var20);
    classes.Gamer var30 = new classes.Gamer("hi!", 100);
    java.lang.String var31 = var30.toString();
    int var32 = var30.getScore();
    classes.Gamer var35 = new classes.Gamer("hi!", 100);
    int var36 = var30.compareTo(var35);
    java.lang.String var37 = var35.toString();
    int var38 = var14.compareTo(var35);
    classes.Gamer var41 = new classes.Gamer("1\u00BA -  - -1", 100);
    classes.Gamer var44 = new classes.Gamer("hi!", 100);
    java.lang.String var45 = var44.toString();
    int var46 = var44.getScore();
    java.lang.String var47 = var44.getName();
    int var48 = var41.compareTo(var44);
    int var49 = var41.getScore();
    int var50 = var14.compareTo(var41);
    int var51 = var7.compareTo(var41);
    classes.Gamer var54 = new classes.Gamer("hi!", 100);
    java.lang.String var55 = var54.toString();
    int var56 = var54.getScore();
    java.lang.String var57 = var54.getName();
    classes.Gamer var60 = new classes.Gamer("hi!", 100);
    java.lang.String var61 = var60.toString();
    int var62 = var60.getScore();
    classes.Gamer var65 = new classes.Gamer("hi!", 100);
    int var66 = var60.compareTo(var65);
    int var67 = var54.compareTo(var60);
    classes.Gamer var70 = new classes.Gamer("hi!", 100);
    java.lang.String var71 = var70.toString();
    int var72 = var70.getScore();
    classes.Gamer var75 = new classes.Gamer("hi!", 100);
    int var76 = var70.compareTo(var75);
    java.lang.String var77 = var75.toString();
    int var78 = var54.compareTo(var75);
    int var79 = var41.compareTo(var54);
    java.lang.String var80 = var41.toString();
    int var81 = var41.getScore();
    int var82 = var41.getScore();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var4.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var9.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var15.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var21.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var31.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var37.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var45.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var55.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var61.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var71.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var77.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "Nome: 1\u00BA -  - -1| Pontuacao: 100"+ "'", var80.equals("Nome: 1\u00BA -  - -1| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 100);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test35");


    classes.Persistencia var1 = new classes.Persistencia("Nome: 1\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 102\u00BA - hi! - 10| Pontuacao: 98");
    classes.Persistencia var3 = new classes.Persistencia("hi!");
    classes.Ranking var4 = new classes.Ranking();
    boolean var7 = var4.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var10 = var4.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var11 = var3.lerDados(var4);
    classes.Persistencia var13 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Ranking var14 = new classes.Ranking();
    java.util.List var15 = var14.getRank();
    classes.Ranking var16 = var13.lerDados(var14);
    java.lang.String var17 = var16.toString();
    classes.Ranking var18 = var3.lerDados(var16);
    var1.persistirDados(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test36");


    classes.Gamer var2 = new classes.Gamer("1\u00BA - hi! - 02\u00BA - hi! - -1", (-90));
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Nome: 1\u00BA - hi! - 02\u00BA - hi! - -1| Pontuacao: -90"+ "'", var3.equals("Nome: 1\u00BA - hi! - 02\u00BA - hi! - -1| Pontuacao: -90"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test37");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 10");
    classes.Persistencia var3 = new classes.Persistencia("Nome: | Pontuacao: 1");
    classes.Persistencia var5 = new classes.Persistencia("hi!");
    classes.Ranking var6 = new classes.Ranking();
    boolean var9 = var6.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var12 = var6.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var13 = var5.lerDados(var6);
    classes.Ranking var14 = new classes.Ranking();
    java.util.List var15 = var14.getRank();
    java.lang.String var16 = var14.toString();
    var5.persistirDados(var14);
    classes.Ranking var18 = new classes.Ranking();
    java.util.List var19 = var18.getRank();
    classes.Ranking var20 = var5.lerDados(var18);
    classes.Persistencia var22 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var24 = new classes.Persistencia("");
    classes.Ranking var25 = new classes.Ranking();
    java.util.List var26 = var25.getRank();
    var24.persistirDados(var25);
    classes.Ranking var28 = new classes.Ranking();
    java.util.List var29 = var28.getRank();
    classes.Ranking var30 = var24.lerDados(var28);
    classes.Ranking var31 = new classes.Ranking();
    java.util.List var32 = var31.getRank();
    java.lang.String var33 = var31.toString();
    java.lang.String var34 = var31.toString();
    var24.persistirDados(var31);
    classes.Ranking var36 = var22.lerDados(var31);
    classes.Ranking var37 = new classes.Ranking();
    java.lang.String var38 = var37.toString();
    java.util.List var39 = var37.getRank();
    classes.Ranking var40 = var22.lerDados(var37);
    var5.persistirDados(var40);
    classes.Ranking var42 = new classes.Ranking();
    boolean var45 = var42.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var48 = var42.CheckRanking("hi!", (java.lang.Integer)(-1));
    java.util.List var49 = var42.getRank();
    java.util.List var50 = var42.getRank();
    classes.Ranking var51 = var5.lerDados(var42);
    classes.Ranking var52 = var3.lerDados(var51);
    classes.Persistencia var54 = new classes.Persistencia("hi!");
    classes.Ranking var55 = new classes.Ranking();
    boolean var58 = var55.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var61 = var55.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var62 = var54.lerDados(var55);
    classes.Persistencia var64 = new classes.Persistencia("");
    classes.Ranking var65 = new classes.Ranking();
    java.util.List var66 = var65.getRank();
    var64.persistirDados(var65);
    classes.Ranking var68 = new classes.Ranking();
    java.util.List var69 = var68.getRank();
    classes.Ranking var70 = var64.lerDados(var68);
    boolean var73 = var70.CheckRanking("", (java.lang.Integer)(-1));
    java.lang.String var74 = var70.toString();
    classes.Ranking var75 = var54.lerDados(var70);
    classes.Ranking var76 = new classes.Ranking();
    java.lang.String var77 = var76.toString();
    java.util.List var78 = var76.getRank();
    boolean var81 = var76.CheckRanking("Nome: hi!| Pontuacao: 100", (java.lang.Integer)100);
    boolean var84 = var76.CheckRanking("Nome: | Pontuacao: 2", (java.lang.Integer)2);
    classes.Ranking var85 = var54.lerDados(var76);
    java.lang.String var86 = var76.toString();
    classes.Ranking var87 = var3.lerDados(var76);
    java.util.List var88 = var87.getRank();
    classes.Ranking var89 = var1.lerDados(var87);
    java.lang.String var90 = var89.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "1\u00BA -  - -1"+ "'", var74.equals("1\u00BA -  - -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + ""+ "'", var77.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "1\u00BA - Nome: hi!| Pontuacao: 100 - 1002\u00BA - Nome: | Pontuacao: 2 - 2"+ "'", var86.equals("1\u00BA - Nome: hi!| Pontuacao: 100 - 1002\u00BA - Nome: | Pontuacao: 2 - 2"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + ""+ "'", var90.equals(""));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test38");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Ranking var2 = new classes.Ranking();
    java.util.List var3 = var2.getRank();
    classes.Ranking var4 = var1.lerDados(var2);
    classes.Persistencia var6 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Ranking var7 = new classes.Ranking();
    java.util.List var8 = var7.getRank();
    classes.Ranking var9 = var6.lerDados(var7);
    classes.Persistencia var11 = new classes.Persistencia("hi!");
    classes.Ranking var12 = new classes.Ranking();
    boolean var15 = var12.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var18 = var12.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var19 = var11.lerDados(var12);
    classes.Ranking var20 = new classes.Ranking();
    java.util.List var21 = var20.getRank();
    java.lang.String var22 = var20.toString();
    var11.persistirDados(var20);
    classes.Ranking var24 = new classes.Ranking();
    java.util.List var25 = var24.getRank();
    classes.Ranking var26 = var11.lerDados(var24);
    var6.persistirDados(var24);
    classes.Persistencia var29 = new classes.Persistencia("");
    classes.Ranking var30 = new classes.Ranking();
    java.util.List var31 = var30.getRank();
    var29.persistirDados(var30);
    java.lang.String var33 = var30.toString();
    java.lang.String var34 = var30.toString();
    classes.Ranking var35 = var6.lerDados(var30);
    boolean var38 = var30.CheckRanking("Nome: Nome: 1\u00BA -  - 2| Pontuacao: 1| Pontuacao: -99", (java.lang.Integer)(-1));
    classes.Ranking var39 = var1.lerDados(var30);
    classes.Persistencia var41 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var43 = new classes.Persistencia("hi!");
    classes.Ranking var44 = new classes.Ranking();
    boolean var47 = var44.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var50 = var44.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var51 = var43.lerDados(var44);
    classes.Ranking var52 = new classes.Ranking();
    java.util.List var53 = var52.getRank();
    java.lang.String var54 = var52.toString();
    var43.persistirDados(var52);
    classes.Ranking var56 = new classes.Ranking();
    java.util.List var57 = var56.getRank();
    classes.Ranking var58 = var43.lerDados(var56);
    var41.persistirDados(var58);
    classes.Persistencia var61 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var63 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var65 = new classes.Persistencia("");
    classes.Ranking var66 = new classes.Ranking();
    java.util.List var67 = var66.getRank();
    var65.persistirDados(var66);
    classes.Ranking var69 = new classes.Ranking();
    java.util.List var70 = var69.getRank();
    classes.Ranking var71 = var65.lerDados(var69);
    classes.Ranking var72 = new classes.Ranking();
    java.util.List var73 = var72.getRank();
    java.lang.String var74 = var72.toString();
    java.lang.String var75 = var72.toString();
    var65.persistirDados(var72);
    classes.Ranking var77 = var63.lerDados(var72);
    java.lang.String var78 = var77.toString();
    classes.Ranking var79 = var61.lerDados(var77);
    classes.Ranking var80 = var41.lerDados(var79);
    java.lang.String var81 = var80.toString();
    classes.Ranking var82 = var1.lerDados(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + ""+ "'", var74.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + ""+ "'", var75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + ""+ "'", var78.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + ""+ "'", var81.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test39");


    classes.Gamer var2 = new classes.Gamer("", 1);
    java.lang.String var3 = var2.getName();
    classes.Gamer var6 = new classes.Gamer("hi!", 100);
    java.lang.String var7 = var6.toString();
    java.lang.String var8 = var6.getName();
    classes.Gamer var11 = new classes.Gamer("hi!", 100);
    int var12 = var11.getScore();
    int var13 = var11.getScore();
    java.lang.String var14 = var11.getName();
    java.lang.String var15 = var11.getName();
    int var16 = var11.getScore();
    classes.Gamer var19 = new classes.Gamer("hi!", 100);
    java.lang.String var20 = var19.getName();
    java.lang.String var21 = var19.toString();
    int var22 = var19.getScore();
    java.lang.String var23 = var19.getName();
    java.lang.String var24 = var19.getName();
    classes.Gamer var27 = new classes.Gamer("hi!", 100);
    java.lang.String var28 = var27.toString();
    int var29 = var27.getScore();
    java.lang.String var30 = var27.getName();
    classes.Gamer var33 = new classes.Gamer("hi!", 100);
    java.lang.String var34 = var33.toString();
    int var35 = var33.getScore();
    classes.Gamer var38 = new classes.Gamer("hi!", 100);
    int var39 = var33.compareTo(var38);
    int var40 = var27.compareTo(var33);
    int var41 = var19.compareTo(var27);
    int var42 = var11.compareTo(var19);
    int var43 = var6.compareTo(var19);
    int var44 = var19.getScore();
    classes.Gamer var47 = new classes.Gamer("hi!", 100);
    java.lang.String var48 = var47.toString();
    int var49 = var19.compareTo(var47);
    java.lang.String var50 = var19.getName();
    int var51 = var2.compareTo(var19);
    java.lang.String var52 = var19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var7.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var21.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var28.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var34.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var48.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var52.equals("Nome: hi!| Pontuacao: 100"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test40");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    java.lang.String var3 = var2.toString();
    int var4 = var2.getScore();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getScore();
    classes.Gamer var9 = new classes.Gamer("hi!", 100);
    java.lang.String var10 = var9.getName();
    java.lang.String var11 = var9.toString();
    int var12 = var9.getScore();
    java.lang.String var13 = var9.getName();
    classes.Gamer var16 = new classes.Gamer("", 10);
    int var17 = var9.compareTo(var16);
    int var18 = var9.getScore();
    classes.Gamer var21 = new classes.Gamer("hi!", 10);
    classes.Gamer var24 = new classes.Gamer("hi!", 100);
    java.lang.String var25 = var24.getName();
    java.lang.String var26 = var24.toString();
    int var27 = var21.compareTo(var24);
    java.lang.String var28 = var24.getName();
    classes.Gamer var31 = new classes.Gamer("hi!", 100);
    java.lang.String var32 = var31.getName();
    java.lang.String var33 = var31.toString();
    int var34 = var31.getScore();
    java.lang.String var35 = var31.getName();
    java.lang.String var36 = var31.getName();
    classes.Gamer var39 = new classes.Gamer("hi!", 100);
    java.lang.String var40 = var39.toString();
    int var41 = var39.getScore();
    java.lang.String var42 = var39.getName();
    classes.Gamer var45 = new classes.Gamer("hi!", 100);
    java.lang.String var46 = var45.toString();
    int var47 = var45.getScore();
    classes.Gamer var50 = new classes.Gamer("hi!", 100);
    int var51 = var45.compareTo(var50);
    int var52 = var39.compareTo(var45);
    int var53 = var31.compareTo(var39);
    int var54 = var31.getScore();
    int var55 = var24.compareTo(var31);
    int var56 = var9.compareTo(var31);
    int var57 = var2.compareTo(var9);
    java.lang.String var58 = var2.toString();
    java.lang.String var59 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var3.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var5.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var11.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-90));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var26.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var33.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var40.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var46.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var58.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var59.equals("Nome: hi!| Pontuacao: 100"));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test41");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getName();
    classes.Gamer var7 = new classes.Gamer("hi!", 100);
    java.lang.String var8 = var7.getName();
    java.lang.String var9 = var7.toString();
    int var10 = var2.compareTo(var7);
    classes.Gamer var13 = new classes.Gamer("hi!", 100);
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.getName();
    classes.Gamer var18 = new classes.Gamer("hi!", 100);
    java.lang.String var19 = var18.getName();
    java.lang.String var20 = var18.toString();
    int var21 = var13.compareTo(var18);
    int var22 = var18.getScore();
    java.lang.String var23 = var18.toString();
    classes.Gamer var26 = new classes.Gamer("hi!", 100);
    java.lang.String var27 = var26.getName();
    java.lang.String var28 = var26.toString();
    int var29 = var26.getScore();
    java.lang.String var30 = var26.getName();
    java.lang.String var31 = var26.getName();
    java.lang.String var32 = var26.toString();
    java.lang.String var33 = var26.getName();
    int var34 = var18.compareTo(var26);
    classes.Gamer var37 = new classes.Gamer("hi!", 100);
    java.lang.String var38 = var37.toString();
    java.lang.String var39 = var37.getName();
    classes.Gamer var42 = new classes.Gamer("hi!", 100);
    java.lang.String var43 = var42.getName();
    java.lang.String var44 = var42.toString();
    int var45 = var37.compareTo(var42);
    int var46 = var42.getScore();
    java.lang.String var47 = var42.toString();
    classes.Gamer var50 = new classes.Gamer("hi!", 100);
    java.lang.String var51 = var50.getName();
    java.lang.String var52 = var50.toString();
    int var53 = var50.getScore();
    java.lang.String var54 = var50.getName();
    java.lang.String var55 = var50.getName();
    java.lang.String var56 = var50.toString();
    java.lang.String var57 = var50.getName();
    int var58 = var42.compareTo(var50);
    java.lang.String var59 = var50.getName();
    int var60 = var26.compareTo(var50);
    classes.Gamer var63 = new classes.Gamer("hi!", 100);
    int var64 = var63.getScore();
    java.lang.String var65 = var63.toString();
    int var66 = var63.getScore();
    int var67 = var63.getScore();
    int var68 = var63.getScore();
    int var69 = var63.getScore();
    classes.Gamer var72 = new classes.Gamer("1\u00BA -  - 12\u00BA - Nome: | Pontuacao: 2 - -99", 97);
    int var73 = var63.compareTo(var72);
    int var74 = var63.getScore();
    int var75 = var26.compareTo(var63);
    int var76 = var63.getScore();
    int var77 = var7.compareTo(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var3.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var9.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var14.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var20.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var23.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var28.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var32.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var38.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var44.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var47.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var52.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var56.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var65.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == (-1));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test42");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA -  - 2");
    classes.Persistencia var3 = new classes.Persistencia("hi!");
    classes.Ranking var4 = new classes.Ranking();
    boolean var7 = var4.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var10 = var4.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var11 = var3.lerDados(var4);
    classes.Ranking var12 = new classes.Ranking();
    java.util.List var13 = var12.getRank();
    java.lang.String var14 = var12.toString();
    var3.persistirDados(var12);
    classes.Persistencia var17 = new classes.Persistencia("hi!");
    classes.Persistencia var19 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var21 = new classes.Persistencia("");
    classes.Ranking var22 = new classes.Ranking();
    java.util.List var23 = var22.getRank();
    var21.persistirDados(var22);
    classes.Ranking var25 = new classes.Ranking();
    java.util.List var26 = var25.getRank();
    classes.Ranking var27 = var21.lerDados(var25);
    classes.Ranking var28 = new classes.Ranking();
    java.util.List var29 = var28.getRank();
    java.lang.String var30 = var28.toString();
    java.lang.String var31 = var28.toString();
    var21.persistirDados(var28);
    classes.Ranking var33 = var19.lerDados(var28);
    boolean var36 = var28.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    var17.persistirDados(var28);
    classes.Ranking var38 = var3.lerDados(var28);
    classes.Ranking var39 = var1.lerDados(var28);
    classes.Persistencia var41 = new classes.Persistencia("Nome: hi!| Pontuacao: 100");
    classes.Persistencia var43 = new classes.Persistencia("");
    classes.Ranking var44 = new classes.Ranking();
    java.util.List var45 = var44.getRank();
    var43.persistirDados(var44);
    classes.Ranking var47 = new classes.Ranking();
    java.util.List var48 = var47.getRank();
    classes.Ranking var49 = var43.lerDados(var47);
    var41.persistirDados(var49);
    classes.Ranking var51 = new classes.Ranking();
    boolean var54 = var51.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    boolean var57 = var51.CheckRanking("hi!", (java.lang.Integer)10);
    var41.persistirDados(var51);
    classes.Persistencia var60 = new classes.Persistencia("hi!");
    classes.Ranking var61 = new classes.Ranking();
    boolean var64 = var61.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var67 = var61.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var68 = var60.lerDados(var61);
    classes.Persistencia var70 = new classes.Persistencia("");
    classes.Ranking var71 = new classes.Ranking();
    java.util.List var72 = var71.getRank();
    var70.persistirDados(var71);
    classes.Ranking var74 = new classes.Ranking();
    java.util.List var75 = var74.getRank();
    classes.Ranking var76 = var70.lerDados(var74);
    boolean var79 = var76.CheckRanking("", (java.lang.Integer)(-1));
    java.lang.String var80 = var76.toString();
    classes.Ranking var81 = var60.lerDados(var76);
    classes.Ranking var82 = new classes.Ranking();
    boolean var85 = var82.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var88 = var82.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var89 = var60.lerDados(var82);
    classes.Ranking var90 = var41.lerDados(var82);
    java.lang.String var91 = var90.toString();
    java.util.List var92 = var90.getRank();
    classes.Ranking var93 = var1.lerDados(var90);
    java.util.List var94 = var93.getRank();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "1\u00BA -  - -1"+ "'", var80.equals("1\u00BA -  - -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + ""+ "'", var91.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test43");


    classes.Gamer var2 = new classes.Gamer("Nome: | Pontuacao: -1", 1089);
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Nome: Nome: | Pontuacao: -1| Pontuacao: 1089"+ "'", var3.equals("Nome: Nome: | Pontuacao: -1| Pontuacao: 1089"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test44");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    java.lang.String var3 = var2.getName();
    classes.Gamer var6 = new classes.Gamer("hi!", 100);
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.toString();
    classes.Gamer var11 = new classes.Gamer("hi!", 100);
    java.lang.String var12 = var11.getName();
    java.lang.String var13 = var11.toString();
    int var14 = var11.getScore();
    int var15 = var6.compareTo(var11);
    java.lang.String var16 = var11.toString();
    int var17 = var2.compareTo(var11);
    int var18 = var2.getScore();
    java.lang.String var19 = var2.toString();
    java.lang.String var20 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var8.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var13.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var16.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var19.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test45");


    classes.Gamer var2 = new classes.Gamer("1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0", (-99));
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Nome: 1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0| Pontuacao: -99"+ "'", var3.equals("Nome: 1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0| Pontuacao: -99"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0"+ "'", var4.equals("1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0"));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test46");


    classes.Gamer var2 = new classes.Gamer("Nome: 1\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - -90| Pontuacao: 8910", 101);
    classes.Gamer var5 = new classes.Gamer("hi!", 100);
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var5.toString();
    int var8 = var5.getScore();
    java.lang.String var9 = var5.getName();
    classes.Gamer var12 = new classes.Gamer("hi!", 10);
    classes.Gamer var15 = new classes.Gamer("hi!", 100);
    java.lang.String var16 = var15.getName();
    java.lang.String var17 = var15.toString();
    int var18 = var12.compareTo(var15);
    int var19 = var5.compareTo(var15);
    java.lang.String var20 = var5.toString();
    int var21 = var5.getScore();
    int var22 = var5.getScore();
    int var23 = var5.getScore();
    int var24 = var2.compareTo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var7.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var17.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var20.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test47");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    java.lang.String var3 = var2.toString();
    int var4 = var2.getScore();
    java.lang.String var5 = var2.getName();
    classes.Gamer var8 = new classes.Gamer("hi!", 100);
    java.lang.String var9 = var8.toString();
    int var10 = var8.getScore();
    classes.Gamer var13 = new classes.Gamer("hi!", 100);
    int var14 = var8.compareTo(var13);
    int var15 = var2.compareTo(var8);
    java.lang.String var16 = var2.getName();
    classes.Gamer var19 = new classes.Gamer("1\u00BA -  - -1", 100);
    classes.Gamer var22 = new classes.Gamer("hi!", 100);
    java.lang.String var23 = var22.toString();
    int var24 = var22.getScore();
    classes.Gamer var27 = new classes.Gamer("hi!", 100);
    int var28 = var22.compareTo(var27);
    java.lang.String var29 = var27.toString();
    java.lang.String var30 = var27.toString();
    int var31 = var19.compareTo(var27);
    classes.Gamer var34 = new classes.Gamer("hi!", 100);
    java.lang.String var35 = var34.toString();
    int var36 = var19.compareTo(var34);
    int var37 = var2.compareTo(var19);
    int var38 = var2.getScore();
    java.lang.String var39 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var3.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var9.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var23.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var29.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var30.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var35.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test48");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Ranking var2 = new classes.Ranking();
    java.util.List var3 = var2.getRank();
    classes.Ranking var4 = var1.lerDados(var2);
    classes.Persistencia var6 = new classes.Persistencia("hi!");
    classes.Persistencia var8 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var10 = new classes.Persistencia("");
    classes.Ranking var11 = new classes.Ranking();
    java.util.List var12 = var11.getRank();
    var10.persistirDados(var11);
    classes.Ranking var14 = new classes.Ranking();
    java.util.List var15 = var14.getRank();
    classes.Ranking var16 = var10.lerDados(var14);
    classes.Ranking var17 = new classes.Ranking();
    java.util.List var18 = var17.getRank();
    java.lang.String var19 = var17.toString();
    java.lang.String var20 = var17.toString();
    var10.persistirDados(var17);
    classes.Ranking var22 = var8.lerDados(var17);
    boolean var25 = var17.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    var6.persistirDados(var17);
    java.util.List var27 = var17.getRank();
    classes.Ranking var28 = var1.lerDados(var17);
    classes.Ranking var29 = new classes.Ranking();
    boolean var32 = var29.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    java.util.List var33 = var29.getRank();
    boolean var36 = var29.CheckRanking("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -13\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 104\u00BA - Nome: hi!| Pontuacao: 100 - 1089", (java.lang.Integer)(-98));
    var1.persistirDados(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test49");


    classes.Persistencia var1 = new classes.Persistencia("hi!");
    classes.Ranking var2 = new classes.Ranking();
    boolean var5 = var2.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var8 = var2.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var9 = var1.lerDados(var2);
    classes.Persistencia var11 = new classes.Persistencia("hi!");
    classes.Ranking var12 = new classes.Ranking();
    boolean var15 = var12.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var18 = var12.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var19 = var11.lerDados(var12);
    classes.Ranking var20 = new classes.Ranking();
    java.lang.String var21 = var20.toString();
    java.util.List var22 = var20.getRank();
    var11.persistirDados(var20);
    classes.Persistencia var25 = new classes.Persistencia("Nome: hi!| Pontuacao: 100");
    classes.Persistencia var27 = new classes.Persistencia("");
    classes.Ranking var28 = new classes.Ranking();
    java.util.List var29 = var28.getRank();
    var27.persistirDados(var28);
    classes.Ranking var31 = new classes.Ranking();
    java.util.List var32 = var31.getRank();
    classes.Ranking var33 = var27.lerDados(var31);
    var25.persistirDados(var33);
    java.lang.String var35 = var33.toString();
    classes.Ranking var36 = var11.lerDados(var33);
    classes.Persistencia var38 = new classes.Persistencia("hi!");
    classes.Persistencia var40 = new classes.Persistencia("hi!");
    classes.Ranking var41 = new classes.Ranking();
    boolean var44 = var41.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var47 = var41.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var48 = var40.lerDados(var41);
    var38.persistirDados(var41);
    classes.Ranking var50 = var11.lerDados(var41);
    classes.Ranking var51 = var1.lerDados(var41);
    java.lang.String var52 = var41.toString();
    java.lang.String var53 = var41.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "1\u00BA - hi! - 02\u00BA - hi! - -1"+ "'", var52.equals("1\u00BA - hi! - 02\u00BA - hi! - -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "1\u00BA - hi! - 02\u00BA - hi! - -1"+ "'", var53.equals("1\u00BA - hi! - 02\u00BA - hi! - -1"));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test50");


    classes.Ranking var0 = new classes.Ranking();
    boolean var3 = var0.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var6 = var0.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    java.util.List var7 = var0.getRank();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.CheckRanking("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -13\u00BA - 1\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 102\u00BA - hi! - 10 - 1004\u00BA - 1\u00BA - 1\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - 2 - 100 - 100", (java.lang.Integer)89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1"+ "'", var8.equals("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test51");


    classes.Persistencia var1 = new classes.Persistencia("");
    classes.Ranking var2 = new classes.Ranking();
    boolean var5 = var2.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    java.util.List var6 = var2.getRank();
    java.util.List var7 = var2.getRank();
    var1.persistirDados(var2);
    classes.Persistencia var10 = new classes.Persistencia("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1");
    classes.Persistencia var12 = new classes.Persistencia("hi!");
    classes.Ranking var13 = new classes.Ranking();
    boolean var16 = var13.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var19 = var13.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var20 = var12.lerDados(var13);
    classes.Ranking var21 = new classes.Ranking();
    java.util.List var22 = var21.getRank();
    java.lang.String var23 = var21.toString();
    var12.persistirDados(var21);
    classes.Ranking var25 = new classes.Ranking();
    java.util.List var26 = var25.getRank();
    classes.Ranking var27 = var12.lerDados(var25);
    classes.Persistencia var29 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var31 = new classes.Persistencia("");
    classes.Ranking var32 = new classes.Ranking();
    java.util.List var33 = var32.getRank();
    var31.persistirDados(var32);
    classes.Ranking var35 = new classes.Ranking();
    java.util.List var36 = var35.getRank();
    classes.Ranking var37 = var31.lerDados(var35);
    classes.Ranking var38 = new classes.Ranking();
    java.util.List var39 = var38.getRank();
    java.lang.String var40 = var38.toString();
    java.lang.String var41 = var38.toString();
    var31.persistirDados(var38);
    classes.Ranking var43 = var29.lerDados(var38);
    classes.Ranking var44 = new classes.Ranking();
    java.lang.String var45 = var44.toString();
    java.util.List var46 = var44.getRank();
    classes.Ranking var47 = var29.lerDados(var44);
    var12.persistirDados(var47);
    java.util.List var49 = var47.getRank();
    var10.persistirDados(var47);
    classes.Ranking var51 = new classes.Ranking();
    java.util.List var52 = var51.getRank();
    java.lang.String var53 = var51.toString();
    var10.persistirDados(var51);
    classes.Ranking var55 = var1.lerDados(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test52");


    classes.Operator var3 = new classes.Operator((-1), 1, (-1));
    int var4 = var3.getResult();
    int var5 = var3.getResult();
    int var6 = var3.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test53");


    classes.Ranking var0 = new classes.Ranking();
    java.util.List var1 = var0.getRank();
    java.lang.String var2 = var0.toString();
    java.util.List var3 = var0.getRank();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.CheckRanking("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)2);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.CheckRanking("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)(-1));
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "1\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - 2"+ "'", var8.equals("1\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - 2"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "1\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - 22\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - -1"+ "'", var12.equals("1\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - 22\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - -1"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test54");


    classes.Operator var3 = new classes.Operator(109, (-2), 989);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test55");


    classes.Ranking var0 = new classes.Ranking();
    boolean var3 = var0.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    boolean var6 = var0.CheckRanking("hi!", (java.lang.Integer)10);
    java.util.List var7 = var0.getRank();
    java.util.List var8 = var0.getRank();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test56");


    classes.Persistencia var1 = new classes.Persistencia("hi!");
    classes.Ranking var2 = new classes.Ranking();
    boolean var5 = var2.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var8 = var2.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var9 = var1.lerDados(var2);
    classes.Ranking var10 = new classes.Ranking();
    java.util.List var11 = var10.getRank();
    java.lang.String var12 = var10.toString();
    var1.persistirDados(var10);
    classes.Ranking var14 = new classes.Ranking();
    java.util.List var15 = var14.getRank();
    classes.Ranking var16 = var1.lerDados(var14);
    classes.Ranking var17 = new classes.Ranking();
    java.lang.String var18 = var17.toString();
    java.util.List var19 = var17.getRank();
    boolean var22 = var17.CheckRanking("Nome: hi!| Pontuacao: 100", (java.lang.Integer)100);
    classes.Ranking var23 = var1.lerDados(var17);
    classes.Persistencia var25 = new classes.Persistencia("Nome: 1\u00BA -  - -1| Pontuacao: 100");
    classes.Persistencia var27 = new classes.Persistencia("hi!");
    classes.Ranking var28 = new classes.Ranking();
    boolean var31 = var28.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var34 = var28.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var35 = var27.lerDados(var28);
    boolean var38 = var28.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    classes.Ranking var39 = var25.lerDados(var28);
    boolean var42 = var28.CheckRanking("1\u00BA - hi! - 02\u00BA - hi! - -1", (java.lang.Integer)10);
    classes.Ranking var43 = var1.lerDados(var28);
    classes.Persistencia var45 = new classes.Persistencia("hi!");
    classes.Ranking var46 = new classes.Ranking();
    boolean var49 = var46.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var52 = var46.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var53 = var45.lerDados(var46);
    classes.Ranking var54 = new classes.Ranking();
    java.lang.String var55 = var54.toString();
    java.util.List var56 = var54.getRank();
    var45.persistirDados(var54);
    classes.Ranking var58 = new classes.Ranking();
    boolean var61 = var58.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var64 = var58.CheckRanking("hi!", (java.lang.Integer)(-1));
    java.util.List var65 = var58.getRank();
    var45.persistirDados(var58);
    classes.Persistencia var68 = new classes.Persistencia("");
    classes.Ranking var69 = new classes.Ranking();
    java.util.List var70 = var69.getRank();
    var68.persistirDados(var69);
    classes.Ranking var72 = new classes.Ranking();
    java.util.List var73 = var72.getRank();
    classes.Ranking var74 = var68.lerDados(var72);
    boolean var77 = var74.CheckRanking("", (java.lang.Integer)(-1));
    classes.Ranking var78 = var45.lerDados(var74);
    classes.Persistencia var80 = new classes.Persistencia("hi!");
    classes.Ranking var81 = new classes.Ranking();
    boolean var84 = var81.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var87 = var81.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var88 = var80.lerDados(var81);
    classes.Ranking var89 = var45.lerDados(var88);
    java.util.List var90 = var89.getRank();
    java.util.List var91 = var89.getRank();
    boolean var94 = var89.CheckRanking("1\u00BA - hi! - 02\u00BA - Nome: hi!| Pontuacao: 100 - 100", (java.lang.Integer)100);
    classes.Ranking var95 = var1.lerDados(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test57");


    classes.Gamer var2 = new classes.Gamer("hi!", 10);
    classes.Gamer var5 = new classes.Gamer("hi!", 100);
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var5.toString();
    int var8 = var2.compareTo(var5);
    java.lang.String var9 = var5.getName();
    classes.Gamer var12 = new classes.Gamer("hi!", 100);
    java.lang.String var13 = var12.getName();
    java.lang.String var14 = var12.toString();
    int var15 = var12.getScore();
    java.lang.String var16 = var12.getName();
    java.lang.String var17 = var12.getName();
    classes.Gamer var20 = new classes.Gamer("hi!", 100);
    java.lang.String var21 = var20.toString();
    int var22 = var20.getScore();
    java.lang.String var23 = var20.getName();
    classes.Gamer var26 = new classes.Gamer("hi!", 100);
    java.lang.String var27 = var26.toString();
    int var28 = var26.getScore();
    classes.Gamer var31 = new classes.Gamer("hi!", 100);
    int var32 = var26.compareTo(var31);
    int var33 = var20.compareTo(var26);
    int var34 = var12.compareTo(var20);
    int var35 = var12.getScore();
    int var36 = var5.compareTo(var12);
    java.lang.String var37 = var5.getName();
    java.lang.String var38 = var5.toString();
    classes.Gamer var41 = new classes.Gamer("hi!", 100);
    java.lang.String var42 = var41.toString();
    int var43 = var41.getScore();
    java.lang.String var44 = var41.getName();
    classes.Gamer var47 = new classes.Gamer("hi!", 100);
    java.lang.String var48 = var47.toString();
    int var49 = var47.getScore();
    classes.Gamer var52 = new classes.Gamer("hi!", 100);
    int var53 = var47.compareTo(var52);
    int var54 = var41.compareTo(var47);
    classes.Gamer var57 = new classes.Gamer("hi!", 100);
    java.lang.String var58 = var57.toString();
    int var59 = var57.getScore();
    classes.Gamer var62 = new classes.Gamer("hi!", 100);
    int var63 = var57.compareTo(var62);
    java.lang.String var64 = var62.toString();
    int var65 = var41.compareTo(var62);
    classes.Gamer var68 = new classes.Gamer("hi!", 100);
    java.lang.String var69 = var68.getName();
    java.lang.String var70 = var68.toString();
    int var71 = var68.getScore();
    java.lang.String var72 = var68.getName();
    java.lang.String var73 = var68.getName();
    classes.Gamer var76 = new classes.Gamer("hi!", 100);
    java.lang.String var77 = var76.toString();
    int var78 = var76.getScore();
    java.lang.String var79 = var76.getName();
    classes.Gamer var82 = new classes.Gamer("hi!", 100);
    java.lang.String var83 = var82.toString();
    int var84 = var82.getScore();
    classes.Gamer var87 = new classes.Gamer("hi!", 100);
    int var88 = var82.compareTo(var87);
    int var89 = var76.compareTo(var82);
    int var90 = var68.compareTo(var76);
    classes.Gamer var93 = new classes.Gamer("1\u00BA -  - 2", 1);
    int var94 = var68.compareTo(var93);
    int var95 = var41.compareTo(var68);
    int var96 = var41.getScore();
    int var97 = var5.compareTo(var41);
    java.lang.String var98 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var7.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var14.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var21.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var27.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var38.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var42.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var48.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var58.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var64.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var70.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var77.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi!"+ "'", var79.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var83.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var98 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var98.equals("Nome: hi!| Pontuacao: 100"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test58");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA - 1\u00BA -  - 2 - 11");
    classes.Persistencia var3 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var5 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var7 = new classes.Persistencia("");
    classes.Ranking var8 = new classes.Ranking();
    java.util.List var9 = var8.getRank();
    var7.persistirDados(var8);
    classes.Ranking var11 = new classes.Ranking();
    java.util.List var12 = var11.getRank();
    classes.Ranking var13 = var7.lerDados(var11);
    classes.Ranking var14 = new classes.Ranking();
    java.util.List var15 = var14.getRank();
    java.lang.String var16 = var14.toString();
    java.lang.String var17 = var14.toString();
    var7.persistirDados(var14);
    classes.Ranking var19 = var5.lerDados(var14);
    java.lang.String var20 = var19.toString();
    classes.Ranking var21 = var3.lerDados(var19);
    classes.Persistencia var23 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var25 = new classes.Persistencia("");
    classes.Ranking var26 = new classes.Ranking();
    java.util.List var27 = var26.getRank();
    var25.persistirDados(var26);
    classes.Ranking var29 = new classes.Ranking();
    java.util.List var30 = var29.getRank();
    classes.Ranking var31 = var25.lerDados(var29);
    classes.Ranking var32 = new classes.Ranking();
    java.util.List var33 = var32.getRank();
    java.lang.String var34 = var32.toString();
    java.lang.String var35 = var32.toString();
    var25.persistirDados(var32);
    classes.Ranking var37 = var23.lerDados(var32);
    classes.Ranking var38 = new classes.Ranking();
    java.lang.String var39 = var38.toString();
    java.util.List var40 = var38.getRank();
    classes.Ranking var41 = var23.lerDados(var38);
    classes.Ranking var42 = var3.lerDados(var38);
    classes.Ranking var43 = new classes.Ranking();
    boolean var46 = var43.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var49 = var43.CheckRanking("Nome: hi!| Pontuacao: 100", (java.lang.Integer)100);
    classes.Ranking var50 = var3.lerDados(var43);
    java.util.List var51 = var50.getRank();
    var1.persistirDados(var50);
    classes.Persistencia var54 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var56 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var58 = new classes.Persistencia("");
    classes.Ranking var59 = new classes.Ranking();
    java.util.List var60 = var59.getRank();
    var58.persistirDados(var59);
    classes.Ranking var62 = new classes.Ranking();
    java.util.List var63 = var62.getRank();
    classes.Ranking var64 = var58.lerDados(var62);
    classes.Ranking var65 = new classes.Ranking();
    java.util.List var66 = var65.getRank();
    java.lang.String var67 = var65.toString();
    java.lang.String var68 = var65.toString();
    var58.persistirDados(var65);
    classes.Ranking var70 = var56.lerDados(var65);
    java.lang.String var71 = var70.toString();
    classes.Ranking var72 = var54.lerDados(var70);
    var1.persistirDados(var70);
    java.lang.String var74 = var70.toString();
    java.util.List var75 = var70.getRank();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + ""+ "'", var74.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test59");


    classes.Gamer var2 = new classes.Gamer("Nome: | Pontuacao: -1", (-90));
    int var3 = var2.getScore();
    classes.Gamer var6 = new classes.Gamer("1\u00BA - 1\u00BA - 1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1 - 2 - 100", 989);
    int var7 = var2.compareTo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-90));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1079);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test60");


    classes.Gamer var2 = new classes.Gamer("1\u00BA - Nome: 1\u00BA - hi! - 02\u00BA - hi! - -1| Pontuacao: 99 - 98", 198);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test61");


    classes.Operator var3 = new classes.Operator(199, 92, 92);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test62");


    classes.Gamer var2 = new classes.Gamer("1\u00BA - hi! - 02\u00BA - hi! - -1", 100);
    classes.Gamer var5 = new classes.Gamer("hi!", 100);
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var5.toString();
    int var8 = var5.getScore();
    classes.Gamer var11 = new classes.Gamer("hi!", 100);
    java.lang.String var12 = var11.getName();
    int var13 = var11.getScore();
    int var14 = var5.compareTo(var11);
    int var15 = var2.compareTo(var5);
    classes.Gamer var18 = new classes.Gamer("hi!", 0);
    java.lang.String var19 = var18.getName();
    classes.Gamer var22 = new classes.Gamer("hi!", 100);
    int var23 = var22.getScore();
    java.lang.String var24 = var22.toString();
    int var25 = var18.compareTo(var22);
    int var26 = var2.compareTo(var18);
    int var27 = var2.getScore();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var7.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var24.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 100);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test63");


    classes.Gamer var2 = new classes.Gamer("Nome: 1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0| Pontuacao: -2", 3);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test64");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var3 = new classes.Persistencia("");
    classes.Ranking var4 = new classes.Ranking();
    java.util.List var5 = var4.getRank();
    var3.persistirDados(var4);
    classes.Ranking var7 = new classes.Ranking();
    java.util.List var8 = var7.getRank();
    classes.Ranking var9 = var3.lerDados(var7);
    classes.Ranking var10 = new classes.Ranking();
    java.util.List var11 = var10.getRank();
    java.lang.String var12 = var10.toString();
    java.lang.String var13 = var10.toString();
    var3.persistirDados(var10);
    classes.Ranking var15 = var1.lerDados(var10);
    classes.Persistencia var17 = new classes.Persistencia("hi!");
    classes.Ranking var18 = new classes.Ranking();
    boolean var21 = var18.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var24 = var18.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var25 = var17.lerDados(var18);
    classes.Ranking var26 = new classes.Ranking();
    java.util.List var27 = var26.getRank();
    java.util.List var28 = var26.getRank();
    var17.persistirDados(var26);
    var1.persistirDados(var26);
    classes.Persistencia var32 = new classes.Persistencia("hi!");
    classes.Ranking var33 = new classes.Ranking();
    boolean var36 = var33.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var39 = var33.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var40 = var32.lerDados(var33);
    classes.Persistencia var42 = new classes.Persistencia("hi!");
    classes.Ranking var43 = new classes.Ranking();
    boolean var46 = var43.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var49 = var43.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var50 = var42.lerDados(var43);
    classes.Ranking var51 = new classes.Ranking();
    java.util.List var52 = var51.getRank();
    java.lang.String var53 = var51.toString();
    var42.persistirDados(var51);
    classes.Ranking var55 = new classes.Ranking();
    java.util.List var56 = var55.getRank();
    classes.Ranking var57 = var42.lerDados(var55);
    classes.Ranking var58 = var32.lerDados(var57);
    java.util.List var59 = var58.getRank();
    classes.Ranking var60 = var1.lerDados(var58);
    java.util.List var61 = var58.getRank();
    java.util.List var62 = var58.getRank();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test65");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA - Nome: | Pontuacao: 10 - 10");

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test66");


    classes.Gamer var2 = new classes.Gamer("Nome: Nome: 1\u00BA -  - 2| Pontuacao: 2| Pontuacao: 99", 8810);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test67");


    classes.Gamer var2 = new classes.Gamer("Nome: 1\u00BA -  - 2| Pontuacao: 1", 98);
    classes.Gamer var5 = new classes.Gamer("hi!", 100);
    java.lang.String var6 = var5.toString();
    int var7 = var5.getScore();
    java.lang.String var8 = var5.getName();
    classes.Gamer var11 = new classes.Gamer("hi!", 100);
    java.lang.String var12 = var11.toString();
    int var13 = var11.getScore();
    classes.Gamer var16 = new classes.Gamer("hi!", 100);
    int var17 = var11.compareTo(var16);
    int var18 = var5.compareTo(var11);
    classes.Gamer var21 = new classes.Gamer("hi!", 100);
    java.lang.String var22 = var21.toString();
    int var23 = var21.getScore();
    classes.Gamer var26 = new classes.Gamer("hi!", 100);
    int var27 = var21.compareTo(var26);
    java.lang.String var28 = var26.toString();
    int var29 = var5.compareTo(var26);
    classes.Gamer var32 = new classes.Gamer("1\u00BA -  - -1", 100);
    classes.Gamer var35 = new classes.Gamer("hi!", 100);
    java.lang.String var36 = var35.toString();
    int var37 = var35.getScore();
    java.lang.String var38 = var35.getName();
    int var39 = var32.compareTo(var35);
    int var40 = var32.getScore();
    int var41 = var5.compareTo(var32);
    int var42 = var32.getScore();
    java.lang.String var43 = var32.getName();
    int var44 = var2.compareTo(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var6.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var12.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var22.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var28.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var36.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "1\u00BA -  - -1"+ "'", var43.equals("1\u00BA -  - -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test68");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Ranking var2 = new classes.Ranking();
    java.util.List var3 = var2.getRank();
    classes.Ranking var4 = var1.lerDados(var2);
    classes.Persistencia var6 = new classes.Persistencia("hi!");
    classes.Ranking var7 = new classes.Ranking();
    boolean var10 = var7.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var13 = var7.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var14 = var6.lerDados(var7);
    classes.Ranking var15 = new classes.Ranking();
    java.util.List var16 = var15.getRank();
    java.lang.String var17 = var15.toString();
    var6.persistirDados(var15);
    classes.Ranking var19 = new classes.Ranking();
    java.util.List var20 = var19.getRank();
    classes.Ranking var21 = var6.lerDados(var19);
    var1.persistirDados(var19);
    classes.Persistencia var24 = new classes.Persistencia("hi!");
    classes.Ranking var25 = new classes.Ranking();
    boolean var28 = var25.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var31 = var25.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var32 = var24.lerDados(var25);
    classes.Ranking var33 = var1.lerDados(var32);
    classes.Ranking var34 = new classes.Ranking();
    boolean var37 = var34.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var40 = var34.CheckRanking("Nome: hi!| Pontuacao: 100", (java.lang.Integer)100);
    java.lang.String var41 = var34.toString();
    classes.Ranking var42 = var1.lerDados(var34);
    boolean var45 = var42.CheckRanking("1\u00BA - Nome: | Pontuacao: 2 - 2", (java.lang.Integer)(-178));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "1\u00BA - hi! - 02\u00BA - Nome: hi!| Pontuacao: 100 - 100"+ "'", var41.equals("1\u00BA - hi! - 02\u00BA - Nome: hi!| Pontuacao: 100 - 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test69");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getScore();
    java.lang.String var6 = var2.getName();
    classes.Gamer var9 = new classes.Gamer("", 10);
    int var10 = var2.compareTo(var9);
    java.lang.String var11 = var2.toString();
    classes.Gamer var14 = new classes.Gamer("hi!", 100);
    java.lang.String var15 = var14.toString();
    int var16 = var14.getScore();
    java.lang.String var17 = var14.getName();
    classes.Gamer var20 = new classes.Gamer("hi!", 100);
    java.lang.String var21 = var20.toString();
    int var22 = var20.getScore();
    classes.Gamer var25 = new classes.Gamer("hi!", 100);
    int var26 = var20.compareTo(var25);
    int var27 = var14.compareTo(var20);
    int var28 = var14.getScore();
    classes.Gamer var31 = new classes.Gamer("hi!", 100);
    java.lang.String var32 = var31.getName();
    int var33 = var31.getScore();
    classes.Gamer var36 = new classes.Gamer("1\u00BA -  - -1", 100);
    int var37 = var31.compareTo(var36);
    int var38 = var14.compareTo(var31);
    int var39 = var2.compareTo(var14);
    classes.Gamer var42 = new classes.Gamer("hi!", 100);
    java.lang.String var43 = var42.getName();
    int var44 = var42.getScore();
    int var45 = var42.getScore();
    int var46 = var2.compareTo(var42);
    classes.Gamer var49 = new classes.Gamer("hi!", 10);
    classes.Gamer var52 = new classes.Gamer("hi!", 100);
    java.lang.String var53 = var52.getName();
    java.lang.String var54 = var52.toString();
    int var55 = var49.compareTo(var52);
    java.lang.String var56 = var52.getName();
    int var57 = var42.compareTo(var52);
    java.lang.String var58 = var42.getName();
    java.lang.String var59 = var42.getName();
    java.lang.String var60 = var42.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var4.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-90));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var11.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var15.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var21.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var54.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var60.equals("Nome: hi!| Pontuacao: 100"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test70");


    classes.Persistencia var1 = new classes.Persistencia("Nome: | Pontuacao: -1");
    classes.Persistencia var3 = new classes.Persistencia("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1");
    classes.Persistencia var5 = new classes.Persistencia("");
    classes.Ranking var6 = new classes.Ranking();
    java.util.List var7 = var6.getRank();
    var5.persistirDados(var6);
    classes.Ranking var9 = new classes.Ranking();
    var5.persistirDados(var9);
    classes.Persistencia var12 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var14 = new classes.Persistencia("");
    classes.Ranking var15 = new classes.Ranking();
    java.util.List var16 = var15.getRank();
    var14.persistirDados(var15);
    classes.Ranking var18 = new classes.Ranking();
    java.util.List var19 = var18.getRank();
    classes.Ranking var20 = var14.lerDados(var18);
    classes.Ranking var21 = new classes.Ranking();
    java.util.List var22 = var21.getRank();
    java.lang.String var23 = var21.toString();
    java.lang.String var24 = var21.toString();
    var14.persistirDados(var21);
    classes.Ranking var26 = var12.lerDados(var21);
    java.lang.String var27 = var21.toString();
    var5.persistirDados(var21);
    classes.Ranking var29 = var3.lerDados(var21);
    classes.Persistencia var31 = new classes.Persistencia("");
    classes.Ranking var32 = new classes.Ranking();
    java.util.List var33 = var32.getRank();
    var31.persistirDados(var32);
    java.lang.String var35 = var32.toString();
    java.util.List var36 = var32.getRank();
    classes.Ranking var37 = var3.lerDados(var32);
    var1.persistirDados(var32);
    classes.Persistencia var40 = new classes.Persistencia("");
    classes.Ranking var41 = new classes.Ranking();
    java.util.List var42 = var41.getRank();
    var40.persistirDados(var41);
    classes.Ranking var44 = new classes.Ranking();
    java.util.List var45 = var44.getRank();
    classes.Ranking var46 = var40.lerDados(var44);
    classes.Ranking var47 = var1.lerDados(var46);
    classes.Persistencia var49 = new classes.Persistencia("hi!");
    classes.Ranking var50 = new classes.Ranking();
    boolean var53 = var50.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var56 = var50.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var57 = var49.lerDados(var50);
    java.util.List var58 = var57.getRank();
    classes.Ranking var59 = var1.lerDados(var57);
    java.lang.String var60 = var59.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test71");


    classes.Gamer var2 = new classes.Gamer("Nome: 1\u00BA - hi! - 02\u00BA - Nome: hi!| Pontuacao: 100 - 100| Pontuacao: 99", 110);
    int var3 = var2.getScore();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 110);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test72");


    classes.Gamer var2 = new classes.Gamer("hi!", 10);
    classes.Gamer var5 = new classes.Gamer("hi!", 100);
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var5.toString();
    int var8 = var2.compareTo(var5);
    java.lang.String var9 = var5.getName();
    classes.Gamer var12 = new classes.Gamer("hi!", 100);
    java.lang.String var13 = var12.getName();
    java.lang.String var14 = var12.toString();
    int var15 = var12.getScore();
    java.lang.String var16 = var12.getName();
    java.lang.String var17 = var12.getName();
    classes.Gamer var20 = new classes.Gamer("hi!", 100);
    java.lang.String var21 = var20.toString();
    int var22 = var20.getScore();
    java.lang.String var23 = var20.getName();
    classes.Gamer var26 = new classes.Gamer("hi!", 100);
    java.lang.String var27 = var26.toString();
    int var28 = var26.getScore();
    classes.Gamer var31 = new classes.Gamer("hi!", 100);
    int var32 = var26.compareTo(var31);
    int var33 = var20.compareTo(var26);
    int var34 = var12.compareTo(var20);
    int var35 = var12.getScore();
    int var36 = var5.compareTo(var12);
    java.lang.String var37 = var12.getName();
    int var38 = var12.getScore();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var7.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var14.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var21.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var27.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 100);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test73");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    int var3 = var2.getScore();
    int var4 = var2.getScore();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getName();
    classes.Gamer var9 = new classes.Gamer("hi!", 100);
    java.lang.String var10 = var9.getName();
    java.lang.String var11 = var9.toString();
    int var12 = var9.getScore();
    java.lang.String var13 = var9.getName();
    classes.Gamer var16 = new classes.Gamer("hi!", 10);
    classes.Gamer var19 = new classes.Gamer("hi!", 100);
    java.lang.String var20 = var19.getName();
    java.lang.String var21 = var19.toString();
    int var22 = var16.compareTo(var19);
    int var23 = var9.compareTo(var19);
    classes.Gamer var26 = new classes.Gamer("hi!", 100);
    java.lang.String var27 = var26.getName();
    java.lang.String var28 = var26.toString();
    int var29 = var26.getScore();
    classes.Gamer var32 = new classes.Gamer("hi!", 100);
    java.lang.String var33 = var32.getName();
    int var34 = var32.getScore();
    int var35 = var26.compareTo(var32);
    java.lang.String var36 = var32.getName();
    int var37 = var19.compareTo(var32);
    int var38 = var32.getScore();
    classes.Gamer var41 = new classes.Gamer("hi!", 100);
    java.lang.String var42 = var41.getName();
    java.lang.String var43 = var41.toString();
    int var44 = var41.getScore();
    java.lang.String var45 = var41.toString();
    java.lang.String var46 = var41.toString();
    int var47 = var32.compareTo(var41);
    int var48 = var2.compareTo(var41);
    classes.Gamer var51 = new classes.Gamer("hi!", 100);
    java.lang.String var52 = var51.getName();
    java.lang.String var53 = var51.toString();
    int var54 = var51.getScore();
    java.lang.String var55 = var51.getName();
    java.lang.String var56 = var51.getName();
    classes.Gamer var59 = new classes.Gamer("hi!", 100);
    java.lang.String var60 = var59.toString();
    int var61 = var59.getScore();
    java.lang.String var62 = var59.getName();
    classes.Gamer var65 = new classes.Gamer("hi!", 100);
    java.lang.String var66 = var65.toString();
    int var67 = var65.getScore();
    classes.Gamer var70 = new classes.Gamer("hi!", 100);
    int var71 = var65.compareTo(var70);
    int var72 = var59.compareTo(var65);
    int var73 = var51.compareTo(var59);
    int var74 = var51.getScore();
    int var75 = var51.getScore();
    int var76 = var51.getScore();
    int var77 = var51.getScore();
    int var78 = var41.compareTo(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var11.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var21.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var28.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var43.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var45.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var46.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var53.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var60.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var66.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == (-1));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test74");


    classes.Gamer var2 = new classes.Gamer("1\u00BA - Nome: | Pontuacao: 2 - 22\u00BA -  - 11", 100);
    java.lang.String var3 = var2.getName();
    classes.Gamer var6 = new classes.Gamer("hi!", 100);
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.toString();
    int var9 = var6.getScore();
    java.lang.String var10 = var6.getName();
    classes.Gamer var13 = new classes.Gamer("hi!", 10);
    classes.Gamer var16 = new classes.Gamer("hi!", 100);
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var16.toString();
    int var19 = var13.compareTo(var16);
    int var20 = var6.compareTo(var16);
    classes.Gamer var23 = new classes.Gamer("hi!", 100);
    java.lang.String var24 = var23.getName();
    java.lang.String var25 = var23.toString();
    int var26 = var23.getScore();
    classes.Gamer var29 = new classes.Gamer("hi!", 100);
    java.lang.String var30 = var29.getName();
    int var31 = var29.getScore();
    int var32 = var23.compareTo(var29);
    java.lang.String var33 = var29.getName();
    int var34 = var16.compareTo(var29);
    int var35 = var16.getScore();
    java.lang.String var36 = var16.getName();
    java.lang.String var37 = var16.toString();
    java.lang.String var38 = var16.toString();
    java.lang.String var39 = var16.toString();
    int var40 = var2.compareTo(var16);
    java.lang.String var41 = var16.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1\u00BA - Nome: | Pontuacao: 2 - 22\u00BA -  - 11"+ "'", var3.equals("1\u00BA - Nome: | Pontuacao: 2 - 22\u00BA -  - 11"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var8.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var18.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var25.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var37.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var38.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var39.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test75");


    classes.Operator var3 = new classes.Operator(97, (-9), 102);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test76");


    classes.Operator var3 = new classes.Operator(90, 90, 88);
    int var4 = var3.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test77");


    classes.Gamer var2 = new classes.Gamer("1\u00BA - Nome: 1\u00BA - hi! - 02\u00BA - hi! - -1| Pontuacao: 99 - -99", (-108));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test78");


    classes.Gamer var2 = new classes.Gamer("1\u00BA -  - 12\u00BA - 1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0 - 2", 1089);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test79");


    classes.Operator var3 = new classes.Operator(1088, 1079, (-89));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test80");


    classes.Gamer var2 = new classes.Gamer("1\u00BA -  - -1", 100);
    classes.Gamer var5 = new classes.Gamer("hi!", 100);
    java.lang.String var6 = var5.toString();
    int var7 = var5.getScore();
    classes.Gamer var10 = new classes.Gamer("hi!", 100);
    int var11 = var5.compareTo(var10);
    java.lang.String var12 = var10.toString();
    java.lang.String var13 = var10.toString();
    int var14 = var2.compareTo(var10);
    classes.Gamer var17 = new classes.Gamer("hi!", 100);
    java.lang.String var18 = var17.toString();
    int var19 = var2.compareTo(var17);
    int var20 = var2.getScore();
    java.lang.String var21 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var6.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var12.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var13.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var18.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Nome: 1\u00BA -  - -1| Pontuacao: 100"+ "'", var21.equals("Nome: 1\u00BA -  - -1| Pontuacao: 100"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test81");


    classes.Persistencia var1 = new classes.Persistencia("");
    classes.Ranking var2 = new classes.Ranking();
    boolean var5 = var2.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    java.util.List var6 = var2.getRank();
    java.util.List var7 = var2.getRank();
    var1.persistirDados(var2);
    classes.Persistencia var10 = new classes.Persistencia("");
    classes.Ranking var11 = new classes.Ranking();
    java.util.List var12 = var11.getRank();
    var10.persistirDados(var11);
    classes.Ranking var14 = new classes.Ranking();
    var10.persistirDados(var14);
    classes.Ranking var16 = new classes.Ranking();
    java.util.List var17 = var16.getRank();
    java.lang.String var18 = var16.toString();
    var10.persistirDados(var16);
    classes.Ranking var20 = var1.lerDados(var16);
    classes.Persistencia var22 = new classes.Persistencia("1\u00BA - hi! - 02\u00BA - hi! - -1");
    classes.Persistencia var24 = new classes.Persistencia("");
    classes.Ranking var25 = new classes.Ranking();
    java.util.List var26 = var25.getRank();
    var24.persistirDados(var25);
    classes.Ranking var28 = new classes.Ranking();
    var24.persistirDados(var28);
    classes.Ranking var30 = var22.lerDados(var28);
    classes.Persistencia var32 = new classes.Persistencia("1\u00BA - hi! - 02\u00BA - hi! - -1");
    classes.Persistencia var34 = new classes.Persistencia("");
    classes.Ranking var35 = new classes.Ranking();
    java.util.List var36 = var35.getRank();
    var34.persistirDados(var35);
    classes.Ranking var38 = new classes.Ranking();
    var34.persistirDados(var38);
    classes.Ranking var40 = var32.lerDados(var38);
    classes.Persistencia var42 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var44 = new classes.Persistencia("");
    classes.Ranking var45 = new classes.Ranking();
    java.util.List var46 = var45.getRank();
    var44.persistirDados(var45);
    classes.Ranking var48 = new classes.Ranking();
    java.util.List var49 = var48.getRank();
    classes.Ranking var50 = var44.lerDados(var48);
    classes.Ranking var51 = new classes.Ranking();
    java.util.List var52 = var51.getRank();
    java.lang.String var53 = var51.toString();
    java.lang.String var54 = var51.toString();
    var44.persistirDados(var51);
    classes.Ranking var56 = var42.lerDados(var51);
    java.util.List var57 = var51.getRank();
    classes.Ranking var58 = var32.lerDados(var51);
    classes.Ranking var59 = var22.lerDados(var51);
    java.lang.String var60 = var51.toString();
    classes.Ranking var61 = var1.lerDados(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test82");


    classes.Persistencia var1 = new classes.Persistencia("");
    classes.Ranking var2 = new classes.Ranking();
    java.util.List var3 = var2.getRank();
    var1.persistirDados(var2);
    classes.Ranking var5 = new classes.Ranking();
    java.util.List var6 = var5.getRank();
    classes.Ranking var7 = var1.lerDados(var5);
    classes.Persistencia var9 = new classes.Persistencia("1\u00BA - hi! - 02\u00BA - 1\u00BA -  - -1 - -1");
    classes.Persistencia var11 = new classes.Persistencia("");
    classes.Ranking var12 = new classes.Ranking();
    java.util.List var13 = var12.getRank();
    var11.persistirDados(var12);
    classes.Ranking var15 = new classes.Ranking();
    var11.persistirDados(var15);
    classes.Persistencia var18 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var20 = new classes.Persistencia("");
    classes.Ranking var21 = new classes.Ranking();
    java.util.List var22 = var21.getRank();
    var20.persistirDados(var21);
    classes.Ranking var24 = new classes.Ranking();
    java.util.List var25 = var24.getRank();
    classes.Ranking var26 = var20.lerDados(var24);
    classes.Ranking var27 = new classes.Ranking();
    java.util.List var28 = var27.getRank();
    java.lang.String var29 = var27.toString();
    java.lang.String var30 = var27.toString();
    var20.persistirDados(var27);
    classes.Ranking var32 = var18.lerDados(var27);
    java.lang.String var33 = var27.toString();
    var11.persistirDados(var27);
    classes.Ranking var35 = var9.lerDados(var27);
    var1.persistirDados(var27);
    boolean var39 = var27.CheckRanking("1\u00BA -  - 2", (java.lang.Integer)99);
    boolean var42 = var27.CheckRanking("Nome: Nome: | Pontuacao: 10| Pontuacao: 10", (java.lang.Integer)99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test83");


    classes.Operator var3 = new classes.Operator(190, 101, 200);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test84");


    classes.Persistencia var1 = new classes.Persistencia("hi!");
    classes.Ranking var2 = new classes.Ranking();
    boolean var5 = var2.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var8 = var2.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var9 = var1.lerDados(var2);
    classes.Ranking var10 = new classes.Ranking();
    java.lang.String var11 = var10.toString();
    java.util.List var12 = var10.getRank();
    var1.persistirDados(var10);
    classes.Ranking var14 = new classes.Ranking();
    boolean var17 = var14.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var20 = var14.CheckRanking("hi!", (java.lang.Integer)(-1));
    java.util.List var21 = var14.getRank();
    var1.persistirDados(var14);
    classes.Persistencia var24 = new classes.Persistencia("");
    classes.Ranking var25 = new classes.Ranking();
    java.util.List var26 = var25.getRank();
    var24.persistirDados(var25);
    classes.Ranking var28 = new classes.Ranking();
    java.util.List var29 = var28.getRank();
    classes.Ranking var30 = var24.lerDados(var28);
    boolean var33 = var30.CheckRanking("", (java.lang.Integer)(-1));
    classes.Ranking var34 = var1.lerDados(var30);
    classes.Persistencia var36 = new classes.Persistencia("hi!");
    classes.Ranking var37 = new classes.Ranking();
    boolean var40 = var37.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var43 = var37.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var44 = var36.lerDados(var37);
    classes.Ranking var45 = var1.lerDados(var44);
    boolean var48 = var44.CheckRanking("1\u00BA - hi! - 02\u00BA - hi! - -13\u00BA - 1\u00BA - 1\u00BA -  - -1 - -12\u00BA - 1\u00BA -  - 2 - 1 - 11", (java.lang.Integer)97);
    java.util.List var49 = var44.getRank();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test85");


    classes.Gamer var2 = new classes.Gamer("1\u00BA -  - -1", 100);
    classes.Gamer var5 = new classes.Gamer("hi!", 100);
    java.lang.String var6 = var5.toString();
    int var7 = var5.getScore();
    classes.Gamer var10 = new classes.Gamer("hi!", 100);
    int var11 = var5.compareTo(var10);
    java.lang.String var12 = var10.toString();
    java.lang.String var13 = var10.toString();
    int var14 = var2.compareTo(var10);
    classes.Gamer var17 = new classes.Gamer("Nome: hi!| Pontuacao: 100", 98);
    java.lang.String var18 = var17.toString();
    int var19 = var10.compareTo(var17);
    classes.Gamer var22 = new classes.Gamer("1\u00BA - 1\u00BA -  - -1 - -902\u00BA - Nome: | Pontuacao: -1 - -1", 90);
    int var23 = var10.compareTo(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var6.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var12.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var13.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Nome: Nome: hi!| Pontuacao: 100| Pontuacao: 98"+ "'", var18.equals("Nome: Nome: hi!| Pontuacao: 100| Pontuacao: 98"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-10));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test86");


    classes.Operator var3 = new classes.Operator(101, 198, (-11));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test87");


    classes.Persistencia var1 = new classes.Persistencia("hi!");
    classes.Ranking var2 = new classes.Ranking();
    boolean var5 = var2.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var8 = var2.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var9 = var1.lerDados(var2);
    classes.Ranking var10 = new classes.Ranking();
    java.lang.String var11 = var10.toString();
    java.util.List var12 = var10.getRank();
    var1.persistirDados(var10);
    classes.Persistencia var15 = new classes.Persistencia("Nome: hi!| Pontuacao: 100");
    classes.Persistencia var17 = new classes.Persistencia("");
    classes.Ranking var18 = new classes.Ranking();
    java.util.List var19 = var18.getRank();
    var17.persistirDados(var18);
    classes.Ranking var21 = new classes.Ranking();
    java.util.List var22 = var21.getRank();
    classes.Ranking var23 = var17.lerDados(var21);
    var15.persistirDados(var23);
    java.lang.String var25 = var23.toString();
    classes.Ranking var26 = var1.lerDados(var23);
    classes.Persistencia var28 = new classes.Persistencia("hi!");
    classes.Persistencia var30 = new classes.Persistencia("hi!");
    classes.Ranking var31 = new classes.Ranking();
    boolean var34 = var31.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var37 = var31.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var38 = var30.lerDados(var31);
    var28.persistirDados(var31);
    classes.Ranking var40 = var1.lerDados(var31);
    classes.Persistencia var42 = new classes.Persistencia("hi!");
    classes.Ranking var43 = new classes.Ranking();
    boolean var46 = var43.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var49 = var43.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    classes.Ranking var50 = var42.lerDados(var43);
    classes.Ranking var51 = new classes.Ranking();
    java.util.List var52 = var51.getRank();
    java.lang.String var53 = var51.toString();
    var42.persistirDados(var51);
    classes.Ranking var55 = new classes.Ranking();
    java.util.List var56 = var55.getRank();
    classes.Ranking var57 = var42.lerDados(var55);
    classes.Persistencia var59 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var61 = new classes.Persistencia("");
    classes.Ranking var62 = new classes.Ranking();
    java.util.List var63 = var62.getRank();
    var61.persistirDados(var62);
    classes.Ranking var65 = new classes.Ranking();
    java.util.List var66 = var65.getRank();
    classes.Ranking var67 = var61.lerDados(var65);
    classes.Ranking var68 = new classes.Ranking();
    java.util.List var69 = var68.getRank();
    java.lang.String var70 = var68.toString();
    java.lang.String var71 = var68.toString();
    var61.persistirDados(var68);
    classes.Ranking var73 = var59.lerDados(var68);
    classes.Ranking var74 = new classes.Ranking();
    java.lang.String var75 = var74.toString();
    java.util.List var76 = var74.getRank();
    classes.Ranking var77 = var59.lerDados(var74);
    var42.persistirDados(var77);
    classes.Ranking var79 = new classes.Ranking();
    boolean var82 = var79.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var85 = var79.CheckRanking("hi!", (java.lang.Integer)(-1));
    java.util.List var86 = var79.getRank();
    java.util.List var87 = var79.getRank();
    classes.Ranking var88 = var42.lerDados(var79);
    java.lang.String var89 = var88.toString();
    java.util.List var90 = var88.getRank();
    var1.persistirDados(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + ""+ "'", var75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + ""+ "'", var89.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test88");


    classes.Persistencia var1 = new classes.Persistencia("1\u00BA - hi! - 02\u00BA - hi! - -1");
    classes.Persistencia var3 = new classes.Persistencia("");
    classes.Ranking var4 = new classes.Ranking();
    java.util.List var5 = var4.getRank();
    var3.persistirDados(var4);
    classes.Ranking var7 = new classes.Ranking();
    var3.persistirDados(var7);
    classes.Persistencia var10 = new classes.Persistencia("hi!");
    classes.Persistencia var12 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var14 = new classes.Persistencia("");
    classes.Ranking var15 = new classes.Ranking();
    java.util.List var16 = var15.getRank();
    var14.persistirDados(var15);
    classes.Ranking var18 = new classes.Ranking();
    java.util.List var19 = var18.getRank();
    classes.Ranking var20 = var14.lerDados(var18);
    classes.Ranking var21 = new classes.Ranking();
    java.util.List var22 = var21.getRank();
    java.lang.String var23 = var21.toString();
    java.lang.String var24 = var21.toString();
    var14.persistirDados(var21);
    classes.Ranking var26 = var12.lerDados(var21);
    boolean var29 = var21.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    var10.persistirDados(var21);
    java.lang.String var31 = var21.toString();
    classes.Ranking var32 = var3.lerDados(var21);
    classes.Ranking var33 = var1.lerDados(var32);
    java.util.List var34 = var33.getRank();
    java.lang.String var35 = var33.toString();
    java.util.List var36 = var33.getRank();
    java.lang.String var37 = var33.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "1\u00BA - 1\u00BA -  - -1 - -1"+ "'", var31.equals("1\u00BA - 1\u00BA -  - -1 - -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test89");


    classes.Gamer var2 = new classes.Gamer("hi!", 100);
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getScore();
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    classes.Gamer var10 = new classes.Gamer("hi!", 10);
    classes.Gamer var13 = new classes.Gamer("hi!", 100);
    java.lang.String var14 = var13.getName();
    java.lang.String var15 = var13.toString();
    int var16 = var10.compareTo(var13);
    java.lang.String var17 = var13.getName();
    classes.Gamer var20 = new classes.Gamer("hi!", 100);
    java.lang.String var21 = var20.getName();
    java.lang.String var22 = var20.toString();
    int var23 = var20.getScore();
    java.lang.String var24 = var20.getName();
    java.lang.String var25 = var20.getName();
    classes.Gamer var28 = new classes.Gamer("hi!", 100);
    java.lang.String var29 = var28.toString();
    int var30 = var28.getScore();
    java.lang.String var31 = var28.getName();
    classes.Gamer var34 = new classes.Gamer("hi!", 100);
    java.lang.String var35 = var34.toString();
    int var36 = var34.getScore();
    classes.Gamer var39 = new classes.Gamer("hi!", 100);
    int var40 = var34.compareTo(var39);
    int var41 = var28.compareTo(var34);
    int var42 = var20.compareTo(var28);
    int var43 = var20.getScore();
    int var44 = var13.compareTo(var20);
    java.lang.String var45 = var20.getName();
    classes.Gamer var48 = new classes.Gamer("hi!", 100);
    java.lang.String var49 = var48.getName();
    java.lang.String var50 = var48.toString();
    classes.Gamer var53 = new classes.Gamer("hi!", 100);
    java.lang.String var54 = var53.getName();
    java.lang.String var55 = var53.toString();
    int var56 = var53.getScore();
    int var57 = var48.compareTo(var53);
    java.lang.String var58 = var48.getName();
    int var59 = var20.compareTo(var48);
    java.lang.String var60 = var48.getName();
    int var61 = var2.compareTo(var48);
    classes.Gamer var64 = new classes.Gamer("Nome: Nome: | Pontuacao: 10| Pontuacao: 10", (-108));
    java.lang.String var65 = var64.getName();
    int var66 = var2.compareTo(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var4.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var6.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var7.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var15.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var22.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var29.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var35.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var50.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Nome: hi!| Pontuacao: 100"+ "'", var55.equals("Nome: hi!| Pontuacao: 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "Nome: Nome: | Pontuacao: 10| Pontuacao: 10"+ "'", var65.equals("Nome: Nome: | Pontuacao: 10| Pontuacao: 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-208));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test90");


    classes.Gamer var2 = new classes.Gamer("1\u00BA - 1\u00BA - 1\u00BA -  - -1 - -12\u00BA -  - 103\u00BA - 1\u00BA - 1\u00BA -  - -1 - -1 - 0 - -2", (-208));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test91");


    classes.Persistencia var1 = new classes.Persistencia("hi!");
    classes.Persistencia var3 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var5 = new classes.Persistencia("");
    classes.Ranking var6 = new classes.Ranking();
    java.util.List var7 = var6.getRank();
    var5.persistirDados(var6);
    classes.Ranking var9 = new classes.Ranking();
    java.util.List var10 = var9.getRank();
    classes.Ranking var11 = var5.lerDados(var9);
    classes.Ranking var12 = new classes.Ranking();
    java.util.List var13 = var12.getRank();
    java.lang.String var14 = var12.toString();
    java.lang.String var15 = var12.toString();
    var5.persistirDados(var12);
    classes.Ranking var17 = var3.lerDados(var12);
    boolean var20 = var12.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-1));
    var1.persistirDados(var12);
    classes.Ranking var22 = new classes.Ranking();
    java.util.List var23 = var22.getRank();
    java.util.List var24 = var22.getRank();
    java.lang.String var25 = var22.toString();
    var1.persistirDados(var22);
    classes.Persistencia var28 = new classes.Persistencia("hi!");
    classes.Ranking var29 = new classes.Ranking();
    boolean var32 = var29.CheckRanking("hi!", (java.lang.Integer)0);
    boolean var35 = var29.CheckRanking("hi!", (java.lang.Integer)(-1));
    classes.Ranking var36 = var28.lerDados(var29);
    classes.Ranking var37 = var1.lerDados(var36);
    classes.Persistencia var39 = new classes.Persistencia("1\u00BA -  - -1");
    classes.Persistencia var41 = new classes.Persistencia("");
    classes.Ranking var42 = new classes.Ranking();
    java.util.List var43 = var42.getRank();
    var41.persistirDados(var42);
    classes.Ranking var45 = new classes.Ranking();
    java.util.List var46 = var45.getRank();
    classes.Ranking var47 = var41.lerDados(var45);
    classes.Ranking var48 = new classes.Ranking();
    java.util.List var49 = var48.getRank();
    java.lang.String var50 = var48.toString();
    java.lang.String var51 = var48.toString();
    var41.persistirDados(var48);
    classes.Ranking var53 = var39.lerDados(var48);
    classes.Persistencia var55 = new classes.Persistencia("");
    classes.Ranking var56 = new classes.Ranking();
    boolean var59 = var56.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    java.util.List var60 = var56.getRank();
    java.util.List var61 = var56.getRank();
    var55.persistirDados(var56);
    var39.persistirDados(var56);
    classes.Persistencia var65 = new classes.Persistencia("");
    classes.Ranking var66 = new classes.Ranking();
    boolean var69 = var66.CheckRanking("1\u00BA - 1\u00BA -  - -1 - -1", (java.lang.Integer)10);
    java.util.List var70 = var66.getRank();
    java.util.List var71 = var66.getRank();
    var65.persistirDados(var66);
    classes.Persistencia var74 = new classes.Persistencia("");
    classes.Ranking var75 = new classes.Ranking();
    java.util.List var76 = var75.getRank();
    var74.persistirDados(var75);
    classes.Ranking var78 = new classes.Ranking();
    var74.persistirDados(var78);
    classes.Ranking var80 = new classes.Ranking();
    java.util.List var81 = var80.getRank();
    java.lang.String var82 = var80.toString();
    var74.persistirDados(var80);
    classes.Ranking var84 = var65.lerDados(var80);
    boolean var87 = var84.CheckRanking("1\u00BA -  - -1", (java.lang.Integer)(-90));
    classes.Ranking var88 = var39.lerDados(var84);
    boolean var91 = var88.CheckRanking("", (java.lang.Integer)0);
    java.lang.String var92 = var88.toString();
    classes.Ranking var93 = var1.lerDados(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + ""+ "'", var82.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "1\u00BA -  - 0"+ "'", var92.equals("1\u00BA -  - 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

}
