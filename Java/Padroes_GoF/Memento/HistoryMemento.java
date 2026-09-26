package Padroes_GoF.Memento;
import java.util.List;
import java.util.ArrayList;

public class HistoryMemento {

    private List<VehicleMemento> memento = new ArrayList<>();

    public VehicleMemento undo() {
        if (this.memento.size() > 0) {
            VehicleMemento memento = this.memento.get(this.memento.size() - 1);
            this.memento.remove(memento);
            return memento;
        }
        return null;
    }
    public void save(VehicleMemento memento) {
        this.memento.add(memento);
    }
    
}
