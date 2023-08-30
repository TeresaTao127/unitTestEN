package L11Example.Groupby;

import L11Example.Groupby.TreatmentType;

public class Treatment {
    private final TreatmentType type;
    private final String illness;

    // ...
    public Treatment(TreatmentType type, String illness) {
        this.type = type;
        this.illness = illness;
    }

    public TreatmentType getType() {
        return type;
    }

    public String getIllness() {
        return illness;
    }

    @Override
    public String toString() {
        return "Treatment{" +
                "type=" + type +
                ", illness='" + illness + '\'' +
                '}';
    }
// ...
}
