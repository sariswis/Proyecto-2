// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/CeeDee.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class CeeDee {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object A=null;
  public static Object B=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=24;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=25;
      A=$fix($opIntvlY('a','z'));
      $line=26;
      B=$fix($opIntvlY('0','9'));
      $line=27;
      Object coder=$fix(CeeDee.createCoder());
      $line=28;
      Object deCoder=$fix(CeeDee.createDecoder());
      $line=29;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,coder));
      $line=31;
      Utilities.testCodeDecode($cast(gold.structures.automaton.ITransducer.class,coder),$cast(gold.structures.automaton.ITransducer.class,deCoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CeeDee.class,"main",$line);
    }
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=35;
      gold.structures.set.ISet $v1=$newSet();
      $v2:for (Object d:GCollections.unmodifiableCollection(GCollections.asSet(3,2,5))) {
        for (Object s:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
          int $v3=$int(0);
          int $v4=$int(5)-1;
          for (int pos=$v3; pos<=$v4; pos++) {
            $v1.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object Q=$fix($opUnionY($opUnionY($v1,GCollections.asSet(3,2,5,"I","E")),$opCartsY(new Object[]{GCollections.asSet(3,2,5),$opIntvlY('a','z')})));
      $line=36;
      Object \u03A3=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(':','2','3','5')));
      $line=37;
      Object \u03A3_=$fix($opUnionY(\u03A3,GCollections.asSet('#')));
      $line=38;
      Object q_0=$fix("I");
      $line=39;
      gold.structures.set.ISet $v5=$newSet();
      $v6:for (Object d:GCollections.unmodifiableCollection(GCollections.asSet(3,2,5))) {
        for (Object s:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
          int $v7=$int(0);
          int $v8=$int(5)-1;
          for (int pos=$v7; pos<=$v8; pos++) {
            $v5.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object F=$fix($v5);
      $line=40;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(CeeDee.class,"\u03B4"),new GMethod(CeeDee.class,"g"),new GMethod(CeeDee.class,"h")});
      if (true) break $try;
      $line=41;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CeeDee.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=44;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=44;
        $result=$opSubtrY(input,'0');
        if (true) break $try;
      }
      else {
        $line=45;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=45;
          $result=GCollections.asList(state,input);
          if (true) break $try;
        }
        else {
          $line=46;
          if ($opMembrY(state,GCollections.asSet(2,3,5,"I","E"))) {
            $line=46;
            $result="E";
            if (true) break $try;
          }
          else {
            $line=47;
            if (($opEqualY($opAbsolY(state),2)&&$opEqualY(input,':'))) {
              $line=47;
              $result=GCollections.asList($getArrayValue(state,new Object[]{0}),$getArrayValue(state,new Object[]{1}),1);
              if (true) break $try;
            }
            else {
              $line=48;
              if (($opEqualY($opAbsolY(state),3)&&$opMembrY(input,$opIntvlY('a','z')))) {
                $line=49;
                Object $v9=$getArrayValue(state,new Object[]{0});
                Object $v10=$getArrayValue(state,new Object[]{1});
                Object $v11=$getArrayValue(state,new Object[]{2});
                Object d=$fix($v9);
                Object s=$fix($v10);
                Object pos=$fix($v11);
                $line=50;
                $result=GCollections.asList(d,s,$opModulY($opAdditY(pos,1),d));
                if (true) break $try;
              }
              else {
                $line=51;
                $result="E";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=53;
      $rethrow(new RuntimeException("The function \"\u03B4(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CeeDee.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=56;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=56;
        $result=input;
        if (true) break $try;
      }
      else {
        $line=57;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=57;
          $result=input;
          if (true) break $try;
        }
        else {
          $line=58;
          if ($opMembrY(state,GCollections.asSet(2,3,5,"I","E"))) {
            $line=58;
            $result="";
            if (true) break $try;
          }
          else {
            $line=59;
            if (($opEqualY($opAbsolY(state),2)&&$opEqualY(input,':'))) {
              $line=59;
              $result=":";
              if (true) break $try;
            }
            else {
              $line=60;
              if (($opEqualY($opAbsolY(state),3)&&$opMembrY(input,$opIntvlY('a','z')))) {
                $line=61;
                Object $v12=$getArrayValue(state,new Object[]{0});
                Object $v13=$getArrayValue(state,new Object[]{1});
                Object $v14=$getArrayValue(state,new Object[]{2});
                Object d=$fix($v12);
                Object s=$fix($v13);
                Object pos=$fix($v14);
                $line=62;
                if (($opEqualY(0,pos)&&$opEqualY(input,s))) {
                  $line=62;
                  $result="#";
                  if (true) break $try;
                }
                else {
                  $line=63;
                  if ($opEqualY(pos,1)) {
                    $line=63;
                    $result=CeeDee.shiftSymbol(input,d);
                    if (true) break $try;
                  }
                  else {
                    $line=64;
                    $result=input;
                    if (true) break $try;
                  }
                }
              }
              else {
                $line=66;
                $result="";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=68;
      $rethrow(new RuntimeException("The function \"h(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CeeDee.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=71;
      $result="";
      if (true) break $try;
      $line=72;
      $rethrow(new RuntimeException("The function \"g(s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CeeDee.class,"g",$line);
    }
    return $result;
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=75;
      gold.structures.set.ISet $v15=$newSet();
      $v16:for (Object d:GCollections.unmodifiableCollection(GCollections.asSet(3,2,5))) {
        for (Object s:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
          for (Object pos:GCollections.unmodifiableCollection($opUnionY($opIntvlY(0,4),GCollections.asSet("_")))) {
            $v15.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object Q=$fix($opUnionY($v15,GCollections.asSet(3,2,5,"I","E")));
      $line=76;
      Object \u03A3_=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(':','2','3','5')));
      $line=77;
      Object \u03A3=$fix($opUnionY(\u03A3_,GCollections.asSet('#')));
      $line=78;
      Object q_0=$fix("I");
      $line=79;
      gold.structures.set.ISet $v17=$newSet();
      $v18:for (Object d:GCollections.unmodifiableCollection(GCollections.asSet(3,2,5))) {
        for (Object s:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
          int $v19=$int(0);
          int $v20=$int(5)-1;
          for (int pos=$v19; pos<=$v20; pos++) {
            $v17.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object F=$fix($v17);
      $line=80;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(CeeDee.class,"\u03B41"),new GMethod(CeeDee.class,"g"),new GMethod(CeeDee.class,"h1")});
      if (true) break $try;
      $line=81;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CeeDee.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B41(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=84;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=84;
        $result=$opSubtrY(input,'0');
        if (true) break $try;
      }
      else {
        $line=85;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=85;
          $result=GCollections.asList(state,input,"_");
          if (true) break $try;
        }
        else {
          $line=86;
          $result="E";
          if (true) break $try;
        }
      }
      $line=88;
      $rethrow(new RuntimeException("The function \"\u03B41(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CeeDee.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object \u03B41(java.lang.Iterable $v21, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v22=GCollections.unmodifiableCollection($v21).iterator();
      Object d=$v22.next();
      Object s=$v22.next();
      Object pos=$v22.next();
      $line=91;
      if (($opEqualY(pos,"_")&&$opEqualY(input,':'))) {
        $line=91;
        $result=GCollections.asList(d,s,1);
        if (true) break $try;
      }
      else {
        $line=92;
        if ($opEqualY(pos,"_")) {
          $line=92;
          $result="E";
          if (true) break $try;
        }
        else {
          $line=93;
          if (($opEqualY(input,'#')&&!$opEqualY(pos,0))) {
            $line=93;
            $result="E";
            if (true) break $try;
          }
          else {
            $line=94;
            if (($opEqualY(input,s)&&$opEqualY(pos,0))) {
              $line=94;
              $result="E";
              if (true) break $try;
            }
            else {
              $line=95;
              if ($opMembrY(input,$opUnionY($opIntvlY('a','z'),GCollections.asSet('#')))) {
                $line=95;
                $result=GCollections.asList(d,s,$opModulY($opAdditY(pos,1),d));
                if (true) break $try;
              }
              else {
                $line=96;
                $result="E";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=98;
      $rethrow(new RuntimeException("The function \"\u03B41(\u27E8d,s,pos\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CeeDee.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object h1(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=101;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=101;
        $result=$opSubtrY(input,'0');
        if (true) break $try;
      }
      else {
        $line=102;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=102;
          $result=input;
          if (true) break $try;
        }
        else {
          $line=103;
          $result="";
          if (true) break $try;
        }
      }
      $line=105;
      $rethrow(new RuntimeException("The function \"h1(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CeeDee.class,"h1",$line);
    }
    return $result;
  }
  public static Object h1(java.lang.Iterable $v23, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v24=GCollections.unmodifiableCollection($v23).iterator();
      Object d=$v24.next();
      Object s=$v24.next();
      Object pos=$v24.next();
      $line=108;
      if (($opEqualY(pos,"_")&&$opEqualY(input,':'))) {
        $line=108;
        $result=input;
        if (true) break $try;
      }
      else {
        $line=109;
        if (($opEqualY(input,'#')&&$opEqualY(pos,0))) {
          $line=109;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=110;
          if (($opMembrY(input,$opIntvlY('a','z'))&&$opEqualY(pos,1))) {
            $line=110;
            $result=CeeDee.shiftSymbol(input,$opMinusY(d));
            if (true) break $try;
          }
          else {
            $line=111;
            if ($opMembrY(input,$opIntvlY('a','z'))) {
              $line=111;
              $result=input;
              if (true) break $try;
            }
            else {
              $line=112;
              $result="";
              if (true) break $try;
            }
          }
        }
      }
      $line=114;
      $rethrow(new RuntimeException("The function \"h1(\u27E8d,s,pos\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CeeDee.class,"h1",$line);
    }
    return $result;
  }
  public static Object shiftSymbol(Object symbol, Object shift) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=117;
      Character r=null;
      r=$defaultValue(Character.class);
      $line=118;
      if ($opMembrY(symbol,$opIntvlY('a','z'))) {
        $line=119;
        r=$cast(Character.class,$fix($opAdditY('a',$opModulY($opAdditY($opSubtrY(symbol,'a'),shift),26))));
      }
      else {
        $line=120;
        if ($opMembrY(symbol,$opIntvlY('A','Z'))) {
          $line=121;
          r=$cast(Character.class,$fix($opAdditY('A',$opModulY($opAdditY($opSubtrY(symbol,'A'),shift),26))));
        }
        else {
          $line=122;
          if ($opMembrY(symbol,$opIntvlY('0','9'))) {
            $line=123;
            r=$cast(Character.class,$fix($opAdditY('0',$opModulY($opAdditY($opSubtrY(symbol,'0'),shift),10))));
          }
          else {
            $line=124;
            r=$cast(Character.class,$fix(r));
          }
        }
      }
      $line=126;
      $result=r;
      if (true) break $try;
      $line=127;
      $rethrow(new RuntimeException("The function \"shiftSymbol(symbol:Object,shift:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CeeDee.class,"shiftSymbol",$line);
    }
    return $result;
  }
}
