package L11Example.Groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static L11Example.Groupby.TreatmentType.*;

public class GroupByExample {
    public static void main(String[] args) {
        Treatment fluTreatment = new Treatment(CONSERVATIVE, "flu");
        Treatment coronaTreatment = new Treatment(CONSERVATIVE, "corona");
        Treatment cancerTreatment = new Treatment(PALLIATIVE, "cancer");
        Treatment appendixTreatment = new Treatment(SURGICAL, "appendix");
        Treatment bypassesTreatment = new Treatment(SURGICAL, "bypasses");
        Treatment runnyNoseTreatment = new Treatment(CONSERVATIVE, "runny Nose");

        List<Treatment> treatments = Arrays.asList(fluTreatment, coronaTreatment, cancerTreatment, appendixTreatment, bypassesTreatment, runnyNoseTreatment);
        Map<TreatmentType, List<Treatment>> groupedTreatments
                = treatments.stream().collect(Collectors.groupingBy(Treatment::getType));

        System.out.println(groupedTreatments);

    }
}
