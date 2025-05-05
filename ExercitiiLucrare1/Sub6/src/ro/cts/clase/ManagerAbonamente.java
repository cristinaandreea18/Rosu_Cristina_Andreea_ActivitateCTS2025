package ro.cts.clase;

import java.util.HashSet;
import java.util.Set;

public class ManagerAbonamente implements AbstractSubscriptionManager {
    private String canalSubscription;
    private static ManagerAbonamente instance = null;
    private Set<Integer> listaUnicaId = new HashSet<>();

    private ManagerAbonamente(String canalSubscription){
        this.canalSubscription = canalSubscription;
    }

    @Override
    public void addSubscription(int id) {
        if(!listaUnicaId.contains(id)){
            listaUnicaId.add(id);
        }else{
            throw  new IllegalArgumentException("ID-ul exista deja");
        }
    }

    public static synchronized ManagerAbonamente getInstance(String canalSubscription){
        if(instance==null){
            instance = new ManagerAbonamente(canalSubscription);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManagerAbonamente{");
        sb.append("canalSubscription='").append(canalSubscription).append('\'');
        sb.append(", listaUnicaId=").append(listaUnicaId);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean isSubscriptionValid(int id) {
        return false;
    }
}
