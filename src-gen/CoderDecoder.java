// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/CoderDecoder.gold"
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
public final class CoderDecoder {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=21;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=22;
      Object coder=$fix(CoderDecoder.createCoder());
      $line=24;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,coder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CoderDecoder.class,"main",$line);
    }
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=30;
      Object Q=$fix($opUnionY($opCartsY(new Object[]{GCollections.asSet('0','a','b','c'),GCollections.asSet('0','a','b','c'),GCollections.asSet('0','a','b','c'),GCollections.asSet('0','1','2','&')}),GCollections.asSet('e')));
      $line=31;
      Object \u03A3=$fix($opUnionY($opIntvlY('a','c'),GCollections.asSet('&')));
      $line=32;
      Object \u03A3_=$fix($opUnionY(\u03A3,GCollections.asSet('*')));
      $line=33;
      Object q_0=$fix(GCollections.asList('0','0','0','0'));
      $line=34;
      gold.structures.set.ISet $v1=$newSet();
      $v2:for (Object d:GCollections.unmodifiableCollection($opIntvlY('a','c'))) {
        for (Object e:GCollections.unmodifiableCollection($opIntvlY('a','c'))) {
          for (Object f:GCollections.unmodifiableCollection($opIntvlY('a','c'))) {
            $v1.add(GCollections.asList(d,e,f,'0'));
          }
        }
      }
      Object F=$fix($v1);
      $line=35;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(CoderDecoder.class,"\u03B4"),new GMethod(CoderDecoder.class,"g"),new GMethod(CoderDecoder.class,"h")});
      if (true) break $try;
      $line=36;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CoderDecoder.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object p, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=39;
      $result='e';
      if (true) break $try;
      $line=40;
      $rethrow(new RuntimeException("The function \"\u03B4(p:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CoderDecoder.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object \u03B4(java.lang.Iterable $v3, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v4=GCollections.unmodifiableCollection($v3).iterator();
      Object p=$v4.next();
      Object q=$v4.next();
      Object r=$v4.next();
      Object s=$v4.next();
      $line=43;
      if ((((($opEqualY(p,'0')&&$opEqualY(q,'0'))&&$opEqualY(r,'0'))&&$opEqualY(s,'0'))&&!$opEqualY(input,'&'))) {
        $line=43;
        $result=GCollections.asList(input,q,r,s);
        if (true) break $try;
      }
      else {
        $line=44;
        if (((((!$opEqualY(p,'0')&&$opEqualY(q,'0'))&&$opEqualY(r,'0'))&&$opEqualY(s,'0'))&&!$opEqualY(input,'&'))) {
          $line=44;
          $result=GCollections.asList(p,input,r,s);
          if (true) break $try;
        }
        else {
          $line=45;
          if (((((!$opEqualY(p,'0')&&!$opEqualY(q,'0'))&&$opEqualY(r,'0'))&&$opEqualY(s,'0'))&&!$opEqualY(input,'&'))) {
            $line=45;
            $result=GCollections.asList(p,q,input,s);
            if (true) break $try;
          }
          else {
            $line=46;
            if (((((!$opEqualY(p,'0')&&!$opEqualY(q,'0'))&&!$opEqualY(r,'0'))&&$opEqualY(s,'0'))&&$opEqualY(input,'&'))) {
              $line=46;
              $result=GCollections.asList(p,q,r,input);
              if (true) break $try;
            }
            else {
              $line=47;
              if ((((!$opEqualY(p,'0')&&!$opEqualY(q,'0'))&&!$opEqualY(r,'0'))&&$opEqualY(s,'&'))) {
                $line=48;
                if ($opEqualY(input,'&')) {
                  $line=48;
                  $result='e';
                  if (true) break $try;
                }
                else {
                  $line=49;
                  if ($opEqualY(input,p)) {
                    $line=49;
                    $result=GCollections.asList(p,q,r,'1');
                    if (true) break $try;
                  }
                  else {
                    $line=50;
                    $result=GCollections.asList(input,'0','0','0');
                    if (true) break $try;
                  }
                }
              }
              else {
                $line=52;
                if ((((!$opEqualY(p,'0')&&!$opEqualY(q,'0'))&&!$opEqualY(r,'0'))&&$opEqualY(s,'1'))) {
                  $line=53;
                  if ($opEqualY(input,'&')) {
                    $line=53;
                    $result='e';
                    if (true) break $try;
                  }
                  else {
                    $line=54;
                    if ($opEqualY(input,q)) {
                      $line=54;
                      $result=GCollections.asList(p,q,r,'2');
                      if (true) break $try;
                    }
                    else {
                      $line=55;
                      $result=GCollections.asList(p,input,'0','0');
                      if (true) break $try;
                    }
                  }
                }
                else {
                  $line=57;
                  if ((((!$opEqualY(p,'0')&&!$opEqualY(q,'0'))&&!$opEqualY(r,'0'))&&$opEqualY(s,'2'))) {
                    $line=58;
                    if ($opEqualY(input,'&')) {
                      $line=58;
                      $result='e';
                      if (true) break $try;
                    }
                    else {
                      $line=59;
                      if ($opEqualY(input,r)) {
                        $line=59;
                        $result=GCollections.asList(p,q,r,'0');
                        if (true) break $try;
                      }
                      else {
                        $line=60;
                        $result=GCollections.asList(p,q,input,'0');
                        if (true) break $try;
                      }
                    }
                  }
                  else {
                    $line=62;
                    $result='e';
                    if (true) break $try;
                  }
                }
              }
            }
          }
        }
      }
      $line=64;
      $rethrow(new RuntimeException("The function \"\u03B4(\u27E8p,q,r,s\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CoderDecoder.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object p, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=67;
      $result="";
      if (true) break $try;
      $line=68;
      $rethrow(new RuntimeException("The function \"h(p:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CoderDecoder.class,"h",$line);
    }
    return $result;
  }
  public static Object h(java.lang.Iterable $v5, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v6=GCollections.unmodifiableCollection($v5).iterator();
      Object p=$v6.next();
      Object q=$v6.next();
      Object r=$v6.next();
      Object s=$v6.next();
      $line=71;
      $result="";
      if (true) break $try;
      $line=72;
      $rethrow(new RuntimeException("The function \"h(\u27E8p,q,r,s\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CoderDecoder.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=75;
      $result="";
      if (true) break $try;
      $line=76;
      $rethrow(new RuntimeException("The function \"g(s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CoderDecoder.class,"g",$line);
    }
    return $result;
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=79;
      Object Q=$fix($opCartsY(new Object[]{$opCartsY(new Object[]{GCollections.asSet('0','a','b','c'),GCollections.asSet('0','a','b','c')}),$opCartsY(new Object[]{GCollections.asSet('0','a','b','c'),GCollections.asSet('0','a','b','c')})}));
      $line=80;
      Object \u03A3=$fix($opUnionY($opIntvlY('a','c'),GCollections.asSet('&')));
      $line=81;
      Object \u03A3_=$fix($opUnionY(\u03A3,GCollections.asSet('*')));
      $line=82;
      Object q_0=$fix(GCollections.asList(GCollections.asList('0','0','0'),GCollections.asList('0','0','0')));
      $line=83;
      gold.structures.set.ISet $v7=$newSet();
      $v8:for (Object d:GCollections.unmodifiableCollection($opIntvlY('a','c'))) {
        $v7.add(GCollections.asList(GCollections.asList(d,d,d),GCollections.asList(d,d,d)));
      }
      Object F=$fix($v7);
      $line=84;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(CoderDecoder.class,"\u03B41"),new GMethod(CoderDecoder.class,"g"),new GMethod(CoderDecoder.class,"h1")});
      if (true) break $try;
      $line=85;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CoderDecoder.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B41(Object p, Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=89;
      $rethrow(new RuntimeException("The function \"\u03B41(p:Object,q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CoderDecoder.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object h1(Object p, Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=93;
      $rethrow(new RuntimeException("The function \"h1(p:Object,q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CoderDecoder.class,"h1",$line);
    }
    return $result;
  }
  public static Object shiftSymbol(Object symbol, Object shift) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=96;
      Character r=null;
      r=$defaultValue(Character.class);
      $line=97;
      if ($opMembrY(symbol,$opIntvlY('a','z'))) {
        $line=98;
        r=$cast(Character.class,$fix($opAdditY('a',$opModulY($opAdditY($opSubtrY(symbol,'a'),shift),26))));
      }
      else {
        $line=99;
        if ($opMembrY(symbol,$opIntvlY('A','Z'))) {
          $line=100;
          r=$cast(Character.class,$fix($opAdditY('A',$opModulY($opAdditY($opSubtrY(symbol,'A'),shift),26))));
        }
        else {
          $line=101;
          if ($opMembrY(symbol,$opIntvlY('0','9'))) {
            $line=102;
            r=$cast(Character.class,$fix($opAdditY('0',$opModulY($opAdditY($opSubtrY(symbol,'0'),shift),10))));
          }
          else {
            $line=103;
            r=$cast(Character.class,$fix(r));
          }
        }
      }
      $line=105;
      $result=r;
      if (true) break $try;
      $line=106;
      $rethrow(new RuntimeException("The function \"shiftSymbol(symbol:Object,shift:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CoderDecoder.class,"shiftSymbol",$line);
    }
    return $result;
  }
}
