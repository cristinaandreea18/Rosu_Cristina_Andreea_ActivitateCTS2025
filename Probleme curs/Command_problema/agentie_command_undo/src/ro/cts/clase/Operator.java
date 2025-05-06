package ro.cts.clase;

import java.util.Stack;

public class Operator {
    Stack<Command> stivaComenzi = new Stack<>();

    public void invoca(Command comanda){
        comanda.execute();
        stivaComenzi.push(comanda);
    }

    public void undo(){
        if(!stivaComenzi.isEmpty()){
            stivaComenzi.pop().unexecute();
        }
    }
}
