package ro.cts.main;

import ro.cts.clase.*;

import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException, ClassNotFoundException {
        AgentieEager agentieEager = AgentieEager.getInstanta();
        AgentieEager agentieEager2 = AgentieEager.getInstanta();
        System.out.println(agentieEager);
        agentieEager.setNumeAgentie("XXX");
        System.out.println(agentieEager2);


        AgentieLazy agentieLazy = AgentieLazy.getInstance("Agentie XXX",5000,1);
        System.out.println(agentieLazy);
        AgentieLazy agentieLazy2 = AgentieLazy.getInstance("Agentia YYY",2500,3);
        System.out.println(agentieLazy2);
        agentieLazy2.setCapital(3000);
        System.out.println(agentieLazy);

        AgentieStaticBlock agentieStaticBlock = AgentieStaticBlock.getInstanta();
        System.out.println(agentieStaticBlock);
        AgentieStaticBlock agentieStaticBlock2 = AgentieStaticBlock.getInstanta();
        agentieStaticBlock2.setNumeAgentie("BBB");
        System.out.println(agentieStaticBlock2);
        System.out.println(agentieStaticBlock);

        AgentieThreadSafe agentieThreadSafe = AgentieThreadSafe.getInstance("A1",1000,5);
        AgentieThreadSafe agentieThreadSafe2 = AgentieThreadSafe.getInstance("A2",2000,7);
        System.out.println(agentieThreadSafe);
        agentieThreadSafe.setCapital(1200);
        System.out.println(agentieThreadSafe2);

        //
        AgentieSerialization agentieSerialization = AgentieSerialization.getInstance("xyz",1000,2);
        System.out.println(agentieSerialization);
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(("fisier.dat")));
        out.writeObject(agentieSerialization);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("fisier.dat"));
        AgentieSerialization agentieSerialization2 = (AgentieSerialization) in.readObject();


        agentieSerialization2.setNrAngajati(4);
        agentieSerialization2.setCapital(1400);
        agentieSerialization2.setNume("XYZ");

        System.out.println(agentieSerialization2);
        System.out.println(agentieSerialization);
        //
    }
}
