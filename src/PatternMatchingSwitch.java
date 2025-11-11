//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PatternMatchingSwitch {
    public static void main(String[] args) {

        Object obj = 100;
        String result =  switch(obj){

             case Integer i ->  "int";
             default ->  "no match";
        };
        System.out.println(result);

    }
}